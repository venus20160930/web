package com.venus.backend.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.venus.backend.dto.AuthUserDto;
import com.venus.backend.dto.CreateUserDto;
import com.venus.backend.dto.UserDto;
import com.venus.backend.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public List<UserDto> findUsers() {

		return converMap(restTemplate.getForObject(
				envComponent.getUserUri(), List.class), UserDto.class);
	}

	public void save(CreateUserDto user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		restTemplate.postForLocation(
				envComponent.getUserUri(), user, CreateUserDto.class);
	}
	
	public CreateUserDto findByUserName(String userName) {
		
		return restTemplate.getForObject(StringUtils.join(
				envComponent.getUserUri(), userName), CreateUserDto.class);
	}

	public AuthUserDto auth(String userName) {
		
		return restTemplate.getForObject(StringUtils.join(
				envComponent.getAuthUri(), userName, "/"), AuthUserDto.class);
	}
	
	
}
