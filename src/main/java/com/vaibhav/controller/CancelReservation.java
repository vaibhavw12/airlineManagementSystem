package com.vaibhav.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vaibhav.info.CustomerBookings;
import com.vaibhav.info.CustomerDao;

/**
 * Servlet implementation class CancelReservation
 */
@WebServlet("/CancelReservation")
public class CancelReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String email = (String) session.getAttribute("email");
		CustomerBookings customerBookings = new CustomerBookings();
		customerBookings = (CustomerBookings)session.getAttribute("bookings");
		String source = customerBookings.getSource();
		String destination = customerBookings.getDestination();
		String date = customerBookings.getDate();
		String seats = customerBookings.getSeats();
		String FlightTime = customerBookings.getTime();
		
		if(CustomerDao.cancel(email,date,FlightTime)) {
			Email mail = new Email();
			mail.cancel(email,source,destination,date,seats,FlightTime);
			out.print("reservation cancel successfully<br>");
			out.print("<a href='home.jsp'>click here</a>");
		}
		
		//System.out.println(source+""+destination);
		
	}

}
