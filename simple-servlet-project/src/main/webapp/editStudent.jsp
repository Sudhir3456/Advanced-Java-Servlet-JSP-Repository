<%@page import="simple_servlet_project.dao.StudentDao"%>
<%@page import="simple_servlet_project.controller.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
			Long phone =Long.parseLong(request.getParameter("phone"));
 			Student student = new StudentDao().displayStdentByPhoneDao(phone);
		%>

	<form action="studentUpdate" method="get">

		<label>EMAIL:</label><br> <input type="text" name="name"
			value="<%=student.getName()%>"><br>
		<br> <label>EMAIL:</label><br> <input type="email"
			name="email" value="<%=student.getEmail()%>"><br>
		<br> <input type="tel" name="phone"
			value="<%=student.getPhone()%>" hidden="true"><br> <label>PASSWORD:</label><br>
		<br> <input type="password" name="password"
			value="<%=student.getPassword()%>"><br>
		<br> <input type="submit" value="UPDATE">
	</form>
</body>
</html>