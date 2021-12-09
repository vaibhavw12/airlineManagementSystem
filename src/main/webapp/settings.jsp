<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\home.css">
<style>
	body {
  background-image: url('template/airport-terminal.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
	}

</style>

</head>

<body >
<%
if((session.getAttribute("email")==null) || (session.getAttribute("username")==null)){
	response.sendRedirect("index.html");
}
%>
<div class="header">
<a href="#default" class="logo">Welcome to My Air_Lines .....</a>
<%
  String name =(String)request.getSession().getAttribute("username");
  out.print("<div class='user'>"+name+"</div>");
%><div style="">

  <a style="float:right" href="logout.jsp">Logout</a>
  </div>
  </div>
  <div class="header-right">
    <a class="active" href="changePassword.jsp">Change My Password</a><br><br><br>
    <a href="changeMobile.jsp">Change My Mobile No</a><br><br><br>
    <a href="paymentOptions.jsp">Payments Options</a><br><br><br>
    <a href="deleteAccount.jsp">Delete My Account</a>
  
</div>
<div class="img">
<img src="template/My Air_lines-logos_transparent.png" alt="My Air_Lines">
</div>

</body>
</html>