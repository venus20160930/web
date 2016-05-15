package com.venus.backend.service;

import java.util.List;

import com.venus.backend.dto.AuthUserDto;
import com.venus.backend.dto.CreateUserDto;
import com.venus.backend.dto.UserDto;


public interface UserService {

	public List<UserDto> findUsers();
	
	public void save(CreateUserDto user);
	
	public CreateUserDto findByUserName(String userName);
	
	public AuthUserDto auth(String userName);
}
