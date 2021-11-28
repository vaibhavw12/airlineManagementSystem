<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.FlightData" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\tomorrow.css">
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
<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
</div>
<h2>Flights Available On Everyday</h2>
<div class="container">

<%
List<String> available = FlightData.flightAvailble();
List<String> timing = FlightData.timings2;
int index=0;
int length = available.size();
//out.print(length);
for(String s : available){
	if(index<30){
		out.print("<div class='container1'>"+index+1+".  "+s+" ...  .... ->> available till "+timing.get(index)+":00"+"</div><br>");
		index++;
	}else if(index>=30 || index<60){
		out.print("<div class='container1'>"+index+1+".  "+s+" ...  .... ->> available till "+timing.get(index)+":00"+"</div><br>");
		index++;
	}else{
		out.print("<div class='container1'>"+index+1+".  "+s+" ...  .... ->> available till "+timing.get(index)+":00"+"</div><br>");
		index++;
	}
	
}

%>
</div>

</body>
</html>