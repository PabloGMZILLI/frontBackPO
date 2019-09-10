<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="index.jsp">Inicio</a>
	<form action="LoginCheck" method="post">
		Nome:
		<input type="text" name="user_name" />
		Telefone:
		<input type="text" name="user_phone" />
		Senha:
		<input type="text" name="user_password" />
		<input type="submit" value="Enviar" />
	</form>
</body>
</html>