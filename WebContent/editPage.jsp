<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, br.edu.imed.*"%>
<%
	UserDao dao = new UserDao();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="boots.css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<title>Editar Usuario</title>
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
									<%
										User user = dao.select(Integer.parseInt(request.getParameter("id")));
									%>
									<form id="edit-form" action="edit" method="post" role="form"
										style="display: block;">
										<input type="text" style="display:none" name="user_id" value=<%=user.getId()%> >
										<div class="form-group">
											<label for="username">Username</label> <input type="text"
												name="user_name" value=<%=user.getName()%> id="username"
												tabindex="1" class="form-control" placeholder="Username"
												>
										</div>
										<div class="form-group">
											<label for="email">Email</label> <input type="text"
												name="user_email" value=<%=user.getEmail()%> id="email"
												tabindex="1" class="form-control"
												placeholder="email@email.com" >
										</div>
										<div class="form-group">
											<label for="phone">Telefone</label> <input type="text"
												name="user_phone" value=<%=user.getPhone()%> id="phone"
												tabindex="1" class="form-control"
												placeholder="(54) 999999999" >
										</div>
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="edit-submit" id="edit-submit"
													tabindex="4" class="form-control btn btn-edit" value="Save">
											</div>
										</div>
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
	function confirmDelete(id) {
		return confirm("Deseja realmente excluir o usuário id " + id + "?")
	}
</script>

</html>