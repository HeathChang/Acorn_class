<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title> ﻿
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#aaa").on("click", function() {
			//client브라우저 -> controller로 json을 비동기 전송
			$.ajax({
				url : "aaa",
				type : "post",
				datatype : "text", //json 타입으로 데이터 받음
				headers:{
					"Content-Type":"application/json"
				},
				data:JSON.stringify({userid:"홍길동",passwd:"1234"}), //json을 문자열화 전송
				success : function(data, status, xhr) {
					console.log(data);
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});//end ajax

		})//end aaa
		
		$("#bbb").on("click", function() {
			$.ajax({
				url : "bbb",
				type : "post",
				datatype : "text", //json 타입으로 데이터 받음
				headers:{
					"Content-Type":"application/json"
				},
				data:JSON.stringify(
				[
				{userid:"유관순1",passwd:"1234"},	
				{userid:"유관순2",passwd:"4567"}	
				]
				), //json을 문자열화 전송
				success : function(data, status, xhr) {
					console.log(data);
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});//end ajax

		})//end aaa
		
		
	})
</script>
</head>
<body>
	main.jsp~~~~~~~~~~~~~~~~~~~~~~
	<br>
<button id="aaa">aaa호출</button><br>
<button id="bbb">bbb호출</button><br>


</body>
</html>