package com.venus.api.service;

import java.util.List;

import com.venus.api.domain.AuthUserDto;
import com.venus.api.domain.CreateUserDto;
import com.venus.api.domain.ResponseUserDto;

public interface UserService {

	public List<ResponseUserDto> findAll();
	
	public void save(CreateUserDto createUser);
	
	public boolean exist(Long userId);
	
	public boolean exist(String email);
	
	public long delete(Long userId);
	
	public ResponseUserDto findByUserId(Long userId);
	
	public AuthUserDto auth(String email);
}
