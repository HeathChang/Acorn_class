<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login2.jsp<br>
id: ${login.userid }<br>
passwd: ${login.passwd }<br>

<%= request.getAttribute("login") %>
</body>
</html>