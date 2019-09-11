package br.edu.imed;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
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
		String uname = request.getParameter("user_name");
		String umail = request.getParameter("user_email");
		String uphone = request.getParameter("user_phone");
		String pass = request.getParameter("user_password");
		User user = new User();
		user.setName(uname);
		user.setLogin(uname);
		user.setEmail(umail);
		user.setPhone(uphone);
		user.setPassword(pass);
		
		UserDao userDao = new UserDao();
		boolean insert = userDao.insert(user);
		
		if (insert == true ) {
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

}