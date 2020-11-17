<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>this is sample html</h2>
<%--comment tag --%>
<%!int count=0; %>
<%=count++ %>
<h2>Count value is<%=count %></h2>
<%!String name="vennela"; %>
<h2><%=name %>is a very good girl</h2>
</body>
</html>