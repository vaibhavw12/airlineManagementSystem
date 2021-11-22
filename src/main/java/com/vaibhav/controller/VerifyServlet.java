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
 * Servlet implementation class VerifyServlet
 */
@WebServlet("/VerifyServlet")
public class VerifyServlet extends HttpServlet {
	
	CustomerDetails customerDetails = new CustomerDetails();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		customerDetails = (CustomerDetails) session.getAttribute("details");
		
		String opt=request.getParameter("otp");
		if(opt.equals(Email.OTP+"")) {
			CustomerDao customerDao = new CustomerDao();
			
			if(customerDao.save(customerDetails)) {
				response.sendRedirect("login.jsp");
			}else {
				out.print("<br><a href='signup.jsp'>try again</a>");	
				}
		}else {
			out.print("enter correct opt");
		}
	}
	

}
