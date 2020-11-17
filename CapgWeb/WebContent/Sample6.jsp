<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="crname" value="Alekhya"></c:set>
<c:out value="Welcome to jstl"></c:out><br>
CR NAme is<c:out value="${crname} "></c:out><br>
<c:forEach var="str" items="${nameList }">
<c:out value="${str}"></c:out> 
</c:forEach>


</body>
</html>