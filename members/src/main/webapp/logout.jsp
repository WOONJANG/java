<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<title> 로그아웃 </title>
	</head>
	<body>
	
		<%= session.getAttribute("pid") %>
		<%= session.getAttribute("pnm") %>
		<% session.invalidate(); %> <!-- session 값을 초기화 -->
	</body>
	<script>
		alert("정상적으로 로그아웃")
		location.href='./index.html';
	</script>
</html>