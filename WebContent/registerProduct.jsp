<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>Insert title here</title>
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
								<form id="register-form" name="register-form"
									action="ProductCheck" method="post" role="form"
									style="display: block;">
									<div class="form-group col-xs-6">
										<label for="product_name col-xs-6">Product Name</label> <input type="text"
											name="product_name"class="form-control"
											placeholder="Televisão">
									</div>
									<div class="form-group col-xs-6">
										<label for="product_type">Type</label> <input type="text"
											name="product_type" placeholder="Eletronico" class="form-control">
									</div>
									<div class="form-group col-xs-6">
										<label for="product_stock">Stock</label> <input type="text"
											maxlength="15" placeholder="00" name="product_stock"
											class="form-control">
									</div>
									<div class="form-group col-xs-6">
										<label for="product_price">Price</label> <input type="text"
											name="product_price" class="form-control"
											placeholder="R$ 50,00">
									</div>
									<div class="form-group col-xs-6">
										<label for="product_cd">CD</label> <input type="text"
											name="product_cd" class="form-control"
											placeholder="CD_00">
									</div>
									<div class="form-group col-xs-6">
										<label for="product_img">Product Image URL</label> <input type="text"
											name="product_img" class="form-control"
											placeholder="img url">
									</div>
									<label class='message'></label>
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="register-submit"
												id="register-submit" class="form-control btn btn-register"
												value="Register">
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