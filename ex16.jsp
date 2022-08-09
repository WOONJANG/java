<%@page import="java.io.ObjectInputStream.GetField"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./config.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSP 2일차 - 기본문법 형태 (날짜 출력)</title>
</head>
<body>
	<%
		Date day = new Date();	// 현재 날짜 KST : 한국시간 / UST : 미국시간
		out.print(day);
		int h = day.getHours();
		int m = day.getMinutes();
		int s = day.getSeconds();
		out.print(h + "시" + m + "분" + s + "초");
		%><br><%
		int y = day.getYear() + 1900;	// 2000년도 이상 되면 버그
		int mo = day.getMonth() + 1;
		int d = day.getDate() + 7;
		int w = day.getDay();
		
		String ww = Integer.toString(w);
		switch(w){
		case 1 :
			ww = "월";
			break;
		case 2 :
			ww = "화";
			break;
		case 3 :
			ww = "수";
			break;
		case 4 :
			ww = "목";
			break;
		case 5 :
			ww = "금";
			break;
		case 6 :
			ww = "토";
			break;
		case 7 :
			ww = "일";
			break;
		}
		out.print(y + "년 " + mo + "월 " + d + "일 " + ww + "요일");
	%>
</body>
</html>