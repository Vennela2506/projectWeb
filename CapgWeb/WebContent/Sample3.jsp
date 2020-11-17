<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int c=1;%>
<%switch(c){ 
case 1: {%> <h1>One</h1>
<%} break;case 2:{%> <h1>Two</h1>
<%}break;case 3:{%> <h1>Three</h1>
<%}break;case 4:{%> <h1>Four</h1>
<%}break;case 5:{%> <h1>Five</h1>
<%}break;} %>

</body>
</html>