<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%> <!--exception handling page  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
error.jsp <br>
isErrorPage="true" <br>
<%=exception.getMessage() %> <br>
<% out.print(exception.getMessage()); %>

</body>
</html>