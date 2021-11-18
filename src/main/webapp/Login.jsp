<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>
<fieldset>
<form action="ServletExample2" method="get">
<h2 align ="center"> Welcome to Login</h2>
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