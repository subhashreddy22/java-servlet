package com.webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginService loginService = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * PrintWriter out = response.getWriter(); out.println("<html>");
		 * out.println("<head>"); out.println("<title>Login Page</title>");
		 * out.println("</head>"); out.println("<body>");
		 * out.println("My First Servlet"); out.println("</body>");
		 * out.println("</html>");
		 */

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		boolean isValid = loginService.validate(name, password);

		if (isValid) {
			request.setAttribute("name", name);
			response.sendRedirect("/todo.do");
		} else {
			request.setAttribute("errorMessage", "Invalid username or password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}
