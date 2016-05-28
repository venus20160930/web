package com.venus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.venus.api.service.RoleService;
import com.venus.common.dto.RoleDto;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/getAllRole", method = RequestMethod.GET)
	public ResponseEntity<List<RoleDto>> getRoles() {

		
		
		List<RoleDto> roles = roleService.findAll();
		if (roles.isEmpty()) {

			return new ResponseEntity<List<RoleDto>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<RoleDto>>(roles, HttpStatus.OK);
		
		
		//return null;
	}

}
