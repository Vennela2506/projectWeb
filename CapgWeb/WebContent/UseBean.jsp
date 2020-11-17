<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class="Day1.Student"></jsp:useBean>
<jsp:setProperty property="rno" name="student" value="490"/>
<jsp:setProperty property="name" name="student" value="Vennela"/>
Code = <jsp:getProperty property="rno" name="student"/><br>
Name = <jsp:getProperty property="name" name="student"/><br>
</body>
</html>