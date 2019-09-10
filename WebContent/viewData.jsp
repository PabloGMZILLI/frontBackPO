<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, br.edu.imed.*" %>
<%
UserDao dao = new UserDao();
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Inicio</a>
<form action="edit" method="post">
	<table border="1">
		<tr>
			<th>
				Id
			</th>
			<th>
				Name
			</th>
			<th>
				Email
			</th>
		</tr>
		<%
			List<User> users = dao.getUsers();
			for(int i=0; i < users.size(); i++){
		%>
			<tr>
				<td> 
					<%=users.get(i).getId()%>
				</td>
				<td>
					<%=users.get(i).getName()%>
				</td>
				<td>
					<%=users.get(i).getEmail()%>
				</td>
				<td>
					<a href="edit" >Editar</a>
				</td>
			</tr>
		<% } %>
	</table>
</form>
	

</body>
<script>
function teste () = 
</script>
</html>