package com.general.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.general.dao.CookpadUserDao;
import com.general.model.user.CookpadUser;
import com.general.model.user.UserMixin;
import com.general.service.CookpadUserService;

@Service
public class CookpadUserServiceImpl implements CookpadUserService{

	@Autowired
	private CookpadUserDao authenticatedUserDao;



	@Transactional
	public CookpadUser getCookpadUser(int userId) {
		return authenticatedUserDao.getCookpadUser(userId);
	}

	@Transactional
	public List<CookpadUser> getAllCookpadUser() {
		return authenticatedUserDao.getAllCookpadUser();
	}
	
	@Override
	public String serializeToUserMixin(Object o) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		mapper.addMixInAnnotations(CookpadUser.class, UserMixin.class);
		
		ObjectWriter writer = mapper.writer();
		return writer.writeValueAsString(o);

	}
	
	@Transactional
	public ResponseEntity<String> getSerializedUser(int userId) {

		CookpadUser user = getCookpadUser(userId);
		String userJson = "";
		
		try {
			userJson = serializeToUserMixin(user);
			return new ResponseEntity<String>(userJson, HttpStatus.OK);
		} catch (JsonProcessingException e1) {
			return new ResponseEntity<String>(userJson, HttpStatus.BAD_REQUEST);
		}

	}

	@Transactional
	public ResponseEntity<String> getAllSerializedUser() {
		
		List<CookpadUser> users = getAllCookpadUser();
		String userJson = "";
		
		try {
			userJson = serializeToUserMixin(users);
			return new ResponseEntity<String>(userJson, HttpStatus.OK);
		} catch (JsonProcessingException e1) {
			return new ResponseEntity<String>(userJson, HttpStatus.BAD_REQUEST);
		}

	}


}