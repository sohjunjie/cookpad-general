package com.general.dao;

import java.util.List;

import com.general.model.user.CookpadUser;

public interface AuthenticatedUserDao {
	
	public void add(CookpadUser authUser);
	public void edit(CookpadUser authUser);
	public CookpadUser getAuthUser(int userId);
	public List<CookpadUser> getAllAuthUser();

}
