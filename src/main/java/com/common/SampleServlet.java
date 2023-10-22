package com.common;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head><title>Main Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Main Servlet Content</h1>");

            // Including content from IncludedServlet
            RequestDispatcher dispatcher = request.getRequestDispatcher("CommonServlet");
            dispatcher.include(request, response);
            
            //out.println("<h1>common Servlet Content</h1>"+ getInitParameter("servletId"));
            

            out.println("</body>");
            out.println("</html>");
        }
    }

