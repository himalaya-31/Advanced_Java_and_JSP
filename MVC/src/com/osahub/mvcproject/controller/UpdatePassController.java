package com.osahub.mvcproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.osahub.mvcproject.service.UserDetailsServie;

public class UpdatePassController  extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDetailsServie uds = new UserDetailsServie();
		
		uds.updatePassword("abc@uio.com");
		
	}
}
