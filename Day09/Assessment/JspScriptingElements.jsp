<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP Declaration tag --%>
	<%!String name = "Pranav";
	int a = 10, b = 20;%>
	
	<%-- JSP Scriptlet tag --%>
	<%
	out.println("<br>Welcome " + name);
	if (a > b) {
		out.println("<br>a is big");//out is the implicit object in JSP
	} else {
		out.println("<br>b is big");
	}
	int sum = a + b;
	%>
	
	<br>
	<%-- JSP Expression tag --%>
	sum = <%=sum %>
	
</body>
</html>