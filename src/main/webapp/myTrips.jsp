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
<%
session = request.getSession();
String email = (String)session.getAttribute("email");
List<String> trips = CustomerDao.showTrips(email);
int b = 5, j = 1;
for(int i=0;i<trips.size();i++){

	out.print(trips.get(i)+" ");
	if(j==b){
		b+=5;
		out.print("<br>");
	}
	j++;
}
%>
</body>
</html>