package com.jspiders.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.services.SignUpService;

@WebServlet(urlPatterns="/signup")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("Do post() executed");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		Long phn = Long.parseLong(request.getParameter("phn"));
		
		SignUpService s1 = new SignUpService();
		s1.trySignup(name, email, phn);
		
	}
}
