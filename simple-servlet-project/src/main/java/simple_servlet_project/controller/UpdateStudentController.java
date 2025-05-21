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
		String password = req.getParameter("password");
 
		System.out.println(fullName);
		System.out.println(email);
		System.out.println(password);

 
		StudentDao dao = new StudentDao();
		Student student = new Student();

		student.setName(fullName);
		student.setEmail(email);
		student.setPassword(password);
 
		Student student2 = dao.updateStudentById(student);
		
 
		PrintWriter pw = res.getWriter();

		if (student2 != null) {

			req.setAttribute("msg", "You are sucessfully Updated!!");

			// pw.write("<html><body><h4 style='color:green;'> Data inserted
			// </h4></body></html>");

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
