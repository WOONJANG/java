<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 
core : 기본엔진
fn : 문자열 함수
sql : db연결
fmt(formattiong) : 시간 날짜 다국어
 -->
<%
	request.setCharacterEncoding("UTF-8");
	// 응용문제
	String data[] = {"홍길동","이순신","강감찬","유관순"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - jstl 반복문</title>
</head>
<body>
<!-- forEach : jstl의 반복문 출력 부분 -->
	<table border="1">
		<tr>
			<jh:forEach var="a" begin="1" end="5">
				<td><jh:out value="${a}"></jh:out></td>
			</jh:forEach>
		</tr>	
	</table>

<br><br><br>

	<jh:forEach var="b" begin="2" end="4">
		<jh:forEach var="c" begin="1" end="5">
			<span>${b} * ${c} = ${b*c}</span><br>
		</jh:forEach>
	</jh:forEach>

<br><br><br>
	
	<jh:set var="user" value="<%=data %>"></jh:set>
	<jh:forEach var="c" begin="0" end="<%=data.length %>">
		<span> ${user[c]}</span><br>
	</jh:forEach>
<br><br><br><br><br>
	 <jh:forEach var="d" begin="0" end="${fn:length(user)-1}">
   		고객명:${user[d]} <br>
	</jh:forEach>
<br><br><br><br>
	<jh:forEach var="e" items="${user}">
   		고객명:${e} <br>
	</jh:forEach>
	
	

	
</body>
</html>