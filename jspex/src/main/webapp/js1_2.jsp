<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js1 - session 확인</title>
</head>
<body>

<%
	session.setMaxInactiveInterval(60 * 60);

	Object id = session.getAttribute("mid");
	String mail = (String)session.getAttribute("mail");
	Object level = session.getAttribute("lv");
%>

아이디 : <%=id %><br>
이메일 : <%=mail %><br>
레벨 : <%=level %><br>
</body>
</html>