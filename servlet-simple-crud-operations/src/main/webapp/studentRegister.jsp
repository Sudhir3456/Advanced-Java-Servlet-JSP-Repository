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

.container {
	background: #fff;
	padding: 25px;
	border-radius: 10px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
	width: 400px;
	text-align: center;
}

.input-group {
	margin-bottom: 15px;
	text-align: left;
}

.input-group label {
	display: block;
	font-weight: 500;
	margin-bottom: 5px;
}

.input-group input {
	width: 100%;
	padding: 8px;
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

button {
	background: #4facfe;
	color: white;
	padding: 10px;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
	width: 100%;
}

button:hover {
	background: #3a8dde;
}
</style>

</head>
<body>

	<div class="container">
		<form action="studentRegister1" method="get">

			<div class="input-group">
				<label>ID:</label> <input type="number"
					placeholder="Enter Student ID" name="id" required>
			</div>

			<div class="input-group">
				<label>Name:</label> <input type="text"
					placeholder="Enter Student Name" name="name" required>
			</div>

			<div class="input-group">
				<label>Email:</label> <input type="email"
					placeholder="Enter Student Email" name="email" required>
			</div>

			<div class="input-group">
				<label>Phone:</label> <input type="tel"
					placeholder="Enter Student Phone" name="tel" required>
			</div>

			<div class="input-group">
				<label>Password:</label> <input type="password"
					placeholder="Enter Password" name="password" required>
			</div>

			<div class="input-group">
				<label>Gender:</label> <input type="radio" name="gender"
					value="male" required> Male <input type="radio"
					name="gender" value="female" required> Female <input
					type="radio" name="gender" value="other" required> Other
			</div>

			<button type="submit" name="register">Register</button>

		</form>
	</div>

</body>
</html>