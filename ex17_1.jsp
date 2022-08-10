<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - ex17와 연동</title>
</head>
<body>
<%
// 	String name = "홍길동님 반갑습니다.";
// 	out.print(name);
	String name = "이순신님 반갑습니다.";
%>
<p>ex17_1 페이지입니다.</p>
<%=(new Date().toLocaleString()) %>
<%=name %>
</body>
</html>