<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ page import="com.vaibhav.info.CustomerBookings" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  String name =(String)request.getSession().getAttribute("username");
  out.print("<div class='user'>"+name+"</div>");
%>
  <a style="float:right" href="#">Logout</a>
  <a style="float:right" href="#">My profile</a>
  
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

     
<div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
</div>

</body>
</html>