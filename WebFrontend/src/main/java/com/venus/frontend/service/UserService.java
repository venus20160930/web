package com.venus.frontend.service;

import java.util.List;

import com.venus.frontend.dto.AuthUserDto;
import com.venus.frontend.dto.UserDto;


public interface UserService {

	public List<UserDto> findUsers();
	
	public AuthUserDto auth(String userName);
}
