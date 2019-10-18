<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
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
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="./validation.js"></script>

<title>Login</title>
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
								<a href="index.jsp" class="active" id="home-link">Inicio</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" name="login-form"
									action="LoginCheck" method="post" role="form"
									onsubmit="return validateForm()" style="display: block;">
									<div class="form-group">
										<label for="username">Username</label> <input type="text"
											name="user_name" id="user_name" class="form-control"
											placeholder="Username">
									</div>
									<label for="password">Password</label> <input type="password"
										name="user_password" id="user_password" class="form-control"
										placeholder="Password">
							</div>
							<label class='message'></label>
							<div class="row">
								<div class="col-sm-6 col-sm-offset-3">
									<input type="submit" name="login-submit"
										id="login-submit" class="form-control btn btn-login"
										value="Login">
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
</html>