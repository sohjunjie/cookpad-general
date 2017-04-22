package com.general.dao;

import java.util.List;

import com.general.model.user.CookpadUser;

public interface CookpadUserDao {
	
	public void add(CookpadUser authUser);
	public void edit(CookpadUser authUser);
	public CookpadUser getCookpadUser(int userId);
	public List<CookpadUser> getAllCookpadUser();

}
