<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, br.edu.imed.*"%>
<%
	ProductDao dao = new ProductDao();
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
<title>Editar Produto</title>
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
									<a href="index.jsp" class="active" id="home-link">Voltar</a>
								</div>
							</div>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<%
										Product product = dao.select(Integer.parseInt(request.getParameter("id")));
									%>
									<form id="edit-form" action="editProduct" method="post" role="form"
										style="display: block;">
										<input type="text" style="display:none" name="product_id" value=<%=product.getId()%> >
										<div class="form-group">
											<label for="product_name">Username</label> <input type="text"
												name="product_name" value=<%=product.getName()%>
												tabindex="1" class="form-control">
										</div>
										<div class="form-group">
											<label for="product_type">Type</label> <input type="text"
												name="product_type" value=<%=product.getType()%>
												tabindex="1" class="form-control">
										</div>
										<div class="form-group">
											<label for="product_stock">Stock</label> <input type="text"
												name="product_stock" value=<%=product.getStock()%>
												tabindex="1" class="form-control">
										</div>
										<div class="form-group">
											<label for="product_price">Price</label> <input type="text"
												name="product_price" value=<%=product.getPrice()%>
												tabindex="1" class="form-control">
										</div>
										<div class="form-group col-xs-6">
											<label for="product_locale">CD</label> <input type="text"
												name="product_locale" value=<%=product.getLocale()%>
												tabindex="1" class="form-control">
										</div>
										<div class="form-group col-xs-6">
										<label for="product_img">Product Image URL</label> <input type="text"
											name="product_img" class="form-control" value=<%=product.getImage()%>
											placeholder="img url">
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