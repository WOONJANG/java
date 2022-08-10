<%@page import="config.ex23"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSP 3일차 - JAVA(ex23.java 연동)</title>
</head>
<body>
<%
/*	권장사항X 기본지식정도로 알고있기(속도가 급격하게 떨어짐, 메모리도 많이 씀):static써야함	*/
// 	ex23 ex = new ex23();
// 	ex.inname();
%>
	<jsp:useBean id="abc" class="config.ex23" scope="request">
<!-- 	useBean : Java 파일에 대한 Class를 로드할 때 사용하는 jsp tag -->
<%-- 	<% abc.inname(); %> --%>
<%
	abc.inname2("강감찬", "골드회원");
	request.setCharacterEncoding("UTF-8");
%>
	</jsp:useBean>
	<p>고객명 : <%=abc.names() %></p>
	<p>고객등급 : <%=abc.level() %></p>
<jsp:include page="ex23_1.jsp">
	<jsp:param value="<%=abc.names() %>" name="person"></jsp:param>
</jsp:include>
</body>
</html>