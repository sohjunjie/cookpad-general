package com.general.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.general.service.CookpadUserService;

@RestController
public class BaseController {

	@Autowired
	private CookpadUserService authUserService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<?> goDefault() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	}

	@RequestMapping(value="user", method=RequestMethod.GET)
	public ResponseEntity<?> getAllUsers() {
		return authUserService.getAllSerializedUser();
	}

	@RequestMapping(value="user/{userId}", method=RequestMethod.GET)
	public ResponseEntity<?> getUserById(@PathVariable int userId) {
		return authUserService.getSerializedUser(userId);
	}

}
