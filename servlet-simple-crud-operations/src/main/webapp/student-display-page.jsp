<%@page import="com.jspider.servlet_simple_crud.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jspider.servlet_simple_crud.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
    <title>Students Display</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: auto;
        }
        th, td {
            border: 2px solid #000;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        h4 {
            text-align: center;
        }
    </style>
</head>
<body>
    <h4>Welcome to Students Display Page</h4>
    
    <%
        // Retrieve list of students from the DAO
        List<Student> students = new StudentDao().displayAllStdentDao();
    %>
    
    <table>
        <tr>
            <th>Full Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th colspan="2">Actions</th>
        </tr>
        
        <% 
            // Iterate over each student and create a table row
            if(students != null) {
                for(Student student : students) { 
        %>
        <tr>
            <td><%= student.getName() %></td>
            <td><%= student.getEmail() %></td>
            <td><%= student.getPhone() %></td>
            <td><a href="deleteStudent?id=<%=student.getEmail()%>">DELETE</a></td>
			<td><a href="editStudent.jsp?phone=<%=student.getPhone()%>">EDIT</a></td>
        </tr>
        <%      }
            } else { %>
        <tr>
            <td colspan="5">No student records found.</td>
        </tr>
        <% } %>
    </table>
</body>
</html>