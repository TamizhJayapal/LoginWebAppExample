package com.dashbord;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sessionCount = (int) getServletContext().getAttribute("userSessionCount");
		
		String data = getInitParameter("data");
		System.out.println("init param of profile Servlet: "+data);
		
		System.out.println("attribute which set in login servlet: "+sessionCount);
		
		System.out.println(request.getParameter("userName"));
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/CommonServlet");
//		dispatcher.include(request, response);
	
		//RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
		//dispatcher.forward(request, response);
		response.sendRedirect("profile.jsp");
	}

}
