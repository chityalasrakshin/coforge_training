package com.coforge.servlet.assignment;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadiusServlet
 */
@WebServlet("/RadiusServlet")
public class RadiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(request.getParameter("radius"));
		request.setAttribute("radius",n);
		RequestDispatcher dispatcher = request.getRequestDispatcher("AreaServlet");
		dispatcher.forward(request, response);
	}

}
