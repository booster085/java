<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>
<% 
session.invalidate(); //greshno e 
response.sendRedirect("faces/login.xhtml");
%>
</h3>

</body>
</html>