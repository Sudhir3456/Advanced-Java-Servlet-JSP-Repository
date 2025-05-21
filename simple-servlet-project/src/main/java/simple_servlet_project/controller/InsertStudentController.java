package simple_servlet_project.controller;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import simple_servlet_project.controller.entity.Student;
import simple_servlet_project.dao.StudentDao;


@WebServlet(value = "/Registration")
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
 
		PrintWriter out = res.getWriter();	

		
		 String fullName = req.getParameter("fullName");
		 String email = req.getParameter("email");
		 String password =req.getParameter("password");
 		 Long phone = Long.parseLong( req.getParameter("phone"));

 		
		 
		 System.out.println(fullName);
		 System.out.println(email);
		 System.out.println(password);
		 System.out.println(phone);
		 
		System.out.println("Students print in console Sucessfully...");
		

		StudentDao dao = new StudentDao();
		Student student = new Student();

		student.setName(fullName);
		student.setEmail(email);
		student.setPassword(password);
		student.setPhone(phone);
		
		Student student2 = dao.saveStdentDao(student);
		System.out.println("Students inserted in db Sucessfully...");
		
		System.out.println(student2);


		PrintWriter pw = res.getWriter();

		if (student2 != null) {
			
			req.setAttribute("msg", "You are sucessfully Register!!");
			
  
			//pw.write("<html><body><h4 style='color:green;'> Data inserted </h4></body></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("Student-Login.jsp");
			dispatcher.include(req, res);

		} else {

			pw.write("<html><body><h4 style='color:red;'> Data Not inserted Sothing wrong</h4></body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("RegistrationForm.jsp");
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




