package com.jspider.servlet_simple_crud.controller;

import java.io.IOException;

import com.jspider.servlet_simple_crud.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(value = "/deleteStudent")
public class DelateStudenController extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
	
	String email =req.getParameter("id");
		
		int a= new StudentDao().deleteStudentByEmail(email);
		
		if(a!=0) {
			System.out.println(email+" given id data deleted from table");
			req.getRequestDispatcher("student-display-page.jsp").forward(req, resp);
		}
		
	}
	
	
	
	

}
