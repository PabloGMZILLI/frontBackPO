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
@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
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
		Integer uid = Integer.parseInt(request.getParameter("user_id"));
		String uname = request.getParameter("user_name");
		String umail = request.getParameter("user_email");
		String uphone = request.getParameter("user_phone");
		
		User user = new User();
		user.setId(uid);
		user.setName(uname);
		user.setLogin(uname);
		user.setEmail(umail);
		user.setPhone(uphone);
		
		UserDao userDao = new UserDao();
		userDao.update(user);
		response.sendRedirect("viewData.jsp");
	}

}
