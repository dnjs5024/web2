<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
function checkValue(){
	var nameObj = document.getElementById("name");
	if(nameObj.value.trim().length<2){
		alert('이름확인해주세요');
		return false;
		
	}
	var idObj = docement.getElementById('id');
	if(idObj.value.trim().length<4){
		alert('아이디를 확인해주세요');
	return false;
}
	var pwd = docement.getElementById('pwd');
	if(pwd.value.trim().length<4){
		alert('비밀번호 확인해주세요');
	return false;

</script>
	<form action="/member.do" method="post" onsubmit="return checkValue()">
		이름:<input type="text" id="name" name="name"><br> 아이디:<input
			type="text" id="id" name="id"><br> 비밀번호:<input
			type="password" id="pwd" name="pwd"><br> 기타:<input
			type="text" id="pwd" name="etc"><br>
		<button>회원가입</button>
	</form>
</body>
</html>