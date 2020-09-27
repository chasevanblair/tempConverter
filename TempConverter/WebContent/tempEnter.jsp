<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Data</title>
</head>
<body>
	<h1>${type} amount conversion</h1>
	<form action = "conversion" method="post">
		Enter the degree amount to be converted:
		<input type="hidden" name="type" value="${type}">
		<input type="text" name="tempValue" size="10">
		<input type="submit" value ="Convert"/>
	</form>
</body>
</html>