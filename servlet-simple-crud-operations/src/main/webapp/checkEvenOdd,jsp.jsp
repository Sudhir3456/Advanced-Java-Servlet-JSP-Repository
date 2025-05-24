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
    // Declaration Tag: Method to return a formatted number with color
    public String formatNumber(int num) {
        if (num % 2 == 0) {
            return "<span style='color:green;'>" + num + "</span>"; // Even in green
        } else {
            return "<span style='color:red;'>" + num + "</span>"; // Odd in red
        }
    }
%>

<h2>Numbers from 0 to 30:</h2>

<%
    // Scriptlet Tag: Loop through numbers 0 to 30 and print formatted output
    for (int i = 0; i <= 30; i++) {
        out.println(formatNumber(i) + " ");
    }
%>

</body>
</html>