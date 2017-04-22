package com.general.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.general.dao.AuthenticatedUserDao;
import com.general.model.user.CookpadUser;
import com.general.service.AuthenticatedUserService;

@Service
public class AuthenticatedUserServiceImpl implements AuthenticatedUserService{

	@Autowired
	private AuthenticatedUserDao authenticatedUserDao;

	@Transactional
	public void add(CookpadUser authUser) {
		authenticatedUserDao.add(authUser);
	}

	@Transactional
	public void edit(CookpadUser authUser) {
		authenticatedUserDao.edit(authUser);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Transactional
	public ResponseEntity getAuthUser(int userId) {
		CookpadUser user = authenticatedUserDao.getAuthUser(userId);
		return new ResponseEntity(user, HttpStatus.OK);

	}

	@Transactional
	public List<CookpadUser> getAllAuthUser() {
		return authenticatedUserDao.getAllAuthUser();
	}


}