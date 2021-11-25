package com.vaibhav.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vaibhav.info.CustomerDao;
import com.vaibhav.info.CustomerDetails;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		CustomerDao customerDao = new CustomerDao();
		if(customerDao.check(email, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username",customerDao.name);
			response.sendRedirect("home.jsp");
			
		}else {
			out.print("enter correct username and password");
		}
		
	}

}
