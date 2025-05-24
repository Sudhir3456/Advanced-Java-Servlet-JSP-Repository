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
     
    public long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
%>

<%
     
    int number = 5; // You can change this value
    long result = calculateFactorial(number);
%>

<h2>Factorial of <%= number %> is: <%= result %></h2>  

  

</body>
</html>