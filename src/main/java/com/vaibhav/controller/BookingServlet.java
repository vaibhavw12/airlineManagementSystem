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
import com.vaibhav.info.FlightData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		String seats = request.getParameter("seats");
		
		if(source.equals(destination)) {
			out.print("source and destination cannot be same");
		}else {
			
			//	System.out.println(source+" "+destination+" "+date);
				
				 LocalDateTime now = LocalDateTime.now();  
				DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		        String formatDateTime = now.format(format);  
				if(date.equals(formatDateTime)) {
					FlightData flightData = new FlightData();
					if(flightData.available(source+destination, date)) {
						String time = FlightData.flightTime;
						CustomerBookings customerBookings = new CustomerBookings();
						customerBookings.bookings(source, destination, date, seats, time);
						
						HttpSession session = request.getSession();
						String email = (String) session.getAttribute("email");
						
						CustomerDao customerDao = new CustomerDao();
						if(customerDao.myTrips(customerBookings,email)) {
							System.out.println("True");
						}
						
						Email mail = new Email();
						mail.SendBookTickets(email, customerBookings);
						
						session.setAttribute("bookings",customerBookings);
						
						response.sendRedirect("bookings.jsp");
					}else {
						out.print("Sorry no flights available for "+source+" "+destination+" for today");
					}
					
				}else {
					HttpSession session = request.getSession();
					String email = (String) session.getAttribute("email");
					String time = FlightData.time(source+destination);
					if(CustomerDao.reservation(email,source,destination,date,seats,time)) {
						Email mail = new Email();
						mail.SendReservation(email,source,destination,date,seats,time);
						
						out.print("reservation confirmed for "+date);
					}
					else {
						out.print("something went wrong try again....");
					}
				}
				
			//	response.sendRedirect("bookings.jsp");
		}
	
	}

}
