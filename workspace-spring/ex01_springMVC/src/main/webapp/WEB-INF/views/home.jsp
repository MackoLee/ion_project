<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<P>  The time on the server is ${serverTime}. </P>
<img alt="" src="resources/puppy.png"/> <!--  -->
<h3>경로 확인하기</h3>
<%= request.getContextPath() %> <br>
<%= request.getRequestURI() %> <br>
<%= request.getServletPath() %> <br>
<%= request.getContextPath() %> <br>
<%= application.getContextPath() %> <br>
<%= pageContext.getServletContext().getContextPath() %> <br>
<br>

${ pageContext.request.contextPath }

</body>
</html>
