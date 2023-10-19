<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("userName") == null){
		response.sendRedirect("login.jsp");
	}
%>
<h1>Welcome to profile page, <%= session.getAttribute("userName") %></h1>

<form action="LogoutServlet">
<input type="submit" value="Logout">
</form>
</body>
</html>