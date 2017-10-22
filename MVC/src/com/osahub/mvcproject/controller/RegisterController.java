package com.osahub.mvcproject.controller;

import javax.servlet.*;
import javax.servlet.http.*;

import com.osahub.mvcproject.service.SendMailSerive;
import com.osahub.mvcproject.service.UserDetailsServie;

import java.io.*;

@SuppressWarnings("serial")
public class RegisterController extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		UserDetailsServie userDetailService = new UserDetailsServie();
		SendMailSerive sendMailSerive = new SendMailSerive();

		String name = req.getParameter("Name");
		String uID = req.getParameter("Email");
		String pass = req.getParameter("Password");

		if (userDetailService.checkIfUserAlreadyExist(uID)) {

			System.out.println("user already exist!!!");

		} else {
			System.out.println("user does not exist!!!");

			userDetailService.registerUser(name, uID, pass);

			sendMailSerive.sendWelcomeMail(name, uID, pass);
			

			res.sendRedirect("home.jsp");
		}

	}
}
