package br.edu.imed;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.SendResult;

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
		response.getWriter().append("Served at teste!: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String uname = request.getParameter("user_name").toLowerCase();
		String pass = request.getParameter("user_password");

		UserDao userDao = new UserDao();
		boolean loginSuccess = userDao.login(uname, pass);

		HttpSession session = request.getSession(true);
		session.setAttribute("user", uname);
		session.setAttribute("autorizado", true);
		
		if (loginSuccess) {
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("withoutPermission.jsp");
		}
		session.setMaxInactiveInterval(30);
		session.getAttributeNames();
		
	}
}