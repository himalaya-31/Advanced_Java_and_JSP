package com.mvcsproject.service;

import com.mvcsproject.dao.UserDetailsDao;
import com.mvcsproject.entity.UserDetailsEntity;

public class UserDetailsService {
	
	UserDetailsDao userDetailsDao = new UserDetailsDao();
	
	//check existing user
	public boolean checkIfUserAlreadyExist(String email){
		return userDetailsDao.check(email);
	}
	
	//Add new user
	public void registerUser(String name, String pass, String email){
		UserDetailsEntity user = new UserDetailsEntity(email, name, pass, "user", true, "form");
		userDetailsDao.save(user);
	}
	
	//new password
	public void updatePassword(String string){
		userDetailsDao.updatePassword();
	}
}
