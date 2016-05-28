package com.venus.frontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SocialLoginUserService implements SocialUserDetailsService {

	@Autowired
	private UserDetailsService userDetailsService;
	
	public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException {
		
		UserDetails userDetails = userDetailsService.loadUserByUsername(userId);
		return new SocialUser(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
	}

}
