package com.mvcsproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcsproject.service.UserDetailsService;

public class RegisterController extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		UserDetailsService userDetailsService = new UserDetailsService();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		if(userDetailsService.checkIfUserAlreadyExist(email)){
			out.println("User Already Exist!!");
		}
		else{
			out.println("user does not exist");
			
			userDetailsService.registerUser(name, pass, email);
			
			out.println("Registration Successfull!!");
		}
	}

}
