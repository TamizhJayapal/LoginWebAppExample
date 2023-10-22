package com.login.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		String dbUrl = getServletContext().getInitParameter("databaseUrl");
		
		getServletContext().setAttribute("userSessionCount", 10);
		
		System.out.println("Context param: "+dbUrl);

		if (userName.equals("Tamizh") && password.equals("123")) {
			HttpSession session = request.getSession(true);

			session.setAttribute("userName", userName);
			//response.sendRedirect(request.getContextPath() + "/ProfileServlet");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ProfileServlet");
			dispatcher.forward(request, response);

		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
