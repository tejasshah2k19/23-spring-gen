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
	<a href="signup">Add New User</a>

	<%
	List<UserBean> users = (List<UserBean>) request.getAttribute("users");
	%>


	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		<%
		for (UserBean u : users) {
		%>
		<tr>
			<td><%=u.getUserId()%></td>
			<td><%=u.getFirstName()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getPassword()%></td>
			<td>
			
			<a href="viewuser?userId=<%=u.getUserId()%>">View</a> | 
			<a href="deleteuser?userId=<%=u.getUserId()%>">Delete</a>|<a href="edituser?userId=<%=u.getUserId()%>">Edit</a>| 
			<a href="deleteuser2/<%=u.getUserId()%>">Delete2 </a>
			</td>
		</tr>
		<%
		}
		%>
	</table>


</body>
</html>