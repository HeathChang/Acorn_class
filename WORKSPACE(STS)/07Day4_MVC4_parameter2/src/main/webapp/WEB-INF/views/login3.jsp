<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login3.jsp<br>
dto.userid <br>
id: ${dto.userid }<br>
passwd: ${dto.passwd }<br>
<hr>
xxx.id: ${xxx.userid}<br>
xxx.passwd: ${xxx.passwd}<br>
<%= request.getAttribute("xxx") %>
</body>
</html>