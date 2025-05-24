package com.jspider.servlet_simple_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController extends HttpServlet
{
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		resp.setContentType("text/html");
		
		      PrintWriter out = resp.getWriter();
		
		      String  myemail = req.getParameter("email1");
		      String  mypass = req.getParameter("pass1");

		  	Connection connection;
			try {
				// Step1- load or register driver
				Class.forName("com.mysql.cj.jdbc.Driver");
	  
			     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-m12", "root", "Sudhir@0108");

	 
				// Step3- Create Statement
				PreparedStatement preparedStatement = connection.prepareStatement("select * from register1 where email=? and password=?");

				 
				preparedStatement.setString(1, myemail);
				preparedStatement.setString(2, mypass);
				 
			ResultSet rs = preparedStatement.executeQuery();
				

				if (rs.next()) {
					
					     HttpSession session = req.getSession();
					     session.setAttribute("session_name",rs.getString("fullName"));
 	                 
	                 RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profile.jsp");
	                 requestDispatcher.include(req, resp);
	                 
 
				} else {
 	                 out.print("<h3 style='color:red'>Email id and Password does't matched </h3>");
	                 
	                 RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Student-Login.jsp");
	                 requestDispatcher.include(req, resp);
	                 
				}

			} catch (ClassNotFoundException | SQLException e) {
				
				
				e.printStackTrace();
				
 	             out.print("<h3 style='color:red'>Exce[tion Occured : "+e.getMessage()+"</h3>");
	             
	             RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Student-Login.jsp");
	             requestDispatcher.include(req, resp);
	             
			}
	 
		}

		
		
	}
