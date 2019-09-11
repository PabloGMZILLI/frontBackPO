<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="boots.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>	        	
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
                <form id="register-form" action="LoginCheck" method="post" role="form" style="display: block;" >
           			<div class="form-group">
	                	<label for="username">Username</label>
	                	<input type="text" name="user_name" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
	           		</div>
	           		<div class="form-group">
	                	<label for="email">Email</label>
	                	<input type="text" name="user_email" id="email" tabindex="1" class="form-control" placeholder="email@email.com" value="">
	           		</div>
		            <div class="form-group">
		            	<label for="phone">Telefone</label>
		                <input type="text" name="user_phone" id="phone" tabindex="1" class="form-control" placeholder="(54) 999999999" value="">
		            </div>
		            <div class="form-group">
		                <label for="password">Password</label>
		                <input type="password" name="user_password" id="password" tabindex="2" class="form-control" placeholder="Password">
		            </div>
		           	<div class="row">
		               	<div class="col-sm-6 col-sm-offset-3">
	                  		<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
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