<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina principal</title>
</head>
<body>
	<h1>Consula de catedraticos</h1>
	<form action="${pageContext.request.contextPath}/busqueda" method="post">
		<label>Ingrese el codigo del catedratico: </label><input type="text" name="cat"><h3>${result}</h3><br><br>
		<input type="submit">
	</form><br>
	<button onclick="history.back()">Regresar a menu</button>
</body>
</html>