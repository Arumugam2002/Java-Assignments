<%@page import="java.util.List"%>
<%@page import="dao.UserDao"%>
<%@page import="model.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Home Page</title>
</head>
<body>

<%
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache"); 
response.setHeader ("Expires", "0"); //prevents caching at the proxy server
%>

<%
User u =null;
if(session.getAttribute("data")!=null)
{
	u = (User) session.getAttribute("data");
	
}

%>

<h1>User Information</h1>

<h3>
ID:- 
<%= u.getId()%>

</h3>

<h3>
Name:- 
<%= u.getName()%>

</h3>

<h3>
Contact:- 
<%= u.getContact()%>

</h3>
<h3>
Address:- 
<%= u.getAddress()%>

</h3>
<h3>
Email:- 
<%= u.getEmail()%>

</h3>


<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Contact</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      
      
    </tr>
  </thead>
  <% List <User> list = UserDao.getAllUsers();%>
  <tbody>
  <%for(User u1:list){ %>
  
    <tr>
      
      <td><%=u1.getId() %></td>
      <td><%=u1.getName() %></td>
      <td><%=u1.getContact() %></td>
      <td><%=u1.getAddress() %></td>
      <td><%=u1.getEmail()%></td>
      <td><%=u1.getPassword()%></td>
     	<td> 
     
      <form action="UserController" method="post">
      
		<input type="hidden" name="id" value="<%= u1.getId()%>"> 
		<input type = "submit" name = "action" value="edit">
			
			
      
      </form>
      
      
      </td>
      
      <td> 
     
      <form action="UserController" method="post">
      
		<input type="hidden" name="id" value="<%= u1.getId()%>"> 
		<input type = "submit" name = "action" value="delete">
			
			
      
      </form>
      
      
      </td>
      
      
     
      
      
    </tr>
    <%}%>
    
    
    
  </tbody>
</table>

<a href="logout.jsp">Logout</a>



</body>
</html>