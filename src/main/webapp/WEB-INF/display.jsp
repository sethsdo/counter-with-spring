
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Counter</h1>
	<h4><a href="count">Counter</a></h4>
	<h4>You have visited Localhost:8080... <c:out value="${sessionAttribute}"/></h4>
	<h4><a href="/">Test another visit?</a></h4>
</body>
</html>