package com.jspider.servlet_simple_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jspider.servlet_simple_crud.dao.StudentDao;
import com.jspider.servlet_simple_crud.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(value = "/studentUpdate")
public class UpdateStudentController implements Servlet {

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

		 String fullName = req.getParameter("name");
		 String email = req.getParameter("email");
		 String password =req.getParameter("password");
		 Long phone = Long.parseLong(req.getParameter("phone"));

		
		 
		 System.out.println(fullName);
		 System.out.println(email);
		 System.out.println(password);

		 System.out.println(phone);
		 
 		

		StudentDao dao = new StudentDao();
		Student student = new Student();

		student.setName(fullName);
		student.setEmail(email);
		student.setPassword(password);
		student.setPhone(phone);
		
		Student student2 = dao.updateStudentById(student);
	 
		PrintWriter pw = res.getWriter();

		if (student2 != null) {
			
			req.setAttribute("msg", "You are sucessfully Updated!!");
			
 
			//pw.write("<html><body><h4 style='color:green;'> Data inserted </h4></body></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("student-display-page.jsp");
			dispatcher.include(req, res);

		} else {

			pw.write("<html><body><h4 style='color:red;'> Data Not inserted Sothing wrong</h4></body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("editStudent.jsp");
			dispatcher.include(req, res);


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
