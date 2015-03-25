<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- <jsp:forward page="/login.jsp"></jsp:forward> --%>

<%

	 response.sendRedirect(request.getContextPath() + "/faces/login.xhtml"); 
%>