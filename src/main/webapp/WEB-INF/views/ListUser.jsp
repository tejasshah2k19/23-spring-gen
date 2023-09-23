<%@page import="com.bean.UserBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>


	<h2>List Users</h2>

	<%
	List<UserBean> users = (List<UserBean>) request.getAttribute("users");
	%>


	<table border="1">
		<tr>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<%
		for (UserBean u : users) {
		%>
		<tr>
			<td><%=u.getFirstName()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getPassword()%></td>
		</tr>
		<%
		}
		%>
	</table>


</body>
</html>