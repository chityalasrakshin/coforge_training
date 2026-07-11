package com.coforge.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username!=null && username.equals("admin") && password.equals("123")){
			//out.println("<b><font color = 'green'>Welcome Admin</font></b>");
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			
			Cookie cookie = new Cookie("username",username);
			response.addCookie(cookie);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("LoginSuccess.jsp");
		}else {
			//out.println("<b><font color = 'red'>Invalid User</font></b>");
			response.sendRedirect("LoginFail.jsp");
		}
		out.close();
	}

}
