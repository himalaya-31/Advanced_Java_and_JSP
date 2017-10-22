package com.osahub.mvcproject.service;

import com.osahub.mvcproject.dao.UserDetailsDao;
import com.osahub.mvcproject.entity.UserDetailsEntity;

public class UserDetailsServie {

	UserDetailsDao userDetailsDao = new UserDetailsDao();

	
	public boolean checkIfUserAlreadyExist(String uID) {

		return userDetailsDao.check(uID);

	}

	
	
	public void registerUser(String name, String uID, String pass) {

		UserDetailsEntity user = new UserDetailsEntity(uID, name, pass, "user", true,"form");
		 userDetailsDao.save(user);

	}



	public void updatePassword(String string) {
		
		userDetailsDao.updatePassword();
		
	}



	

}
