<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vaibhav.info.CustomerDao" import="java.util.List" %>
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
<h3>My Profile</h3>
<%
session = request.getSession();
String email = (String)session.getAttribute("email");
List<String> list = CustomerDao.profile(email);
for(int i=0;i<list.size();i++){
	out.print(list.get(i)+"<br>");
}

%>

</body>
</html>