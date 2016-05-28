package com.venus.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venus.api.repository.UserRoleRepository;
import com.venus.api.repository.UsersRepository;
import com.venus.api.repository.entity.Roles;
import com.venus.api.repository.entity.UserRole;
import com.venus.api.repository.entity.Users;
import com.venus.api.service.UserService;
import com.venus.common.dto.AuthUserDto;
import com.venus.common.dto.CreateUserDto;
import com.venus.common.dto.UserDto;

@Service
@Transactional
public class UserServiceImpl extends BaseService implements UserService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserRoleRepository userRoleRepository;

	public List<UserDto> findAll() {

		List<Users> listUsers =(List<Users>) usersRepository.findAll();
		
		List<UserDto> listResponseUserDto = new ArrayList<UserDto>();
		
		UserDto responseUserDto ;
		
		for (Users user : listUsers) {
			responseUserDto = new UserDto();
			responseUserDto.setEmail(user.getEmail());
			/*
			if (user.getUserProfile() != null) {
				responseUserDto.setFirstName(user.getUserProfile().getFirstName());
				responseUserDto.setLastName(user.getUserProfile().getLastName());
				responseUserDto.setPhone(user.getUserProfile().getPhone());
			}
			*/
			
			listResponseUserDto.add(responseUserDto);
			
		}
		
		
		return listResponseUserDto;
	}

	public void save(CreateUserDto createUser) {
		
		Users user = (Users) convertComponent.toObject(
				createUser, Users.class);
		user.setFullName(createUser.getFirstName() + " " + createUser.getLastName()); 
		
		usersRepository.save(user);
		
		UserRole userRole = new UserRole();
		userRole.setRoleId(createUser.getRoleId());
		userRole.setUserId(user.getUserId());
		userRoleRepository.save(userRole);
	}

	public boolean exist(Long userId) {
		
		return usersRepository.exists(userId);
	}
	
	public boolean exist(String email) {
		
		return (usersRepository.countByEmail(email) > 0);
	}

	public long delete(Long userId) {
	
		long count = 0;
		if (exist(userId)) {
			
			usersRepository.delete(userId);
			//userProfileRepository.delete(userId);
			count++;
		}
		
		return count;
	}

	public UserDto findByUserId(Long userId) {
		
		return (UserDto) convertComponent.toObject(
				usersRepository.findOne(userId), UserDto.class); 
	}

	public AuthUserDto auth(String email) {

		AuthUserDto authUser = null;
		Users user = usersRepository.findByEmail(email);
		
		if (user != null) {
		
			List<Roles> roles = user.getRoles();
			List<String> responseRoles = new ArrayList<String>(); 
			for (Roles role : roles) {
				
				responseRoles.add(role.getName());
			}
			
			authUser = (AuthUserDto) convertComponent.toObject(user, AuthUserDto.class);
			authUser.setRoles(responseRoles);

		}
				
		return authUser; 
	}
}
