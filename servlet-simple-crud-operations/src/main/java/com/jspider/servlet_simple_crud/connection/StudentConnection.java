package com.jspider.servlet_simple_crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class StudentConnection {
	
	 
	public static Connection getStudentConnection()     {
 
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-m12", "root", "Sudhir@0108");


			return connection;

 
		} catch (SQLException e) {
 			e.printStackTrace();

			return null;

		}

	}


}
