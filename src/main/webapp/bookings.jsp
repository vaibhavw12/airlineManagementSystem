<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ page import="com.vaibhav.info.CustomerBookings" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body {
  background-image: url('template/airport-terminal.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
	}

</style>
<link rel="stylesheet" href="css\afterbooking.css">
</head>
<body style="text-align:center">

<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<div class="header">
<%
  String name =(String)request.getSession().getAttribute("username");
  out.print("<div class='user'>"+name+"</div>");
%>
<div class="header-right">
  <a style="float:right" href="#">Logout</a>
  <a style="float:right" href="#">My profile</a>
  </div>
  </div>
  <div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
    <h3>Bookings Confirmed</h3><br>
    <%
    session = request.getSession();
    CustomerBookings customerBookings = new CustomerBookings();
	customerBookings = (CustomerBookings)session.getAttribute("bookings");
	String source = customerBookings.getSource();
	String destination = customerBookings.getDestination();
	String date = customerBookings.getDate();
	String seats = customerBookings.getSeats();
	String FlightTime = customerBookings.getTime();
	out.print("From = "+source+"<br>"+"To = "+destination+"<br>"+"Date = "+date+"<br>"+"Seats = "+seats+"<br>"+"Time = "+FlightTime);
	
    %>

     

</div>

</body>
</html>