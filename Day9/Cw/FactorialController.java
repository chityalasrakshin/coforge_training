package com.coforge.servlet1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactorialController
 */
@WebServlet("/FactorialController")
public class FactorialController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(request.getParameter("n"));
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("FactorialOutput.jsp");
		request.setAttribute("n", n);
		request.setAttribute("fact",fact);
		dispatcher.forward(request, response);
		//response.sendRedirect("FactorialOutput.jsp?n=" + n +"&fact=" + fact);
	}

}
