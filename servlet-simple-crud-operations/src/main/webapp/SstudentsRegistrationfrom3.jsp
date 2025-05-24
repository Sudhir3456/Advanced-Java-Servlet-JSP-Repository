<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    
    <style>
        /* Import Google Font */
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap');

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

        h2 {
            margin-bottom: 15px;
            color: #333;
        }

        .input-group {
            margin-bottom: 15px;
            text-align: left;
            position: relative;
        }

        .input-group label {
            display: block;
            font-weight: 500;
            margin-bottom: 5px;
        }

        .input-group input, 
        .input-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            transition: 0.3s;
        }

        .input-group input:focus, 
        .input-group select:focus {
            border-color: #6a11cb;
            outline: none;
            box-shadow: 0 0 5px rgba(106, 17, 203, 0.5);
        }

        .input-group .password-toggle {
            position: absolute;
            right: 10px;
            top: 35px;
            cursor: pointer;
            color: #6a11cb;
        }

        button {
            width: 100%;
            padding: 10px;
            background: #6a11cb;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }

        button:hover {
            background: #4a0ba7;
        }

        .error {
            color: red;
            font-size: 12px;
            margin-top: 5px;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Register Now</h2>
        <form action="SstudentsRegistrationfrom3" id="registrationForm">
            <div class="input-group">
                <label>Full Name</label>
                <input type="text" id="fullName" name="fullName" placeholder="Enter your full name">
                <div class="error" id="nameError"></div>
            </div>
            <div class="input-group">
                <label>Email</label>
                <input type="email" id="email" name="email" placeholder="Enter your email">
                <div class="error" id="emailError"></div>
            </div>
            <div class="input-group">
                <label>Password</label>
                <input type="password" id="password" name="password" placeholder="Enter your password">
                <span class="password-toggle" onclick="togglePassword()">👁</span>
                <div class="error" id="passwordError"></div>
            </div>
            <div class="input-group">
                <label>Phone Number</label>
                <input type="tel" id="phone" name="phone" placeholder="Enter your phone number">
                <div class="error" id="phoneError"></div>
            </div>
            <div class="input-group">
                <label>Gender</label>
                <select id="gender">
                    <option  value="" >Select</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
                <div class="error" id="genderError"></div>
            </div>
            <div class="input-group">
                <button type="submit">Register</button>
            </div>
        </form>
    </div>

    <script>
        document.getElementById("registrationForm").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent form submission
            validateForm();
        });

        function validateForm() {
            let isValid = true;

            // Get values
            let name = document.getElementById("fullName").value.trim();
            let email = document.getElementById("email").value.trim();
            let password = document.getElementById("password").value.trim();
            let phone = document.getElementById("phone").value.trim();
            let gender = document.getElementById("gender").value;

            // Name validation
            if (name === "") {
                document.getElementById("nameError").innerText = "Full name is required.";
                isValid = false;
            } else {
                document.getElementById("nameError").innerText = "";
            }

            // Email validation
            let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!email.match(emailPattern)) {
                document.getElementById("emailError").innerText = "Enter a valid email.";
                isValid = false;
            } else {
                document.getElementById("emailError").innerText = "";
            }

            // Password validation
            if (password.length < 6) {
                document.getElementById("passwordError").innerText = "Password must be at least 6 characters.";
                isValid = false;
            } else {
                document.getElementById("passwordError").innerText = "";
            }

            // Phone number validation
            let phonePattern = /^[0-9]{10}$/;
            if (!phone.match(phonePattern)) {
                document.getElementById("phoneError").innerText = "Enter a valid 10-digit phone number.";
                isValid = false;
            } else {
                document.getElementById("phoneError").innerText = "";
            }

            // Gender validation
            if (gender === "") {
                document.getElementById("genderError").innerText = "Please select a gender.";
                isValid = false;
            } else {
                document.getElementById("genderError").innerText = "";
            }

            // If form is valid, show alert
            if (isValid) {
                alert("Registration Successful!");
            }
        }

        function togglePassword() {
            let passwordField = document.getElementById("password");
            if (passwordField.type === "password") {
                passwordField.type = "text";
            } else {
                passwordField.type = "password";
            }
        }
    </script>

</body>
</html>