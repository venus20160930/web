package com.venus.frontend.service;

import java.util.List;

import com.venus.common.dto.AuthUserDto;
import com.venus.common.dto.CreateUserDto;
import com.venus.common.dto.UserDto;


public interface UserService {

	public List<UserDto> findUsers();
	
	public void save(CreateUserDto user);
	
	public CreateUserDto findByUserName(String userName);
	
	public AuthUserDto auth(String userName);
}
