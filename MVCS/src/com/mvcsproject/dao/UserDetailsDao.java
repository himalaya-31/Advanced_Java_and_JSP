package com.mvcsproject.dao;

import com.mvcsproject.entity.UserDetailsEntity;
import static com.mvcsproject.service.OfyService.ofy;

public class UserDetailsDao {
	static UserDetailsEntity ud = null;
	
	//Add new user
	public void save(UserDetailsEntity ude){
		ofy().save().entity(ude);
		ofy().clear();
	}
	
	//Check existing user
	public boolean check (String email){
		UserDetailsEntity ude = ofy().load().type(UserDetailsEntity.class).id(email).now();
		
		if(ude != null)
			return true;
		else
			return false;
	}
	
	public void updatePassword(){
		
	}
}
