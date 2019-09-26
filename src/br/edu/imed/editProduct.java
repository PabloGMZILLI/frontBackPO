package br.edu.imed;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class edit
 */
@WebServlet("/editProduct")
public class editProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer pid = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("product_name");
		String type = request.getParameter("product_type");
		String stock = request.getParameter("product_stock");
		String price = request.getParameter("product_price");
		String cd = request.getParameter("product_cd");
		
		Product product = new Product();
		product.setId(pid);
		product.setName(name);
		product.setType(type);
		product.setStock(stock);
		product.setPrice(price);
		product.setLocale(cd);
		
		ProductDao productDao = new ProductDao();
		productDao.update(product);
		response.sendRedirect("viewProducts.jsp");
	}

}
