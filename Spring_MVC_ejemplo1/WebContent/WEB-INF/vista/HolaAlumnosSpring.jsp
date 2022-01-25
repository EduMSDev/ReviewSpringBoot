<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/estilo.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hola ${param.nombreAlumno }

<p><br>

<h2>Atencion a todos</h2>

${mensajeClaro}

<p>

<img alt="foto" src="${pageContext.request.contextPath}/recursos/img/descarga.jpg">
</body>
</html>