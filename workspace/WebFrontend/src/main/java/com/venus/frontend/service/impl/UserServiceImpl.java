package com.venus.frontend.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.venus.frontend.dto.AuthUserDto;
import com.venus.frontend.dto.UserDto;
import com.venus.frontend.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public List<UserDto> findUsers() {

		return converMap(restTemplate.getForObject(
				envComponent.getUserUri(), List.class), UserDto.class);
	}

	
	public AuthUserDto auth(String userName) {
		
		return restTemplate.getForObject(StringUtils.join(
				envComponent.getAuthUri(), userName, "/"), AuthUserDto.class);
	}
	
	
}
