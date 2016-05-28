package com.venus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.venus.api.service.UserService;
import com.venus.common.dto.AuthUserDto;
import com.venus.common.dto.CreateUserDto;
import com.venus.common.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public ResponseEntity<List<UserDto>> getUsers() {

		List<UserDto> users = userService.findAll();
		if (users.isEmpty()) {

			return new ResponseEntity<List<UserDto>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<UserDto>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/createUser",headers="Accept=*/*", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody CreateUserDto createUser, UriComponentsBuilder ucBuilder) {

		if (userService.exist(createUser.getEmail())) {

			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		userService.save(createUser);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(createUser.getUserName()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/findUserBy/{conditionFilter}", method = RequestMethod.GET)
	public ResponseEntity<UserDto> getUser(@PathVariable("conditionFilter") String conditionFilter ,@RequestParam ("value") String value) {

		UserDto user = userService.findByUserId(Long.parseLong(value));
		if (user == null) {

			return new ResponseEntity<UserDto>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/authByEmail", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthUserDto> auth(@RequestParam("email") String email) {

		AuthUserDto user = userService.auth(email);
		if (user == null) {

			return new ResponseEntity<AuthUserDto>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<AuthUserDto>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteByUserId", method = RequestMethod.DELETE)
	public ResponseEntity<Long> deleteUser(@RequestParam("userId") String userId) {
	
		long count = userService.delete(Long.parseLong(userId));
		if (count == 0) {

			return new ResponseEntity<Long>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Long>(HttpStatus.NO_CONTENT);
	}
}
