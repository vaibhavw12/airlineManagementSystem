<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\home.css">
<style>
	body {
  background-image: url('template/airport-terminal.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
	}

</style>

</head>

<body >

<div class="header">
<a href="#default" class="logo">Welcome to My Air_Lines .....</a>
<%
  String name =(String)request.getSession().getAttribute("username");
  out.print("<div class='user'>"+name+"</div>");
%>
  <a style="float:right" href="#">Logout</a>
  <a style="float:right" href="#">My profile</a>
  </div>
  <div class="header-right">
    <a class="active" href="bookTickets.jsp">Book Tickets</a>
    <a href="myTrips.jsp">My trips</a>
    <a href="flightStatus.jsp">Flight status</a>
    <a href="available.jsp">Available</a>
  
</div>
<div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
</div>

</body>
</html>