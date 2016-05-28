package com.venus.api.service;

import java.util.List;

import com.venus.common.dto.AuthUserDto;
import com.venus.common.dto.CreateUserDto;
import com.venus.common.dto.UserDto;


public interface UserService {

	public List<UserDto> findAll();
	
	public void save(CreateUserDto createUser);
	
	public boolean exist(Long userId);
	
	public boolean exist(String email);
	
	public long delete(Long userId);
	
	public UserDto findByUserId(Long userId);
	
	public AuthUserDto auth(String email);
}
