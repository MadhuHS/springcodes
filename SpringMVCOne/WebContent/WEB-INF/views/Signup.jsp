<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignUp</title>
</head>
<body>
<h1>Sign Up</h1>
<form action="trysignup" method="post">
		<input type="text" name="name" placeholder="name">
		<input type="text" name="email" placeholder="email"> 
		<input type="text" name="phn" placeholder="phone"> 
		
		<input type="text" name="userAddress.state" placeholder="state">
		<input type="text" name="userAddress.city" placeholder="city"> 
		<input type="text" name="userAddress.pincode" placeholder="pincode"> 
		<input type="submit">
	</form>
</body>
</html>



