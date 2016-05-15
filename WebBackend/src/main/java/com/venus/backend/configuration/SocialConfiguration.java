package com.venus.backend.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ConnectController;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.connect.web.ReconnectFilter;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.security.AuthenticationNameUserIdSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.venus.backend.component.LoginAdapter;

@Configuration
@EnableTransactionManagement
@EnableSocial
@PropertySource("classpath:social.properties")
public class SocialConfiguration implements SocialConfigurer {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private LoginAdapter webSignInAdapter;
	
	public void addConnectionFactories(ConnectionFactoryConfigurer config,
			Environment env) {
		
		config.addConnectionFactory(new FacebookConnectionFactory (
				env.getProperty("facebook.appKey"), env.getProperty("facebook.appSecret")));		
	}

	public UserIdSource getUserIdSource() {
		
		return new AuthenticationNameUserIdSource();
	}

	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
		
		return new JdbcUsersConnectionRepository(dataSource, connectionFactoryLocator, Encryptors.noOpText());
	}
	
	@Bean
    public ConnectController connectController(ConnectionFactoryLocator connectionFactoryLocator, 
    		ConnectionRepository connectionRepository) {
        
		return new ConnectController(connectionFactoryLocator, connectionRepository);
    }
	
	@Bean
	public RequestCache requestCache() {
		
		return new HttpSessionRequestCache();
	}
	
	@Bean
	@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES)
	public Facebook facebook(ConnectionRepository repository) {
		
		Connection<Facebook> connection = repository.findPrimaryConnection(Facebook.class);
		return connection != null ? connection.getApi() : null;
	}
	
	@Bean 
	public ProviderSignInUtils providerSignInUtils(ConnectionFactoryLocator connectionFactoryLocator, 
			UsersConnectionRepository usersConnectionRepository) {
		
		return new ProviderSignInUtils(connectionFactoryLocator, usersConnectionRepository);
	}
	
	@Bean
	public ProviderSignInController providerSignInController(ConnectionFactoryLocator connectionFactoryLocator, 
			UsersConnectionRepository usersConnectionRepository) {
		
		return new ProviderSignInController(connectionFactoryLocator, usersConnectionRepository, webSignInAdapter);
	}

	@Bean
	public ReconnectFilter apiExceptionHandler(UsersConnectionRepository usersConnectionRepository, UserIdSource userIdSource) {
		
		return new ReconnectFilter(usersConnectionRepository, userIdSource);
	}
}
