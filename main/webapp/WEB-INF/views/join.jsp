<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자회사몰 회원가입</title>
</head>
<body>
	<form name="f" method="post" action="./joinok.do">
		아이디<input type="text" name="userid"><br>
		이름<input type="text" name="username"><br>
		이메일<input type="text" name="useremail"><br>
		<input type="button" value="회원가입" onclick="ok();">
	</form>
</body>
<script>
	function ok() {
		if(f.userid.value==""||f.username.value==""||f.useremail.value==""){
			alert("정보를 전부 입력하세요")
		}else{
			f.submit();
		}
	}
</script>
</html>