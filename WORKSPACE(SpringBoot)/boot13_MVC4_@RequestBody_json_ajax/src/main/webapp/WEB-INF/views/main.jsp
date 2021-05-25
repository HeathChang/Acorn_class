<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
<script type="text/javascript">
   
   $(document).ready(function(){
	   
	   $("#b").on("click",function(){
			  //Ajax
			  $.ajax({
				 url:'bbb',
				 type:'post',  //post만 가능
				 dataType:'text',
				 headers:{
						"Content-Type":"application/json" 
					 },
					 //[{userid:'홍길동',passwd:'1234'},{userid:'홍길동',passwd:'1234'}]==>LoginDTO 자동저장
				 data:JSON.stringify([{userid:'홍길동',passwd:'1234'},{userid:'홍길동2',passwd:'9999'}]),
				 success:function(data,status,xhr){
					 console.log(data);
					 $("#result").text(data);
				 },
				 error:function(xhr,status,error){
				 }
			  });
		   });

	   $("#a").on("click",function(){
		  //Ajax
		  $.ajax({
			 url:'aaa',
			 type:'post',  //post만 가능
			 dataType:'text',
			 headers:{
				"Content-Type":"application/json" 
			 },
			 //{userid:'홍길동',passwd:'1234'}==>LoginDTO 자동저장
			 data:JSON.stringify({userid:'홍길동',passwd:'1234'}),
			 success:function(data,status,xhr){
				 console.log(data);
				 $("#result").text(data);
			 },	 
			 error:function(xhr,status,error){
			 }
		  });
	   });
	   
	   $("#z").on("click",function(){
			  //Ajax
			  $.ajax({
				 url:'zzz',
				 type:'get',  
				 dataType:'text',
				 data:{
				    'userid':"홍길동",
				    'passwd':'1234'
				 },
				 success:function(data,status,xhr){
					 console.log(data);
					 $("#result").text(data);
				 },
				 error:function(xhr,status,error){
				 }
			  });
		   });
   });
  
</script> 

</head>
<body>
<button id="z">일반파라미터</button>
<button id="a">LoginDTO</button>
<button id="b">ArrayList</button>
<div id="result"></div>
</body>
</html>