<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 값 받기 (form)</title>
</head>
<body>
<!-- post 로 전송시, 해당 문법을 사용해야함 -->
	<%request.setCharacterEncoding("UTF-8"); %> 
	<!-- GET 전송시는 server.xml에 URIEncoding="UTf-8"
		사용시 endcoding 하지 않아도 한글이 깨지지 않음 -->
	<%=request.getParameter("mid") %>
	
</body>
</html>