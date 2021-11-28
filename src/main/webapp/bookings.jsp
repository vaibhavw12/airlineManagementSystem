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
<link rel="stylesheet" href="css/afterbooking.css">
</head>
<body >

<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<div class="header">
<%
  String name =(String)request.getSession().getAttribute("username");
//  out.print("<div class='user'>"+name+"</div>");
%>

  </div>
  <div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
<div class="header-right">
  
  </div>
    <h2>Bookings Confirmed</h2>
    <div class='display'>
    <%
    session = request.getSession();
    CustomerBookings customerBookings = new CustomerBookings();
	customerBookings = (CustomerBookings)session.getAttribute("bookings");
	String source = customerBookings.getSource();
	String destination = customerBookings.getDestination();
	String date = customerBookings.getDate();
	String seats = customerBookings.getSeats();
	String FlightTime = customerBookings.getTime();
	out.print("<div class='container1'> From = "+source+"</div><br>");
	out.print("<div class='container1'> To = "+destination+"</div><br>");
	out.print("<div class='container1'> Date = "+date+"</div><br>");
	out.print("<div class='container1'> Seats = "+seats+"</div><br>");
	out.print("<div class='container1'> Time = "+FlightTime+"</div><br>");
    %>
    <a style="float:right" href="logout.jsp">Logout</a>
</div>
     

</div>

</body>
</html>