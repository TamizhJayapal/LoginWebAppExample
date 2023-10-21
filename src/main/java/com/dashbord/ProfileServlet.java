package com.dashbord;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sessionCount = (int) getServletContext().getAttribute("userSessionCount");
		
		String data = getInitParameter("data");
		System.out.println(data);
		
		System.out.println(sessionCount);
		
		response.sendRedirect("profile.jsp");
	}

}
