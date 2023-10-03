<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>

	<form action="updateuser" method="post">
		FirstName : <input type="text" name="firstName" value="${user.firstName }"/><br><br> 
		Email  :  <input type="text" name="email" value="${user.email}"/><br><br>
		<input type="hidden" name="userId" value="${user.userId }"/>
		<input type="submit" value="Update User"/>
	</form>
</body>
</html>