package com.vaibhav.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.vaibhav.info.*;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//getting parameters from the user
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("psw");
		String mobile=request.getParameter("mobile");
		//System.out.println(name+" "+email+" "+password+" "+mobile);
		if(password.isEmpty() || mobile.length()!=10 || name.isEmpty() || email.isEmpty()) {

			response.sendRedirect("signup.jsp");
		}else {
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setName(name);
			customerDetails.setEmail(email);
			customerDetails.setPassword(password);
			customerDetails.setMobile(mobile);
			
			// saving user details to Database
			CustomerDao customerDao = new CustomerDao();
			if(customerDao.save(customerDetails)) {
				response.sendRedirect("login.jsp");
			}else {
				out.print("<br><a href='signup.jsp'>try again</a>");	
			}
		}
	}

}
