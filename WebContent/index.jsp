<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="boots.css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div id="fullscreen_bg" class="fullscreen_bg" />
	<div id="regContainer" class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="login.jsp" class="active" id="user-list-link">Logar</a>
							</div>
							<div class="col-xs-6">
								<a href="viewData.jsp" class="active" id="user-list-link">Lista
									de Usuarios</a>
							</div>
							<div class="col-xs-6">
								<a href="register.jsp" class="active" id="register-link">Registrar
									Usuarios</a>
							</div>
							<div class="col-xs-6 space">
								<a href="viewProducts.jsp" class="active" id="register-link">Lista
									de Produtos</a>
							</div>
							<div class="col-xs-6 space">
								<a href="registerProduct.jsp" class="active" id="register-link">Cadastrar
								Produto</a>
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