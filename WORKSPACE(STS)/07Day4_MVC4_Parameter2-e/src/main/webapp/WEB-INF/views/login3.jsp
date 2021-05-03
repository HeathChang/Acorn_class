<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.dto.LoginDTO"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


<P> login3.jsp</P>
이름: dto.userid <br>

id: ${dto.userid} <br>
pw: ${login.passwd} <br>

<hr>
xxx.id ${xxx.userid} <br>
xxx.passwd: ${xxx.passwd} <br>

<%=request.getAttribute("xxx") %>

</body>
</html>
