package com.venus.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.venus.backend.dto.AuthUserDto;
import com.venus.backend.service.UserService;

@Service
public class LoginUserService implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		AuthUserDto user = userService.auth(email);
		
		if (user == null) {
  
            throw new UsernameNotFoundException("Username not found"); 
        }
		
		return new User(email, 
						user.getPassword(), 
						BooleanUtils.toBooleanObject(Integer.parseInt(user.getState())), 
						true, 
						true, 
						true, 
						getGrantedAuthorities(user));
	}

	private List<GrantedAuthority> getGrantedAuthorities(AuthUserDto authUser) {
		
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
        for(String roleName : authUser.getRoles()) {
        	
            authorities.add(new SimpleGrantedAuthority("ROLE_" + roleName));
        }

        return authorities;
    }
}
