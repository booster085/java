<%@ page import="java.util.Random" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Infostart first JEE application</title>
</head>
<body>

	<h3>
		<%
		Random rnd = new Random();
		
		int randomNum = rnd.nextInt(10);
		out.println("Random num = " + randomNum);
		%>
	</h3>
	<p>
		<a href="<%=request.getContextPath() %>/Factorial.jsp">Factorial</a>
		<a href="<%=request.getContextPath() %>/index.jsp">Hello World!</a>
	</p>
</body>
</html>