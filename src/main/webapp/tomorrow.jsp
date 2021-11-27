<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.FlightData" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<%
List<String> available = FlightData.flightAvailble();
List<Integer> timing = FlightData.timings2;
int index=0;
for(String s : available){
	out.print(s+" ->> available till "+timing.get(index)+":00"+"<br>");
	index++;
}

%>
</body>
</html>