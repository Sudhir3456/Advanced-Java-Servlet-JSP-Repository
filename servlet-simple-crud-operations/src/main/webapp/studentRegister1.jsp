<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Register Page</title>

<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background: linear-gradient(135deg, #6a11cb, #2575fc);
}

div {
    	display: flex;
     
	align-items: center;

 }

.container {
	background: #fff;
	padding: 25px;
	border-radius: 10px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
	width: 400px;
	text-align: center;
    display: flex;
	
}

.input-group {
	margin-bottom: 15px;
	text-align: left;
}

.input-group label {
	display: block;
	font-weight: 500;
	margin-bottom: 5px;
    display: flex;
	
}

.input-group input {
	width: 100%;
	padding: 1px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
	transition: 0.3s;
}

.input-group input:focus {
	border-color: #4facfe;
	outline: none;
	box-shadow: 0 0 5px rgba(79, 172, 254, 0.5);
}



</style>


</head>
<body>

	<div class="container">

		<form action="studentRegister" method="get">

			<div class="input-group">
				<label>ID:</label><br> <input type="number"
					placeholder="Enter the student Id" name="id"><br>
			</div>
			<div class="input-group">
				<label>Name:</label><br> <input type="text"
					placeholder="Enter the student Name" name="name"><br>
			</div>
			<div class="input-group">
				<label>Email:</label><br> <input type="email"
					placeholder="Enter the student Email" name="email"><br>
			</div>
			<div class="input-group">
				<label>TeliPhone:</label><br> <input type="tel"
					placeholder="Enter the student TeliPhone" name="tel"><br>
			</div>
			<div class="input-group">
				<label>Password:</label><br> <input type="password"
					placeholder="Enter the student Password" name="password"><br>
			</div>
			<div class="input-group">
				<label>Gender:</label><br> <input type="radio" name="male"
					value="male">Male<br> <input type="radio"
					name="female" value="female">Female<br> <input
					type="radio" name="other" value="other">Others<br>
			</div>
 			
			 <input type="submit" name="register">
			
		</form>

	</div>

 

</body>
</html>