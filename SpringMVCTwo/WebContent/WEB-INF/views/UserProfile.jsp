<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
</head>
<body>
<h1>User Profile</h1>
<h2>Name    : ${user.getName()}</h2>
<h2>Email   : ${user.getEmail()}</h2>
<h2>Phone   : ${user.getPhn()}</h2>
<h1>User Address</h1>
<h2>State   : ${user.userAddress.getState()}</h2>
<h2>City    : ${user.userAddress.getCity()}</h2>
<h2>Pincode : ${user.userAddress.getPincode()}</h2>
</body>
</html>



