<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(e){
		 $("form").submit(function(e) {
			var userid=$("#userid").val();
			var passwd=$("#passwd").val();
			if(userid.length==0){
				alert("id를 입력해주세요");
				e.preventDefault();
			} else if(passwd.length==0){
				alert("pw를 입력해주세요");
				e.preventDefault();
			}
		}) 
		
});

</script>    
<form action="LoginServlet" method="get">
아이디:<input type="text" name="userid" id="userid"><br>
비밀번호:<input type="text" name="passwd" id="passwd"><br> 
<input type="submit" value="로그인">
<input type="reset" value="취소">
<a href="MemberIdSearchUIServlet"> 아이디찾기 </a>
</form>

