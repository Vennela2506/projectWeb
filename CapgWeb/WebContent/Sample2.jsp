<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int age=20; %>
<%if(age>=20){ %>
<h2>Eligible to vote</h2>
<%}else{ %>
<h2>Not Eligible</h2>
<%} %>
</body>
</html>