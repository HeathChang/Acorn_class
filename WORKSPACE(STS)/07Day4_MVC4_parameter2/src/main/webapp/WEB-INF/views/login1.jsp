<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login1.jsp<br>
id: ${loginDTO.userid }<br><!--  key가 없을 경우  소문자Class이름.멤벼변수  -->
passwd: ${loginDTO.passwd }<br>
<% LoginDTO dto= (LoginDTO)request.getAttribute("loginDTO");
	String name= dto.getUserid();
	out.print(name+"<br>");
%>
<hr>
===========    ${dto.userid}
</body>
</html>