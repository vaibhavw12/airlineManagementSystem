<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\booking.css">


</head>
<style>
	body {
  background-image: url('template/airport-terminal.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
	}

</style>
<body>
 <div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
</div>
<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<form action="BookingServlet" method="post">

<div class="header" style="font-size:20px">

 <div class="list">
     <label style="font-size:20px" for="source"><b>Source</b></label>
     <input style="font-size:20px" list="citys" placeholder="From" name="source" required>
     <label style="font-size:20px" for="destination"><b>Destination</b></label>
      <input style="font-size:20px" list="citys" placeholder="To" name="destination" required><br><br>
  <datalist id="citys">
    <option value="Mumbai">
    <option value="Delhi">
    <option value="Kolkata">
    <option value="Banguluru">
    <option value="Chennai">
     <option value="Pune">
      <option value="Hyderabad">
       <option value="Jaipur">
        <option value="Indore">
         <option value="Lucknow">
  </datalist>
  </div>
  <%
  LocalDate myObj = LocalDate.now(); // Create a date object
  out.print("<label for='date'><b>Date</b></label>"+"<input type='date' id='date' name='date' min="+myObj+" max='2021-12-31' required>"); 		 
  %>
 
  <label for="seats"><b>Seats</b></label>
   <input type="number" id="seats" name="seats" min="1" max="5" required><br><br>
 
<a href="home.jsp">Cancel</a>
<button type="submit" class="btn" >search flights</button>
</div>

</form>
</body>
</html>