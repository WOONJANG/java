<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js2 - cookie 생성</title>
</head>
<body>
<%
	String user = "hong";
	String email = "hong@test.com";
	
	Cookie ck1 = new Cookie("name",user);	// 쿠키값 생성
	response.addCookie(ck1);	// 생성한 쿠키값을 서버에 전송
	Cookie ck2 = new Cookie("mail",email);
	response.addCookie(ck2);
%>

이름 : <%=ck1 %>
이메일 : <%=ck2 %>

</body>
</html>