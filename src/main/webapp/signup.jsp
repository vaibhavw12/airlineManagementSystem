<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new Account</title>
<link rel="stylesheet" href="css\signup.css">
</head>

<body>

<form action="SignupServlet" method="post" style="border:1px solid #ccc">

 <div class="container" style="text-align:center">
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
      <div>
      <table class="center">
      <tr> 
      <th><label for="name"><b>Name</b></label></th>
      <th><input type="text" placeholder="Enter Name" name="name" required></th>
      </tr>
      <tr> 
      <th><label for="email"><b>Email</b></label></th>
      <th><input type="email" placeholder="Enter Email" name="email" required></th>
      </tr>
	  <tr> 
     <th> <label for="psw"><b>Password</b></label></th>
     <th><input type="password" placeholder="Enter Password" name="psw" required></th>
      </tr>
		<tr> 
     <th> <label for="mobile"><b>Mobile Number</b></label></th>
     <th><input type="number" placeholder="Enter Mobile Number" name="mobile" required></th>
      </tr>
      </table>
      <label>
       <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
      </label>
      </div>
      
      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

      <div class="clearfix">
        <a href="index.html"><button type="button" class="cancelbtn">Cancel</button></a>
        <button type="submit" class="signup">Sign Up</button>
      </div>
    </div>

  </form>
</body>
</html>