package com.osahub.mvcproject.service;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.osahub.mvcproject.entity.UserDetailsEntity;



public class OfyService {
    static {
    	ObjectifyService.register(UserDetailsEntity.class);
    	
    	
    	
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }


    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}