<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\signup.css">
</head>
<body>
<form action="LoginServlet" method="post" style="border:1px solid #ccc">


 <div class="container" style="text-align:center">
      <h1>Login</h1>
      <div>
      <table class="center">
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
       <a href="index.html"><button type="button" class="cancelbtn">Cancel</button></a>
        <button type="submit" class="signup">Login</button>
      </div>
    </div>

  </form>

</body>
</html>