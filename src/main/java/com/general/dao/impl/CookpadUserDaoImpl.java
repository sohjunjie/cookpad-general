package com.general.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.general.dao.CookpadUserDao;
import com.general.model.user.CookpadUser;

@Repository
public class CookpadUserDaoImpl implements CookpadUserDao {

	@Autowired
	private SessionFactory session;
	

	@Override
	public void add(CookpadUser authUser) {
		session.getCurrentSession().save(authUser);
	}

	@Override
	public void edit(CookpadUser authUser) {
		session.getCurrentSession().update(authUser);
	}

	@Override
	public CookpadUser getCookpadUser(int userId) {
		return (CookpadUser) session.getCurrentSession().get(CookpadUser.class, userId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CookpadUser> getAllCookpadUser() {
		return session.getCurrentSession().createQuery("from CookpadUser").list();
	}



}