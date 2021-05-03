<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>login.jsp</h1>

sessionScope.member.userid: ${sessionScope.member.userid} <br>
sessionScope.member.passwd: ${sessionScope.member.passwd} <br>
<hr>
member.userid: ${member.userid} <br>
member.passwd: ${member.passwd} <br>
<hr>


<%= session.getAttribute("member")%>
<hr>
<a href="logout"> 로그아웃 </a>
</body>
</html>
