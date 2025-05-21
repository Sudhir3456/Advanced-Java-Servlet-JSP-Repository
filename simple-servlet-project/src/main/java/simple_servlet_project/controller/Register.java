package simple_servlet_project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 


@WebServlet("/regForm")
public class Register extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
	PrintWriter out = response.getWriter();	
		
	String myname = request.getParameter("name1");
	String myemail = request.getParameter("email1");
	String mypass = request.getParameter("pass1");
	String mygender = request.getParameter("gender1");
	String mycity = request.getParameter("city1");
 

		Connection connection;
		try {
			// Step1- load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
  
		     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-m12", "root", "Sudhir@0108");

 
			// Step3- Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement("insert into register values(?,?,?,?,?)");

			 
			preparedStatement.setString(1, myname);
			preparedStatement.setString(2, myemail);
			preparedStatement.setString(3, mypass);
			preparedStatement.setString(4, mygender);
			preparedStatement.setString(5, mycity);
			 
		int satus = preparedStatement.executeUpdate();
			

			if (satus > 0) {
				
                 response.setContentType("text/html");
                 out.print("<h3 style='color:green'> user registerd successfully </h3>");
                 
                 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/register.jsp");
                 requestDispatcher.include(request, response);
                 
				System.out.println("data inserted in table");

			} else {
				 response.setContentType("text/html");
                 out.print("<h3 style='color:red'> user Not registerd successfully </h3>");
                 
                 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/register.jsp");
                 requestDispatcher.include(request, response);
                 
			}

		} catch (ClassNotFoundException | SQLException e) {
			
			
			e.printStackTrace();
			
			 response.setContentType("text/html");
             out.print("<h3 style='color:red'>Exce[tion Occured : "+e.getMessage()+"</h3>");
             
             RequestDispatcher requestDispatcher = request.getRequestDispatcher("/register.jsp");
             requestDispatcher.include(request, response);
             
		}
 
	}

	

}
