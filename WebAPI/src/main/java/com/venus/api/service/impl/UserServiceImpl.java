package com.venus.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venus.api.domain.AuthUserDto;
import com.venus.api.domain.CreateUserDto;
import com.venus.api.domain.ResponseUserDto;
import com.venus.api.repository.UserProfileRepository;
import com.venus.api.repository.UsersRepository;
import com.venus.api.repository.entity.Roles;
import com.venus.api.repository.entity.UserProfile;
import com.venus.api.repository.entity.Users;
import com.venus.api.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseService implements UserService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	public List<ResponseUserDto> findAll() {

		List<Users> listUsers =(List<Users>) usersRepository.findAll();
		
		List<ResponseUserDto> listResponseUserDto = new ArrayList<ResponseUserDto>();
		
		ResponseUserDto responseUserDto ;
		
		for (Users user : listUsers) {
			responseUserDto = new ResponseUserDto();
			responseUserDto.setEmail(user.getEmail());
			if (user.getUserProfile() != null) {
				responseUserDto.setFirstName(user.getUserProfile().getFirstName());
				responseUserDto.setLastName(user.getUserProfile().getLastName());
				responseUserDto.setPhone(user.getUserProfile().getPhone());
			}
			
			listResponseUserDto.add(responseUserDto);
			
		}
		
		
		return listResponseUserDto;
	}

	public void save(CreateUserDto createUser) {
		
		UserProfile profile = (UserProfile) convertComponent.toObject(
				createUser, UserProfile.class);
		
		userProfileRepository.save(profile);
		
		Users user = (Users) convertComponent.toObject(
				createUser, Users.class);
		user.setUserId(profile.getUserId());
		
		usersRepository.save(user);
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
			userProfileRepository.delete(userId);
			count++;
		}
		
		return count;
	}

	public ResponseUserDto findByUserId(Long userId) {
		
		return (ResponseUserDto) convertComponent.toObject(
				userProfileRepository.findOne(userId), ResponseUserDto.class); 
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
