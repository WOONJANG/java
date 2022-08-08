<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>JSP 1일차 -기본문법</title>
	</head>
	<body>
	
		
<%-- <%(JSP시작) %>(JSP마지막) --%>
<%-- <%!.....%>  자바 벼ㅛㄴ수나 메소드를 정의할 때 사용함--%> 
<%-- <%=...%> 해당 값을 출력하는 문자열, 숫자열 --%>
<%-- <%@...%> 레지ㅣ 속성지정 & 외부 페이지를 로드할 수 있음 --%>
<%@ include file="./ex2.jsp" %>

<%!
	int a;
	int b;
	public int sum(int aa, int bb){
		
	return aa+bb;
	}
%>

<!-- JSP -->
<%
	a = 20;
	b = 10;
	out.print(sum(a,b));	// out.print() JSP 출력 구문
%>
<!-- JSP 문법만 사용 -->
	<ul>
	<% for(int i=0; i < 10; i++){ %>
		<li><%=i %></li>
		<%} %>
	</ul>



	</body>
</html>