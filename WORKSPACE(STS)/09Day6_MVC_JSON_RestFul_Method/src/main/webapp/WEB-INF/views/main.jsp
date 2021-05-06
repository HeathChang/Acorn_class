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
		$("#get").on("click", function() {
			$.ajax({
				url : "board",
				type : "get",
				datatype : "text", //json 타입으로 데이터 받음
				success : function(data, status, xhr) {
					console.log(data,"success");
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});//end ajax

		})//end get 
		$("#post").on("click", function() {
			$.ajax({
				url : "board",
				type : "post",
				datatype : "text", //json 타입으로 데이터 받음
				success : function(data, status, xhr) {
					console.log(data,"success");
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});//end ajax

		})//end post
		$("#put").on("click", function() {
			$.ajax({
				url : "board",
				type : "put",
				datatype : "text", //json 타입으로 데이터 받음
				success : function(data, status, xhr) {
					console.log(data,"success");
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});//end ajax

		})//end put
		
		$("#delete").on("click", function() {
			$.ajax({
				url : "board",
				type : "delete",
				datatype : "text", //json 타입으로 데이터 받음
				success : function(data, status, xhr) {
					console.log(data,"success");
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});//end ajax

		})//end delete

	})
</script>
</head>
<body>
main.jsp<br>
<button id="get">get</button><br>
<button id="post">post</button><br>
<button id="put">put</button><br>
<button id="delete">delete</button><br>


</body>
</html>