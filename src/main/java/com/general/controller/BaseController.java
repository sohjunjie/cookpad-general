package com.general.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.general.service.AuthenticatedUserService;


@Controller
@RequestMapping(value="user")
public class BaseController {

	@Autowired
	private AuthenticatedUserService authUserService;

	@RequestMapping(value="{userId}", method=RequestMethod.GET)
	public ResponseEntity<?> getUserById(@PathVariable int userId) {
		return authUserService.getAuthUser(userId);
	}
	
}
