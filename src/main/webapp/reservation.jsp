<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.CustomerDao,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Reservations</h3>
<%
session = request.getSession();
String email = (String)session.getAttribute("email");
List<String> reservations = CustomerDao.myReservation(email);
int b = 5, j = 1;
for(int i=0;i<reservations.size();i++){

	out.print(reservations.get(i)+" ");
	if(j==b){
		b+=5;
		out.print("<br>");
	}
	j++;
}
%>
</body>
</html>