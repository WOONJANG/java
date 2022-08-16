<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js2 - cookie 삭제</title>
</head>
<body>
<%

	Cookie[] ck = request.getCookies();	// server에서 쿠키값을 가져옴
	
	ck[1].setMaxAge(0);	// client 쿠키 모두 삭제
	ck[2].setMaxAge(0);
	response.addCookie(ck[1]);	// 삭제된 쿠키값을 server에 재 전송
	response.addCookie(ck[2]);
%>
</body>
</html>