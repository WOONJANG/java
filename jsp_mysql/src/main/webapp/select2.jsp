<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 SQL 연동 select2</title>
<style>
	tr:nth-child(even) {
		background-color: #ccc; 
	}
</style>
</head>
<body>
<%@ include file="dbconnect.jsp" %>
<%
		String SQL = "select * from poll order by pidx desc";
		String COUNT_SQL = "select ptext, count(*) from poll where ptext group by ptext";
		
			ArrayList<Map<String,Object>> AL = null;
		try{
			PreparedStatement PS = CON.prepareStatement(SQL);
			ResultSet RS = PS.executeQuery();
			
			AL = new ArrayList<>();
			
			while(RS.next()){
				
				Map<String,Object> MP = new HashMap<>();
				MP.put("pidx", RS.getString("pidx"));
				MP.put("pname", RS.getString("pname"));
				MP.put("pid", RS.getString("pid"));
				MP.put("ptel", RS.getString("ptel"));
				MP.put("ptext", RS.getString("ptext"));
				MP.put("pdate", RS.getString("pdate").subSequence(0,19));
				AL.add(MP);
			}
		}catch(Exception e){
			out.print("DB CONNECT FAIL OR TABLE ERROR");
		}finally{	
			if(CON != null){
				CON.close();
			}
		}
%>
<%
	int w = 0;
	while(w < AL.size()){
// 		JSP TAG 사용 이유는 설문조서 0 ~ 4 내용이 확인이 안됨
// 		switch.jsp에서 사용자가 어떤 내용에 대한 설문조사 응하였는지 확인
%>
<jsp:include page="./switch.jsp">
	<jsp:param value='<%=(String) AL.get(w).get("ptext") %>' name="CATEGORY"></jsp:param>
</jsp:include>
<%
	// set Attribute로 생성된 가변수명을 getAttribute로 받아서
	// 처리 또는 ${MSG} 액션태그로 바로 출력 가능
// 	String MSG = (String)request.getAttribute("MSG");
%>
	<table border="1" cellpadding="0" cellspacing="0" style="text-align: center; margin : 10px;">
		<tr>
			<td>고유번호</td>
			<td><%=AL.get(w).get("pidx") %></td>
		</tr>
		<tr>
			<td>고객명</td>
			<td><%=AL.get(w).get("pname") %></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=AL.get(w).get("pid") %></td>
		</tr>
		<tr>
			<td>연락처</td>
			<td><%=AL.get(w).get("ptel") %></td>
		</tr>
		<tr>
			<td>설문조사내용</td>
			<td>${MSG}</td>
		</tr>
		<tr>
			<td>참여일자</td>
			<td><%=AL.get(w).get("pdate") %></td>
		</tr>
	</table>


<!-- 				<ul> -->
<%-- 					<li>고유번호 : <%=AL.get(w).get("pidx") %></li> --%>
<%-- 					<li>고객명 : <%=AL.get(w).get("pname") %></li> --%>
<%-- 					<li>아이디 : <%=AL.get(w).get("pid") %></li> --%>
<%-- 					<li>연락처 : <%=AL.get(w).get("ptel") %></li> --%>
<%-- 					<li>설문조사내용 : ${MSG} </li> --%>
<%-- 					<li>참여일자 : <%=AL.get(w).get("pdate") %></li> --%>
<!-- 				</ul> -->
<%		
		w++;
	}
%>
</body>
</html>