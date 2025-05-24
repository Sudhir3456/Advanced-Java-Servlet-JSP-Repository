<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <%
      String massage =(String)request.getAttribute("msg");
      
     if(massage!=null) {
  
  %>
  
  <h4 style="color: green"> <%= massage %></h4>
  
<%} %>
   
   <h4>Welcome to login page</h4>
   
   
   
       <form action="LoginForm" method="post">

   
            Email : <input type="text" name="email1" /> <br/> <br/>
            Password : <input type="password" name="pass1" /> <br/> <br/>
             <input type="submit" value="Login" />
   
 
         </form>
   
   
   
   
</body>
</html>