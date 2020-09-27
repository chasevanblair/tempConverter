<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature Converter</title>
</head>
<body>
<h1>Temperature Converter</h1>
	<form action = "pageChoice" method="post">
		 <label for="temp">Choose type:</label>

	<select name="temp" id="temp">
  		<option value="celsius">Celsius</option>
  		<option value="farenheit">Farenheit</option>
	</select> 
		<!-- Enter temperature and type separated by space (C/F). Ex: 99 F:
		<input type="text" name="temperature" size="10"> -->
		<input type="submit" value ="Convert"/>
	</form>
</body>
</html>