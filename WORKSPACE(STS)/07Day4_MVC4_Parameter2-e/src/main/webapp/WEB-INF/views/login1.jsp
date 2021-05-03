<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="com.dto.LoginDTO"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P> login1.jsp </P>
id: ${loginDTO.userid} <br> <!--key가 없을 경우, 소문자 Class이름. 멤버변수  -->
passwd: ${loginDTO.passwd} <br>

<% 
LoginDTO dto= (LoginDTO)request.getAttribute("loginDTO");
String name = dto.getUserid();
out.print(name+"<br>");

%>

========${dto.userid}
</body>
</html>
