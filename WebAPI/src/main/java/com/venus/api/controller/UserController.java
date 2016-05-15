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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.venus.api.domain.AuthUserDto;
import com.venus.api.domain.CreateUserDto;
import com.venus.api.domain.ResponseUserDto;
import com.venus.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<ResponseUserDto>> getUsers() {

		List<ResponseUserDto> users = userService.findAll();
		if (users.isEmpty()) {

			return new ResponseEntity<List<ResponseUserDto>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<ResponseUserDto>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/",headers="Accept=*/*", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody CreateUserDto createUser, UriComponentsBuilder ucBuilder) {

		if (userService.exist(createUser.getEmail())) {

			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		userService.save(createUser);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(createUser.getUserName()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseUserDto> getUser(@PathVariable("userId") String userId) {

		ResponseUserDto user = userService.findByUserId(Long.parseLong(userId));
		if (user == null) {

			return new ResponseEntity<ResponseUserDto>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<ResponseUserDto>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/auth/{email}", headers="Accept=*/*", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthUserDto> auth(@PathVariable("email") String email) {

		AuthUserDto user = userService.auth(email);
		if (user == null) {

			return new ResponseEntity<AuthUserDto>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<AuthUserDto>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	public ResponseEntity<Long> deleteUser(@PathVariable("userId") String userId) {
	
		long count = userService.delete(Long.parseLong(userId));
		if (count == 0) {

			return new ResponseEntity<Long>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Long>(HttpStatus.NO_CONTENT);
	}
}
