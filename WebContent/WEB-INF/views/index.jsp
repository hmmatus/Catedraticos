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
	<form action="${pageContext.request.contextPath}/validacion" method="post">
		<label>User: </label><input type="text" name="usuario"><br><br>
		<label>Password: </label><input type="password" name="contrasena"><br><br>
		<input type="submit">
	</form>
</body>
</html>