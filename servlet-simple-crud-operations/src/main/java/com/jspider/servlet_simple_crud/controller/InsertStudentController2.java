package com.jspider.servlet_simple_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InsertStudentController2 implements Servlet {

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
 
		PrintWriter out = res.getWriter();	

		
		 String fullName = req.getParameter("fullName");
		 String email = req.getParameter("email");
		 String password =req.getParameter("password");
 		 Long phone = Long.parseLong( req.getParameter("phone"));

 		
		 
		 System.out.println(fullName);
		 System.out.println(email);
		 System.out.println(password);

		 System.out.println(phone);
		 
		System.out.println("Students Sucessfully...");
		
		
		
		
		
		

		Connection connection;
		try {
			// Step1- load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
  
		     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-m12", "root", "Sudhir@0108");

 
			// Step3- Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement("insert into register1 values(?,?,?,?)");

			 
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			preparedStatement.setLong(4, phone);
 			 
		int satus = preparedStatement.executeUpdate();
			

			if (satus > 0) {
				
                 res.setContentType("text/html");
                 out.print("<h3 style='color:green' text-align='top'> user registerd successfully </h3>");
                 
                 RequestDispatcher requestDispatcher = req.getRequestDispatcher("/RegistrationForm.jsp");
                 requestDispatcher.include(req, res);
                 
				System.out.println("data inserted in table");

			} else {
				 res.setContentType("text/html");
                 out.print("<h3 style='color:red' text-align='top'> user Not registerd successfully </h3>");
                 
                 RequestDispatcher requestDispatcher = req.getRequestDispatcher("/RegistrationForm.jsp");
                 requestDispatcher.include(req, res);
                 
			}

		} catch (ClassNotFoundException | SQLException e) {
			
			
			e.printStackTrace();
			
			 res.setContentType("text/html");
             out.print("<h3 style='color:red' text-align='top'>Exception Occured : "+e.getMessage()+"</h3>");
             
             RequestDispatcher requestDispatcher = req.getRequestDispatcher("/RegistrationForm.jsp");
             requestDispatcher.include(req, res);
             
		}
 
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




/*
 * 
  
 <servlet>
  	<servlet-class>com.jspider.servlet_simple_crud.controller.InsertStudentController2</servlet-class>
  	<servlet-name>firstServlet</servlet-name>
  </servlet>
  <servlet-mapping>
  	<servlet-name>firstServlet</servlet-name>
  	<url-pattern>/RegistrationForm</url-pattern>
  </servlet-mapping>
 * 
 */




