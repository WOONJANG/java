<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 SQL 연동 select1</title>
</head>
<body>
<%@ include file="dbconnect.jsp" %>	<!-- DB 접속 환경 -->
<%
		String SQL = "select * from poll";	// SQL 문법
		
		try{
			PreparedStatement PS = CON.prepareStatement(SQL);	// prepareStatement : SQL 문법을 실행 시키는 클래스
			ResultSet RS = PS.executeQuery();	// ResultSet : select 에서만 사용함
			while(RS.next()){	// SQL에 있는 데이터를 반복시킴
				// getString : 문자
				// getInt : 숫자
				// getBoolean : treu / false
				// getfloat 
				// etc...
%>				
				<ul>
					<li>고유번호 : <%=RS.getString("pidx") %></li>
					<li>고객명 : <%=RS.getString("pname") %></li>
					<li>아이디 : <%=RS.getString("pid") %></li>
					<li>연락처 : <%=RS.getString("ptel") %></li>
					<li>설문조사내용 : <%=RS.getString("ptext") %></li>
					<li>참여일자 : <%=RS.getString("pdate").substring(0,19) %></li>
				</ul>
<%
			}
		}catch(Exception e){
			out.print("DB CONNECT FAIL OR TABLE ERROR");
		}finally{	// DB 연결 및 출력 모두 완료 되면 DB 접속 해제
			if(CON != null){
				CON.close();
			}
		}
		
		
	%>
</body>
</html>