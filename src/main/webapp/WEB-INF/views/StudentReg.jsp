<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Reg</title>
</head>
<body>
	<%-- 
	<form action="savestudent" method="post">
		FirstName : <input type="text" name="firstName" /><br>
		<br> Email : <input type="text" name="email" /><br>
		<br> Password : <input type="password" name="password" /><br>
		<br> <input type="submit" value="Signup" />
	</form> --%>

	<s:form action="savestudent" method="post" modelAttribute="student">
	
		FirstName : <s:input path="firstName"/>
		<s:errors path="firstName"></s:errors>
		<br><Br>
		Email  : <s:input path="email"/>
		<s:errors path="email"></s:errors>
		<br><br>
		Password : <s:password path="password"/> 
		<s:errors path="password"></s:errors>
		<br> 
		<br>
		<input type="submit" value="Signup" />

	</s:form>
</body>
</html>