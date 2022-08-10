<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 -include 값 받기 </title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<%
	String a = request.getParameter("mid");
	String b = request.getParameter("mnm");
	String c = "text";
%>
아이디 : <%=a %><br>
이름 : <%=b %>
<jsp:include page="./ex21_2.jsp" flush="false">
	<jsp:param value="연습입니다" name="c"></jsp:param>
</jsp:include>
</body>
</html>