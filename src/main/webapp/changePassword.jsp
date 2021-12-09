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
<form action="ChangePassword" method="post" style="border:1px solid #ccc">


 <div class="container" style="text-align:center">
      <h1>Change Password</h1>
      <div>
      <table class="center">
      <tr> 
      <th><label for="email"><b>Old Password</b></label></th>
      <th><input type="email" placeholder="Enter Old Password" name="old" required></th>
      </tr>
	  <tr> 
     <th> <label for="password"><b>New Password</b></label></th>
     <th><input type="password" placeholder="Enter New Password" name="new" required></th>
      </tr>
      </table>
      
     
      </div>
      <div class="clearfix">
       <a href="settings.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
        <button type="submit" class="signup">Submit</button>
</div>
</div>
  </form>

</body>
</html>