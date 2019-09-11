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
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="boots.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<title>Usuarios</title>
</head>
<body>
<a href="index.jsp">Inicio</a>

<div id="fullscreen_bg" class="fullscreen_bg"/>
	<div id="regContainer" class="container">
      <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <div class="panel panel-login">
          <div class="panel-heading">
            <div class="row">
              <div class="col-xs-6">
                <a href="index.jsp" class="active" id="home-link">Inicio</a>
              </div>
            </div>
            <hr>
          </div>
          <div class="panel-body">
            <div class="row">
              <div class="col-lg-12">
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
              </div>
            </div>
          </div>
          </div>
        </div>
      </div>
    </div>
  </div>

</body>

</html>