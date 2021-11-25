<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\bookTicket.css">
</head>
<body>
<form action="BookingServlet" method="post">
<div class="booking">

 
     <label for="source"><b>Source</b></label>
     <input list="citys" placeholder="From" name="source" required>
     <label for="destination"><b>Destination</b></label>
      <input list="citys" placeholder="To" name="destination" required>
  <datalist id="citys">
    <option value="Mumbai">
    <option value="Delhi">
    <option value="Kolkata">
    <option value="Banguluru">
    <option value="Chennai">
     <option value="Pune">
  </datalist>
  <%
  LocalDate myObj = LocalDate.now(); // Create a date object
  out.print("<label for='date'>Date</label>"+"<input type='date' id='date' name='date' min="+myObj+" max='2021-12-31' required>"); 		 
  %>
 
  <label for="seats"><b>Seats</b></label>
   <input type="number" id="seats" name="seats" min="1" max="3" required>
 <button type="submit">search flights</button>

</div>
</form>
</body>
</html>