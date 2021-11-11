<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<form action="LoginServlet" method="post">
<table>
	<tr><td><label>Enter the Username: </label></td></tr>
	<tr><td><input type="text" name="userName" id="userName"></td></tr>
	<tr><td><br></td></tr>
	<tr><td><label>Enter the Password: </label></td></tr>
	<tr><td><input type="password" name="password" id="password"></td></tr>
	<tr><td><br></td></tr>
	<tr><td><br></td></tr>
	<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</fieldset>
</body>
</html>