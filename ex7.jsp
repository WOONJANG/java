<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 값 전딜 (form)</title>
<script>
	function abc() {
		frm.submit();
	}
</script>
</head>
<body>
	<!-- FORM 전송 -->
	<form name="frm" id="frm" method="get" action="./ex7_1.jsp">
		<input type="text" name="mid">
		<input type="button" value="전송" onclick="abc()">
	</form>
</body>
</html>