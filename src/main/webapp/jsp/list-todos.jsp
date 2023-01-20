<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

	<head>
		<title>List-Todos</title>
	</head>
	
	<body>
	    Lista de tareas pendientes:
	    ${todos} 
	    <br/>
	    Your Name is : ${name}
	</body>

</html>