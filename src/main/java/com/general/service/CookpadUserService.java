package com.general.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.general.model.user.CookpadUser;

public interface CookpadUserService {

	public CookpadUser getCookpadUser(int userId);
	public List<CookpadUser> getAllCookpadUser();
	
	public String serializeToUserMixin(Object o) throws JsonProcessingException;
	
	public ResponseEntity<?> getSerializedUser(int userId);
	
	public ResponseEntity<?> getAllSerializedUser();

}
