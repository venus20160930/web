package com.venus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.venus.api.domain.ResponseRoleDto;
import com.venus.api.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/role/", method = RequestMethod.GET)
	public ResponseEntity<List<ResponseRoleDto>> getRoles() {

		List<ResponseRoleDto> users = roleService.findAll();
		if (users.isEmpty()) {

			return new ResponseEntity<List<ResponseRoleDto>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<ResponseRoleDto>>(users, HttpStatus.OK);
	}

}
