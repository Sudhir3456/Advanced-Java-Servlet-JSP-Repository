<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>This is First Jsp</h3>

	<%
   
          int a = 10;
   
         out.print(a);
      
         for(int i=1; i<=10;i++)
        	 
         {
        	 %> 
        	 
        		<h4 style="color: red;"> <%out.print(i); %> </h4>
        		
        		
        		<%=i %> 
        		
        	 
      <%   } %> 
      
      
      <%! public int addTwoNumber(int a, int b){
    	  
    	  
    	  return a + b;
      }
      
   
      %>  
      
      <% int sum = addTwoNumber(20, 30); %> 
   
    
   


</body>
</html>