<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	
</head>
<body>
<h1>
	Hello world!  
</h1>
	<form action="login" method="Post">
		Post방식:
		<br>
		아이디:
		<input type="text" name="userid"> <br> 
		비밀번호: 
		<input type="text" name="passwd"> <br> 
		<input type="submit" value="로그인">
		</form>
	<form action="login" method="get">
		Get방식:
		<br>
		아이디:
		<input type="text" name="userid"> <br> 
		비밀번호: 
		<input type="text" name="passwd"> <br> 
		<input type="submit" value="로그인">
		</form>
</body>
</html>
