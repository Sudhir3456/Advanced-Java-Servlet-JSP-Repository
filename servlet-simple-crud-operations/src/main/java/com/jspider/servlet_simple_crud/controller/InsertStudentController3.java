package com.jspider.servlet_simple_crud.controller;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InsertStudentController3 implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 
		
		 String fullName = req.getParameter("fullName");
		 String email = req.getParameter("email");
		 String password =req.getParameter("password");
 		 Long tel = Long.parseLong( req.getParameter("phone"));

 		 
 		 String male = req.getParameter("male");
		 String female = req.getParameter("female");
		 String other = req.getParameter("other");

 		
		 
		 System.out.println(fullName);
		 System.out.println(email);
		 System.out.println(tel);
		 
		 System.out.println(male);
		 System.out.println(female);
		 System.out.println(other);


		System.out.println("Students Sucessfully...");
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
