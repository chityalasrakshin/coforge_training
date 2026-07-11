<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>
	Factorial of <%= request.getParameter("n") %>
	is : <%= request.getParameter("fact") %>
	</b>
</body>
</html>