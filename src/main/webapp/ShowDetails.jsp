<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying all details here</title>
</head>
<body>
<%
	String userName=request.getParameter("userName");
%>
<label>Hello <%=userName %></label>
<p>

</body>
</html>