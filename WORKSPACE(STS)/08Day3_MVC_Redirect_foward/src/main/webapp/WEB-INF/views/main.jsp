<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main.jsp 호출 <br>
1. el: ${userid} <br>
1. el: ${passwd} <br>

2. request.getAttribute("userid"):  <%=request.getAttribute("userid") %> <br>
2. request.getAttribute("passwd"):<%=request.getAttribute("passwd") %> <br>

3. request.getParameter("userid"): <%=request.getParameter("userid") %><br>
3.request.getParameter("passwd"):  <%=request.getParameter("passwd") %><br>
</body>
</html>