<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! 
     public String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
%>

<%
     int number = 10; 
    String result = checkEvenOdd(number);
%>

<h2>The number <%= number %> is <%= result %>.</h2> 



//publi Student getStudentbyEmail(String Email)

//publi List<Student> getAllStudentDao()

//publi Student getStudentbyID(INT ID)




</body>
</html>