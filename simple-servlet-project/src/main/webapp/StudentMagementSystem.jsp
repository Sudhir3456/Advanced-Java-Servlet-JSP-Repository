<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.*" %>
<%
    //String page = request.getParameter("page");
    if (page == null) {
        page = "home";
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Management System</title>
    <style>
        /* Reset and basic styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f4f4;
        }

        /* Header/Nav Bar */
        header {
            background-color: #2c3e50;
            color: #fff;
            padding: 15px 0;
        }
        .container {
            width: 90%;
            margin: auto;
            overflow: hidden;
        }
        .logo {
            float: left;
            font-size: 24px;
            font-weight: bold;
        }
        nav {
            float: right;
        }
        nav ul {
            list-style: none;
        }
        nav ul li {
            display: inline-block;
            margin-left: 20px;
        }
        nav ul li a {
            color: #fff;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s;
        }
        nav ul li a:hover {
            color: #1abc9c;
        }

        /* Welcome Section */
        .welcome {
            padding: 100px 20px;
            background: linear-gradient(to right, #1abc9c, #16a085);
            text-align: center;
            color: white;
        }
        .welcome h1 {
            font-size: 40px;
            margin-bottom: 20px;
        }
        .welcome p {
            font-size: 20px;
            margin-bottom: 30px;
        }
        .welcome a {
            padding: 12px 25px;
            background: #fff;
            color: #16a085;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s;
        }
        .welcome a:hover {
            background: #ecf0f1;
        }

        /* Footer */
        footer {
            background-color: #2c3e50;
            color: #fff;
            text-align: center;
            padding: 15px 0;
            position: fixed;
            width: 100%;
            bottom: 0;
        }

        /* Main Section (Optional Page Load) */
        .main-section {
            padding: 40px;
        }
    </style>
</head>
<body>

    <!-- Header Section -->
    <header>
        <div class="container">
            <div class="logo">Student Management</div>
            <nav>
                <ul>
                    <li><a href="index.jsp?page=home">Home</a></li>
                    <li><a href="index.jsp?page=register">Register</a></li>
                    <li><a href="index.jsp?page=login">Login</a></li>
                    <li><a href="index.jsp?page=view">View Students</a></li>
                </ul>
            </nav>
            <div style="clear: both;"></div>
        </div>
    </header>

    <!-- Dynamic Body Section -->
    <div class="main-section">
        <%
            if ("home".equals(page)) {
        %>
                <div class="welcome">
                    <h1>Welcome to the Student Management System</h1>
                    <p>Manage student data efficiently and smartly.</p>
                    <a href="index.jsp?page=register">Get Started</a>
                </div>
        <%
            } else {
        %>
                <jsp:include page="<%= page %>.jsp" />
        <%
            }
        %>
    </div>

    <!-- Footer -->
    <footer>
        <p>&copy; 2025 Student Management System. All rights reserved.</p>
    </footer>

</body>
</html>