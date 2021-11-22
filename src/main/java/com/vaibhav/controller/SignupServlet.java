package com.vaibhav.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		if(password.isEmpty() || mobile.length()!=10 || name.isEmpty()) {

			response.sendRedirect("signup.jsp");
		}if(!email.isEmpty()) {
		//	System.out.println("before");
			Email email_Ref = new Email();
			email_Ref.SendEmail(email);
		//	System.out.println("after");
			
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setName(name);
			customerDetails.setEmail(email);
			customerDetails.setPassword(password);
			customerDetails.setMobile(mobile);
			
			HttpSession session = request.getSession();
			session.setAttribute("details",customerDetails);
			response.sendRedirect("verify.jsp");
			
			
		}else {
			System.out.println("something went wrong");
		}
	}

}
