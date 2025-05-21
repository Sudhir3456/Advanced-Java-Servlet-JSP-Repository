<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background: linear-gradient(135deg, #4facfe, #00f2fe);
}

button:hover {
	background: #007bff;
}

.container {
	background: green;
	padding: 25px;
	border-radius: 10px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
	width: 350px;
	text-align: center;
}
</style>

</head>



<body>

	<%
	String massage = (String) request.getAttribute("msg");

	if (massage != null) {
	%>

	<h4 style="color: green">
		<%=massage%></h4>

	<%
	}
	%>



	<div class="container">

		<form action="Login" method="post">


			Email : <input type="text" name="email1" /> <br /> <br />
			Password: <input type="password" name="pass1" /> <br /> <br /> <input
				type="submit" value="Login" />


		</form>

	</div>



</body>
</html>