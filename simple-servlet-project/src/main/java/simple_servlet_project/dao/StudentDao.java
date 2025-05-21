package simple_servlet_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import simple_servlet_project.controller.connection.StudentConnection;
import simple_servlet_project.controller.entity.Student;

public class StudentDao {

	Connection connection = StudentConnection.getStudentConnection();

	String insertStudentQuery = "insert into register1 values(?,?,?,?)";

	public Student saveStdentDao(Student student) {

		try {

			PreparedStatement ps = connection.prepareStatement(insertStudentQuery);

			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPassword());
			ps.setLong(4, student.getPhone());

			int status = ps.executeUpdate();

			if (status != 0) {

				System.out.println("data inserted");
				return student;
			} else {

				System.out.println("data  not inserted");
				return null;

			}

		} catch (SQLException e) {

			e.printStackTrace();

			return null;
		}

	}

	// Get Student by Email--

	String displayStudentByEmailQuery = "select * from register1 where email=?";

	public Student getStdentByEmailDao(String email) {

		try {
			PreparedStatement ps = connection.prepareStatement(displayStudentByEmailQuery);

			ps.setString(1, email);

			ResultSet set = ps.executeQuery();

			if (set.next()) {

				String emailId = set.getString("email");
				String password = set.getString("password");

				Student student = new Student();

				student.setEmail(emailId);
				student.setPassword(password);

				return student;

			} else {

				System.out.println("data  not inserted");
				return null;

			}

		} catch (SQLException e) {

			e.printStackTrace();

			return null;
		}

	}

	// Display student By phone---------------
	String displayStudentByPhoneQuery = "select * from register1 where phone=?";

	public Student displayStdentByPhoneDao(Long phone) {

		try {
			PreparedStatement ps = connection.prepareStatement(displayStudentByPhoneQuery);

			ps.setLong(1, phone);

			ResultSet set = ps.executeQuery();

			if (set.next()) {

				String name = set.getString("fullName");
				String email = set.getString("email");
				String password = set.getString("password");
				Long phone1 = set.getLong("phone");

				Student student = new Student();

				student.setName(name);
				student.setEmail(email);
				student.setPassword(password);
				student.setPhone(phone1);

				return student;

			} else {

				System.out.println("data  not inserted");
				return null;

			}

		} catch (SQLException e) {

			e.printStackTrace();

			return null;
		}

	}

	// Display All Student From databases

	String selectAllStudentQuery = "select * from register1";

	public List<Student> displayAllStdentDao() {

		try {
			PreparedStatement ps = connection.prepareStatement(selectAllStudentQuery);

			ResultSet set = ps.executeQuery();

			List<Student> students = new ArrayList<Student>();

			while (set.next()) {

				String name = set.getString("fullName");
				String email = set.getString("email");
				String password = set.getString("password");
				Long phone = set.getLong("phone");

				Student student = new Student();

				student.setName(name);
				student.setEmail(email);
				student.setPassword(password);
				student.setPhone(phone);

				students.add(student);

			}

			return students;

		} catch (SQLException e) {

			e.printStackTrace();

			return null;
		}

	}

	public int deleteStudentByEmail(String email) {

		String sql = "delete from register1 where email=?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, email);
			return ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}

	}

	/*
	 * 
	 * 
	 * public int deleteStudentByEmail(String email) {
	 * 
	 * String sql = "delete from register1 where email=?";
	 * 
	 * try { PreparedStatement ps = connection.prepareStatement(sql);
	 * ps.setString(1, email); return ps.executeUpdate();
	 * 
	 * } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); return 0; }
	 * 
	 * }
	 */

	// Updated

	String sql = "UPDATE register1 SET fullName=?, email=?,password=? WHERE email=?";

	public Student updateStudentById(Student student) {

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPassword());
			

			ps.setString(4, student.getEmail());

			int satus = ps.executeUpdate();

			if (satus != 0) {

				String msg = "data Updated From the table";
				return student;

			} else {
				System.out.println("data not Updated From the table");
				return null;
			}

		} catch (SQLException e) {

			e.printStackTrace();

			return null;
		}

	}

}
