package com.venus.frontend.component;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvComponent {

	@Autowired
	private Environment env;
	
	public String getUserUri() {
		
		return StringUtils.join(getApiUri(), "user/");
	}
	
	public String getAuthUri() {
		
		return StringUtils.join(getUserUri(), "auth/");
	}
	
	public String getRoleUri() {
		
		return StringUtils.join(getApiUri(), "role/");
	}
	
	private String getApiUri() {
		
		return StringUtils.join(env.getProperty("webapi.address"),
				env.getProperty("webapi.name"), "/");
	}
}
