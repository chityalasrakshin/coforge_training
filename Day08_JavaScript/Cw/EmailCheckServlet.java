package com.coforge.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailCheckServlet
 */
@WebServlet("/EmailCheckServlet")
public class EmailCheckServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email1");
		
		if(email != null && email.equals("bsrakshin@gmail.com")) {
			out.println("<b><font color='green'>Valid</font></b>");
		}
		else {
			out.println("<b><font color='red'>Invalid</font></b>");
		}
	}

}
