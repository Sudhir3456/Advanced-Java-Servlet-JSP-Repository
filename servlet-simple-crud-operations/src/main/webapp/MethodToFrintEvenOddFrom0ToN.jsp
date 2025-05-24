<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



 
	<h2>Numbers from 0 to 30: Using while Loop</h2>


	<%
	int num = 0;

	while (num <= 30) {
		if (num % 2 == 0) {
			out.println("<span style='color:green;'>" + num + " is Even Number" + "</span> <br></br>");
		} else {
			out.println("<span style='color:red;'>" + num + " is Odd Number" + "</span> <br></br> ");
		}
		num++;
	}
	
	%>



	<h2>Numbers from 0 to 30: Using For Loop</h2>

	<%
	     for (int n = 0; num <= 30; num++) {
		if (num % 2 == 0) {
			out.println("<span style='color:green;'>" + num + " is Even Number" + "</span> <br></br>");
		} else {
			out.println("<span style='color:red;'>" + num + " is Odd Number" + "</span> <br></br> ");
		}
	}
	%>









</body>
</html>