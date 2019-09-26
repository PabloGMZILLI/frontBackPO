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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="boots.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<title>Usuarios</title>
</head>
<body>
<div id="fullscreen_bg" class="fullscreen_bg">
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
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form action="edit" method="post">
									<table border="1"  class="table">
										<thead class="thead-light">
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
												<th>
												</th>
											</tr>
										</thead>
										<tbody>
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
												<td class='edit-td'>
													<a href="editPage.jsp?id=<%=users.get(i).getId()%>" class="icons edit glyphicon glyphicon-pencil" aria-hidden="true"></a>
													<a href="delete?id=<%=users.get(i).getId()%>" onclick="return confirmDelete(<%=users.get(i).getId()%>);" class="icons delete glyphicon glyphicon-trash" aria-hidden="true"></a>						
												</td>
											</tr>
											<% } %>
										</tbody>
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
<script>
	function confirmDelete(id){
		return confirm("Deseja realmente deletar o usuário id " + id + " ?")		
	}
</script>

</html>