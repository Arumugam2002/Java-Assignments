<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1>Registration Form</h1>
	
	
	<%
	
		String msg = (String)request.getAttribute("msg");
	%>
	
	
	<%if(msg!=null){ %>
	<h3><%out.print(msg); %></h3>
	<%}%>
	
	
	
	

	<form action="UserController" method="post">
		<table>
			<tr>

				<td>Name:-</td>
				<td><input type="text" name = "name"></td>
			</tr>
			
			<tr>
			
			<td>Contact:- </td>
				<td><input type = "number" name = "contact"></td>
			</tr>
			
				<tr>
			
			<td>Address:- </td>
				<td><input type = "text" name = "address"></td>
			</tr>
			
				<tr>
			
			<td>Email:- </td>
				<td><input type = "email" name = "email"></td>
			</tr>
			
				<tr>
			
			<td>Password:- </td>
				<td><input type = "password" name = "password"></td>
			</tr>
			
			<tr>
			
			
				<td><input type = "submit" name = "action" value="register"></td>
			</tr>

		</table>



	</form>


</body>
</html>