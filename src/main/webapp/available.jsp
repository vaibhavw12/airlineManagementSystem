<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.FlightData" import="java.util.List" import="java.time.LocalDateTime,java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="css\tomorrow.css">
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
<h2>Flights Available for Today</h2>
<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null) ){
	response.sendRedirect("index.html");
}
%>

<%

LocalDateTime now = LocalDateTime.now();  
DateTimeFormatter format = DateTimeFormatter.ofPattern("HH"); 
String formatDateTime = now.format(format);  
//out.print(formatDateTime);
List<String> available = FlightData.flightAvailble(formatDateTime);
List<String> timing = FlightData.timings1;
int index=0;
for(String s : available){
	out.print("<div class='container1'>"+index+1+".  "+s+" ->> available till "+timing.get(index)+":00"+"</div><br>");
	index++;
}


%>

</body>
</html>