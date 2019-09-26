package br.edu.imed;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductCheck")
public class ProductCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCheck() {
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
		doGet(request, response);
		String name = request.getParameter("product_name");
		String type = request.getParameter("product_type");
		String stock = request.getParameter("product_stock");
		String price = request.getParameter("product_price");
		String cd = request.getParameter("product_cd");
		Product product = new Product();
		product.setName(name);
		product.setType(type);
		product.setStock(stock);
		product.setPrice(price);
		product.setLocale(cd);
		
		ProductDao productDao = new ProductDao();
		boolean insert = productDao.insert(product);
		
		if (insert == true ) {
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

}