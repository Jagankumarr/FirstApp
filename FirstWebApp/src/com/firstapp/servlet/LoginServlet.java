package com.firstapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author jr38331
 *
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user= request.getParameter("username");
		//String pwd = request.getParameter("password");
		
		
		if(user.equals("admin"))
			response.sendRedirect("success.jsp");
		else
			response.sendRedirect("failure.jsp");
		
	
	}

}
