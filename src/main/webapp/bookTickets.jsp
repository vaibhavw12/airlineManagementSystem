<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <option value="Mannali">
    <option value="Delhi">
    <option value="Kolkata">
    <option value="Banguluru">
    <option value="Chennai">
     <option value="Pune">
      <option value="Aurangabad">
  </datalist>
  <input type="date">
 <button type="submit">search flights</button>
</div>
</form>
</body>
</html>