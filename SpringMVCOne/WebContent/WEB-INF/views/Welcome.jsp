<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
    <a href="/SpringMVCOne/?siteLanguage=en">English</a> |
	<a href="/SpringMVCOne/?siteLanguage=de">German</a>
	
	<h1>Welcome to Spring MVC</h1>
	<h2>contact : <spring:message code ="contact" /> </h2>
	<h2>email   : <spring:message code ="email"/></h2>
	<h2>${msg}</h2>
	<a href="signup">Click To SignUp</a>
</body>
</html>






