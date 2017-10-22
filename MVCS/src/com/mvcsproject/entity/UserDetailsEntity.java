package com.mvcsproject.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class UserDetailsEntity {
	@Id
	String email;
	@Index
	String name;
	String pass;
	String type;
	Boolean status;
	String source;
	
	public UserDetailsEntity(){
		
	}
	
	public UserDetailsEntity(String email, String name, String pass, String type, Boolean status, String source){
		this.email = email;
		this.name = name;
		this.pass = pass;
		this.type = type;
		this.status = status;
		this.source = source;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getPass(){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public boolean getStatus(){
		return status;
	}
	
	public void setStatus(String name){
		this.name = name;
	}
	
	public String getSource(){
		return source;
	}
	
	public void setSource(String source){
		this.source = source;
	}


}
