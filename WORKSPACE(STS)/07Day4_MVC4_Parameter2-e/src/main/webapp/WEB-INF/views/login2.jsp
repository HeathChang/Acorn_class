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


<P> login2.jsp</P>
이름: ${login.userid} <br>
나이: ${login.passwd} <br>
passwd:${login.passwd} <br>
<%=request.getAttribute("login") %> <br> 



========${dto.userid}
</body>
</html>
