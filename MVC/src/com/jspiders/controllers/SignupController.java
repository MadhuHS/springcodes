package com.jspiders.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.models.User;
import com.jspiders.services.SignUpService;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
       System.out.println("this is doPost()");
       User u1 = new User();

       String phone = request.getParameter("phn");
       Long p1 = Long.parseLong(phone);
       u1.setName(request.getParameter("name"));
       u1.setEmail(request.getParameter("email"));
       u1.setPhone(p1);
       
       SignUpService s1 = new SignUpService();
       
       boolean res = s1.trySignup(u1);
       
       if(res == true)
       {
    	     RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
    	     request.setAttribute("user", u1);
    	     rd.forward(request,response);   	     
       }
       else
       {
    	     response.sendRedirect("signup.jsp");
       }
	}
}







