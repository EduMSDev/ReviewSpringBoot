<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>

<form:form action="procesarFormulario" modelAttribute="alumno">
	Nombre: <form:input path="nombre"/>
	<br><br>
	apellido: <form:input path="apellido"/>
	<br><br>
	<input type="submit" value="Enviar">
</form:form>

</body>
</html>