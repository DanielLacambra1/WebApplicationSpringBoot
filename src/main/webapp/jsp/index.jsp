<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
	<!--  LOGIN DE LA APLICACIÓN -->
<html>
	<head>
		<title>Login</title>
	</head>
	
	<body>
	    <font color="red">${errorMessage}</font>
	    <form method="post">
	        Nombre : <input type="text" name="name" />
	        Contraseña : <input type="password" name="password" /> 
	        <input type="submit" />
	    </form>
	</body>
</html>