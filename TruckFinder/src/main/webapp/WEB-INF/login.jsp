<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="/style.css">
</head>
<body class="login">
	<h1>Welcome!</h1>
	<h2 class="TVSB">TV Shows Database.</h2>
	
	<div class="container">
		
		<fieldset>
		<legend><h3>Register as Business Owner</h3></legend>
		<form:form method="post" action="/register" modelAttribute="newUser">
			<p>
				<form:label path="userName">User Name:</form:label>
				<form:input type="userName" path="userName"/>
				<form:errors path="userName"></form:errors>
			</p>
			<p>
				<form:label path="email">Email:</form:label>
				<form:input type="email" path="email"/>
				<form:errors path="email"></form:errors>
			</p>
			
			<p>
				<form:label path="password">Password:</form:label>
				<form:password path="password"/>
				<form:errors path="password"/>
			</p>
			<p>
				<form:label path="confirm">Password Confirmation:</form:label>
				<form:password path="confirm"/>
				<form:errors path="confirm"/>
			</p>
			<input type="submit" value="Register!"/>
		</form:form>
		</fieldset>
		
			<fieldset>
		<legend><h3>Register as Driver</h3></legend>
		<form:form method="post" action="/register" modelAttribute="newUser">
			<p>
				<form:label path="userName">User Name:</form:label>
				<form:input type="userName" path="userName"/>
				<form:errors path="userName"></form:errors>
			</p>
			<p>
				<form:label path="email">Email:</form:label>
				<form:input type="email" path="email"/>
				<form:errors path="email"></form:errors>
			</p>
			
			<p>
				<form:label path="password">Password:</form:label>
				<form:password path="password"/>
				<form:errors path="password"/>
			</p>
			<p>
				<form:label path="confirm">Password Confirmation:</form:label>
				<form:password path="confirm"/>
				<form:errors path="confirm"/>
			</p>
			<input type="submit" value="Register!"/>
		</form:form>
		</fieldset>
		
		<fieldset>
		<legend><h3>Login</h3></legend>
		<form:form method="post" action="/login" modelAttribute="newLogin">
			<p>
				<label for="email" for="email">Email</label>
				<form:input path="email" type="text" id="email" name="email"/>
				<form:errors path="email"/>
			</p>
			<p>
				<label for="password">Password</label>
				<form:input path="password" type="password" id="password" name="password"/>
				<form:errors path="password"/>
			</p>
			<input type="submit" value="Login"/>
		</form:form>
		</fieldset>
	</div>	
</body>
</html>