<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이스 인증 체크 페이지</title>
</head>
<script>
	function user_check() {
		if (f.username == "") {
			alert("이름 입력")
		} else if (f.usertel == "") {
			alert("전화번호 형식이 올바르지 않음")
		} else {
			f.submit();
		}
	}
</script>
<body>
	<form name="f" method="post" action="nice_joinok.do" enctype="application/x-www-form-urlencoded">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="usertel" placeholder="※ '-' 없이 숫자만 입력"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="본인 인증확인" onclick="user_check()"></td>
			</tr>
		</table>
	</form>
</body>
</html>