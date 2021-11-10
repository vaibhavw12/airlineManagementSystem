<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="signup.css">
</head>
<body>
<form action="LoginServlet" method="post" style="border:1px solid #ccc">

 <div class="container">
      <h1>Login</h1>
      <div>
      <table>
      <tr> 
      <th><label for="email"><b>Email</b></label></th>
      <th><input type="email" placeholder="Enter Email" name="email" required></th>
      </tr>
	  <tr> 
     <th> <label for="password"><b>Password</b></label></th>
     <th><input type="password" placeholder="Enter Password" name="password" required></th>
      </tr>
      </table>
      <label>
       <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
      </label>
      </div>
      <div class="clearfix">
       
        <button type="submit" class="signup">Login Up</button>
      </div>
    </div>

  </form>

</body>
</html>