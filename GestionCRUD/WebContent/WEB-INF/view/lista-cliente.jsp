<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Futuros clientes


<table>
	<tr>
	<th>Nombre</th>
	<th>Apellidos</th>
	<th>Email</th>
	</tr>
	
	<c:forEach var="clientTemp" items="${clientes }">
		<tr>
			<td>${clientTemp.nombre}</td>
			<td>${clientTemp.apellido}</td>
			<td>${clientTemp.email}</td>
		</tr>
	</c:forEach> 

</table>
</body>
</html>