<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b><font color = 'green'>Welcome <%= session.getAttribute("username") %></font></b>
	<%
		Cookie[] cookies = request.getCookies();
		out.println("<p><b><font color='green'>Welcome "+ cookies[1].getValue()+ "</font></b></p>");
	%>
</body>
</html>