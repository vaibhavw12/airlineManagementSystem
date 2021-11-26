<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.FlightData" import="java.util.List" import="java.time.LocalDateTime,java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Flights Available for Today</h2>

<%

LocalDateTime now = LocalDateTime.now();  
DateTimeFormatter format = DateTimeFormatter.ofPattern("HH"); 
String formatDateTime = now.format(format);  
//out.print(formatDateTime);
List<String> available = FlightData.flightAvailble(formatDateTime);
List<Integer> timing = FlightData.timings;
int index=0;
for(String s : available){
	out.print(s+" ->> available till "+timing.get(index)+":00"+"<br>");
	index++;
}


%>

</body>
</html>