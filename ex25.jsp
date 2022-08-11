<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - 내장객체들 설명</title>
</head>
<body>
<!-- 내장객체 : JAVA or import or Library 사용하지 않고 사용하는 명령어들 -->
<!-- 전달시, 무조건 name or get으로 보낼 때에는 파라미터 이름으로 보내야함 -->
<!-- getParameter : 특정 name값을 전달 받을 때 사용 -->
<!-- getParameterValues : 특정 name값을 전달 받지만 배열형태로 받음 -->
<!-- getParameterNames : 모든 name값을 전부 가져옴 (Enumeration) 객체 타입형태 String,int,double,float...(X) Enumeration(O) -->
<!-- getParameterMap : Map객체 타입으로 전달 받는 형태 ("파라미터이름","값") -->

<%request.setCharacterEncoding("UTF-8");%>
<% 
// 	request.getParameter(name);
// 	request.getParameterValues(name);
// 	request.getParameterNames();
// 	request.getParameterMap();
%>
	
<!-- [접속자 정보를 확인 하는 경우] -->
<!-- getHeader("host") : 접속자에 대한 도메인 호스트 URL 및 포트번호 -->
<!-- getHeader("accept-language") : 페이지 제작에 대한 언어패킷 -->
<!-- getHeader("User-Agent") : 접속 기기를 활인할 때 사용 -->
<!-- request.getRemoteAddr() / request.getRemoteHost() : Client IP Address 확인 -->
<!-- getRequestURI() : 도메인(X) URI 경로 및 페이지명 출력 -->
<!-- getMethod() : 전송방식(GET,POST)  -->
<!-- getQueryString() : 파라미터 문자열을 가져옴-->
<!-- response.sendRedirect("URL") : URL 강제 이동  -->

<%	
	String a = request.getHeader("host");
	String b = request.getHeader("accept-language");
	String c = request.getHeader("User-Agent");
	String d = request.getHeader("X-Forwarded-For");
	String e = request.getRemoteAddr();	// 0:0:0...
	String f = request.getRemoteHost();
	String g = request.getMethod();	// servlet (service)
	String h = request.getQueryString();
	response.sendRedirect("http://naver.com");
	
	/*	내장객체 X(import 사용) - 본 서버에서 확인 가능	*/
	InetAddress ia = InetAddress.getLocalHost();
	ia = InetAddress.getLocalHost();
%>
<%
	out.print(a);
%>
<br>
<%
	out.print(b);
%>
<br>
<%
	out.print(c);
%>
<br>
<%
	out.print(d);
%>
<br>
<%
	out.print(e);
%>
<br>
<%
	out.print(f);
%>
<br>
<%
	out.print(g);
%>
<br>
<%
	out.print(h);
%>
<br>
<%
	out.print(ia);
%>
</body>
</html>