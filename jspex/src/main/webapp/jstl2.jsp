<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core"%>
<%	
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	String nb = request.getParameter("number");
	String nm = request.getParameter("user");
%>
<jh:set var="n" value="<%=nb%>"></jh:set>
<jh:set var="m" value="<%=nm%>"></jh:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl2.html 연동</title>
</head>
<body>
<!-- 
	when : choose태그와 함께 사용하는 태그명 : 참일 경우
	otherwise : 거짓일 경우
 -->
	<jh:choose>
		<jh:when test="${n%2==0}">
			<jh:out value="${n}"></jh:out>은 짝수 입니다.
		</jh:when>
		<jh:when test="${n%2!=0}">
			<jh:out value="${n}"></jh:out>은 홀수 입니다.
		</jh:when>
	</jh:choose>

	<jh:if test="${m == '홍길동'}">
		<span>가입고객 입니다.</span>
	</jh:if>
	<jh:if test="${m == '이순신'}">
		<span>가입고객 입니다.</span>
	</jh:if>
	
</body>
</html>