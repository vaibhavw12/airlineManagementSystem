<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.CustomerDao" import="java.util.List" %>
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
<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<h2>My Profile</h2>
<%
session = request.getSession();
String email = (String)session.getAttribute("email");
List<String> list = CustomerDao.profile(email);
for(int i=0;i<list.size();i++){
	out.print("<div class='container1'>"+list.get(i)+"</div><br>");
}

%>

</body>
</html>