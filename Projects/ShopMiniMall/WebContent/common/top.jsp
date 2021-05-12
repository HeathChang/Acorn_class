<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	MemberDTO dto= (MemberDTO)session.getAttribute("login");
	if (dto!= null) {
%>
<h3> 어서오세요.<br> <%=dto.getUserid() %> 님, 환영합니다.</h3>

<a href="LogoutServlet"> 로그아웃</a>
<a href="MyPageServlet">myPage</a>
<a href="CartListServlet"> 장바구니 </a>
<%
	} else { //비회원인경우
%>
<!-- top 부분  -->
<a href="LoginUIServlet">로그인 </a>
<a href="MemberUIServlet">회원가입 </a>
<a href="CartListServlet"> 장바구니 </a>


<%
	}
%>
