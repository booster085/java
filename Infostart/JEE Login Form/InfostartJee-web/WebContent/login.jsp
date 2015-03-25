<%@ page import="java.util.Random" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Infostart first JEE application</title>
</head>
<body>

	<h1>
		<%
			out.println("Login Form");
		%>
	</h1>
	<p>
	 <form method="POST" action="<%=request.getContextPath()%>/loginServlet">
	 
	 Username: <input type="text" name="username" />
	 <br></br>
	 Password: <input type="password" name="password" />
	 <br></br>
	 <input type="submit" value="Login" />
	 </form>
	
	</p>
</body>
</html>