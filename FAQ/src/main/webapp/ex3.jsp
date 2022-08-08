<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    	contentType="text/html; charset=UTF-8 : HTML에서 JSP 페이지를 적용할 때 코드라인을 사용하지 않아도 무방함
    	text/html : html에서 jsp 변환
    	text/xml : xml로 변환
    	text/plain : 코드가 전부 출력
     -->
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>JSP 1일차3 반목문1</title>
<script>
	function allcheck() {
			   if(document.getElementById("all").checked==true){  
			         for(var i=0;i<6;i++) document.getElementsByName("ck")[i].checked=true;  
			      }
			      if(document.getElementById("all").checked==false){
			         for(var i=0;i<6;i++) document.getElementsByName("ck")[i].checked=false;  
			      }
	}
</script>
</head>
<body>
	<% for(int f = 1; f <= 5; f++){ %>
	<input type="radio" name="rd" id="rd<%=f %>" >설문조사 <%=f %>
	<%} %>
	<br><br><br><br><br><br><br><br><br><br><br>
	
	
	
	
	
	<input type="checkbox" name="all" id="all" onclick="allcheck()"> 전체선택<br>
	<%
	int w =1;
	while (w < 7) {%>
	<input type="checkbox" name="ck" id="ck<%=w%>">체크<%=w%><br>
<%	w++;
	  }%>
	<br><br><br><br><br><br><br><br><br><br><br>
	
	<select>
		<option value="">메뉴를 선택해 주세요</option>
		<% int dw = 0;
			do{
		%>
			<option value="<%=dw %>">메뉴<%=dw %></option>
		<%
		dw++;
		}while(dw < 6); %>
	</select>
	
	
	
	
	
	
</body>
</html>