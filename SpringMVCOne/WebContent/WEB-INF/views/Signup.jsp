<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignUp</title>
</head>
<body>
	<h1>Sign Up</h1>
	<h2>contact : <spring:message code ="contact" /> </h2>
	<h2>email   : <spring:message code = "email"/></h2>
	
	<form action="trysignup" method="post">
		<input type="text" name="name" 
		  placeholder=<spring:message code ="name"/>>
		 
		 <input type="text" name="email" 
		 placeholder=<spring:message code ="email"/>> 
		 
		 <input	type="text" name="phn"
		  placeholder=<spring:message code ="phone"/>> 
		 
		 <input type="text" name="userAddress.state" 
		 placeholder=<spring:message code ="state"/>>
		 
		  <input type="text" name="userAddress.city" 
		  placeholder=<spring:message code ="city"/>>
		 
		   <input type="text" name="userAddress.pincode" 
		   placeholder=<spring:message code ="pincode"/>>
		
		<input type="submit">
	</form>
</body>
</html>



