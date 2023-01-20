<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
	    Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your todo's.
	</body>
</html>