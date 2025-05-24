package com.jspider.servlet_simple_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jspider.servlet_simple_crud.dao.StudentDao;
import com.jspider.servlet_simple_crud.dto.Student;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InsertStudentController implements Servlet {

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
 
		
		 int id=Integer.parseInt(req.getParameter("id"));		 
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 Long phone = Long.parseLong( req.getParameter("tel"));
		 String gender = req.getParameter("gender");
		 String password = req.getParameter("password");
 

			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(gender);

		   StudentDao dao = new StudentDao();
 			
			Student student = new Student();
			
			//student.setId(id);
			student.setName(name);
			student.setEmail(email);
			student.setPhone(phone);
			student.setPassword(password);
 			
			Student student2 = dao.saveStdentDao(student);

			System.out.println("Students Sucessfully...");

			PrintWriter pw = res.getWriter();

			if (student2 != null) {

				pw.write("<html><body><h4 style='color:green;'> Data inserted </h4></body></html>");

			} else {

				pw.write("<html><body><h4 style='color:red;'> Data Not inserted Sothing wrong</h4></body></html>");

			}

			pw.write("Welcome to Home Page");
		
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
