<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 select 응용 + 배열 </title>
</head>
<body>
	
	
	<%
	int cate = 3;
	%>
	
	<select>
		<option value="">통신사 선택</option>
		
		<%
		String ck = "";
		for(int c=1; c<=4; c++){ 
			if(cate == c){
				ck= "selected";
			}
		%>
		<option value="<%=c%>" <%=ck%>>option<%=c %></option>
		<%}%>
	</select>	
	<br><br><br><br><br><br><br><br><br><br><br>
	
	<select>
		<%
		for(int c=1; c<=4; c++){ 
			if(cate == c){
				out.print("<option value='"+ c +"'selected>option" + c + "</option>");
			}
			else{
				out.print("<option value='" +  c+ "'>option" + c + "</option>");
			}
		 }%>
	</select>
	<br><br><br><br><br><br><br><br><br><br><br>
	
	
	<%! String data[] = {"홍길동", "이순신", "강감찬"};	%>
<!-- 	Java 배열값을 가져와서 JSP 반복문으로 출력 -->
	<% for(int aa=0; aa < data.length; aa++ ) {
		out.print("<span style='border='1px solid black'; display : block'>"+data[aa]+"</span>");
	}%>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>