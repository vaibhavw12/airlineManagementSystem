<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.CustomerDao,java.util.List" %>
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
<div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
</div>
<h2>Reservations</h2>
<%
session = request.getSession();
String email = (String)session.getAttribute("email");
List<String> reservations = CustomerDao.myReservation(email);
int b = 5, j = 1;
for(int i=0;i<reservations.size();i++){

	out.print("<div class='container1'>"+reservations.get(i)+" </div>");
	if(j==b){
		b+=5;
		out.print("<br>");
	}
	j++;
}
%>
</body>
</html>