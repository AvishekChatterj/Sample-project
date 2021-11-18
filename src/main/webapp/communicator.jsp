<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enables communication between 2 JSPs</title>
</head>
	<body>
<%
	String userName=request.getParameter("userName");
	session.setAttribute("userName", userName);
	String password=request.getParameter("password");
	session.setAttribute("password", password);
	response.sendRedirect("ShowDetails.jsp");
%>
</body>
</html>