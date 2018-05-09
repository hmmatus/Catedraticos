<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${result}</h1>
	<h3>Informacion</h3><br><br>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Edad</th>
			<th>DUI</th>
			<th>Fecha de contratacion</th>
		</tr>
		<tr>
			<th>${catedratico.nombre}</th>
			<th>${catedratico.apellido}</th>
			<th>${catedratico.edad}</th>
			<th>${catedratico.dui}</th>
			<th>${catedratico.fContratacion}</th>
		</tr>
	</table><br>
	<button onclick="history.back()">Regresar a buscador</button>
</body>
</html>