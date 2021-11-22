<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="VerifyServlet" method="post" style="border:1px solid #ccc">


 <div class="container" style="text-align:center">
      <h1>Verify</h1>
      <div>
      <table class="center">
      <tr> 
      <th><label for="email"><b>Enter OTP</b></label></th>
      <th><input type="number" placeholder="Enter OTP" name="otp" required></th>
      </tr>
     </table>
     </div>
      <div class="clearfix">
       <a href="index.html"><button type="button" class="cancelbtn">Cancel</button></a>
        <button type="submit" class="signup">verify</button>
      </div>
    </div>

  </form>

</body>
</html>