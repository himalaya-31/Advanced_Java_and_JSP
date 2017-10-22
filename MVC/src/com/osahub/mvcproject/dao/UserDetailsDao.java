package com.osahub.mvcproject.dao;

import java.util.Iterator;
import java.util.List;

import com.osahub.mvcproject.entity.UserDetailsEntity;
import static com.osahub.mvcproject.service.OfyService.ofy;

public class UserDetailsDao {
	static UserDetailsEntity ud=null;
	//Register
	//Add a User
	public  void save( UserDetailsEntity ude) {
		
			ofy().save().entity(ude);
			ofy().clear();
			System.out.println("Data Saved");
			
		
	}
	
	//Check Existing User
		public  boolean check(String uID) {
			UserDetailsEntity det = ofy().load().type(UserDetailsEntity.class).id(uID).now();
			
			
			if (det != null)
				return true;
			else
				return false;
		}

		public void updatePassword() {
			// TODO Auto-generated method stub
			
		}
	
	}