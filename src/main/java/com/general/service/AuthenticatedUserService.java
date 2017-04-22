package com.general.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.general.model.user.CookpadUser;

public interface AuthenticatedUserService {

	public void add(CookpadUser authUser);
	public void edit(CookpadUser authUser);

	@SuppressWarnings("rawtypes")
	public ResponseEntity getAuthUser(int userId);
	
	public List<CookpadUser> getAllAuthUser();

}
