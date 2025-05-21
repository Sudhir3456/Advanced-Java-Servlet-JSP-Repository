package simple_servlet_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import simple_servlet_project.controller.entity.Student;
import simple_servlet_project.dao.StudentDao;

@WebServlet(value = "/Login")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");

		Student student = new StudentDao().getStdentByEmailDao(myemail);

		if (student != null) {

			if (mypass.equals(student.getPassword())) {

				req.getRequestDispatcher("student-display-page.jsp").forward(req, resp);

			} else {

				req.setAttribute("msg", "Password is wrong");
				req.getRequestDispatcher("Student-Login.jsp").forward(req, resp);

			}

		} else {
			req.setAttribute("msg", "Email is wrong");
			req.getRequestDispatcher("Student-Login.jsp").forward(req, resp);

		}

	}
}