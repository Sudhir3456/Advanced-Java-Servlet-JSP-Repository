<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FactorialCalculation</title>
</head>
<body>

      <h2>Factorial Calculation in JSP</h2>

    <%--Define the factorial method --%>
    <%! 
        public long calculateFactorial(int num) {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    %>

    <%-- Define a number at compile time and call the method --%>
    <%
        int number = 5;  
        long result = calculateFactorial(number);
    %>

    <%-- Display the result --%>
    <p>The factorial of <%= number %> is: <%= result %></p>

</body>
</html>