package com.venus.frontend.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UsersConnectionRepository;

import com.venus.common.dto.AuthUserDto;
import com.venus.common.dto.UserDto;
import com.venus.frontend.service.UserService;

public class VenusUsersConnectionRepository implements UsersConnectionRepository {

	private ConnectionSignUp connectionSignUp;
	
	@Autowired
	private UserService userService;
	
	/**
	 * The command to execute to create a new local user profile in the event no user id could be mapped to a connection.
	 * Allows for implicitly creating a user profile from connection data during a provider sign-in attempt.
	 * Defaults to null, indicating explicit sign-up will be required to complete the provider sign-in attempt.
	 * @param connectionSignUp a {@link ConnectionSignUp} object
	 * @see #findUserIdsWithConnection(Connection)
	 */
	public void setConnectionSignUp(ConnectionSignUp connectionSignUp) {
		this.connectionSignUp = connectionSignUp;
	}
	
	public List<String> findUserIdsWithConnection(Connection<?> connection) {
		/*
		 * ConnectionKey key = connection.getKey();
		List<String> localUserIds = jdbcTemplate.queryForList("select userId from " + tablePrefix + "UserConnection where providerId = ? and providerUserId = ?", String.class, key.getProviderId(), key.getProviderUserId());		
		if (localUserIds.size() == 0 && connectionSignUp != null) {
			String newUserId = connectionSignUp.execute(connection);
			if (newUserId != null)
			{
				createConnectionRepository(newUserId).addConnection(connection);
				return Arrays.asList(newUserId);
			}
		}
		return localUserIds;
	
		 */
		
		String email = connection.fetchUserProfile().getEmail();
		
		List<String> test = new ArrayList<String>();
		test.add(email);

		return test;
	}

	public Set<String> findUserIdsConnectedTo(String providerId, Set<String> providerUserIds) {
		return null;
	}

	public ConnectionRepository createConnectionRepository(String userId) {
		
		return new VenusConnectionRepository();
		//return null;
	}
	

}
