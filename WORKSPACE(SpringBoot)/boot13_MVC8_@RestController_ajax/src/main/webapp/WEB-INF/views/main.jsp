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
	  
	   $("#e").on("click",function(){
			  //Ajax
			  $.ajax({
				 url:'eee',
				 type:'get',
				 dataType:'xml',
				 success:function(data,status,xhr){
					 console.log(data);
					 $("#result").text(data);
				 },
				 error:function(xhr,status,error){
				 }
			  });
		   });
	   
	   $("#d").on("click",function(){
			  //Ajax
			  $.ajax({
				 url:'ddd',
				 type:'get',
				 dataType:'html',//////
				 success:function(data,status,xhr){
					 $("#result").html(data);/////////
				 },
				 error:function(xhr,status,error){
				 }
			  });
		   });
	   
	   
	   $("#c").on("click",function(){
			  //Ajax
			  $.ajax({
				 url:'ccc',
				 type:'get',
				 dataType:'text',
				 success:function(data,status,xhr){
					 $("#result").text(data);
				 },
				 error:function(xhr,status,error){
				 }
			  });
		   });//end c 
	   
	   $("#b").on("click",function(){
			  //Ajax
			  $.ajax({
				 url:'bbb',
				 type:'get',
				 dataType:'json',
				 success:function(data,status,xhr){
					 console.log(data);
					 $("#result").text(JSON.stringify(data));
				 },
				 error:function(xhr,status,error){
				 }
			  });
		   });//end b 

	   
	   $("#a").on("click",function(){
		  //Ajax
		  $.ajax({
			 url:'aaa',
			 type:'get',
			 dataType:'json',
			 success:function(data,status,xhr){
				 $("#result").text(JSON.stringify(data));
			 },
			 error:function(xhr,status,error){
			 }
		  });
	   });//end a
   });
  
</script> 

</head>
<body>
<button id="a">LoginDTO</button>
<button id="b">ArrayList</button>
<button id="c">String</button>
<button id="d">html</button>
<button id="e">xml</button>
<div id="result"></div>
</body>
</html>