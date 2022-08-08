<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 반복문 응용</title>
</head>
<body>
	<!-- JSP 코드에 HTML TAG를 넣지 않음 -->
	<table border="1" cellpadding="0" cellspacing="0"  >
		
		<% for (int f=1 ; f<5; f++){ %>
		<tr>
			<% for (int ff=1 ; ff<5; ff++){ %>
			<td style="width: 100px; height: 30px;"></td>
			<%}%>
		</tr>
		<%}%>
	</table>
	<br><br><br><br><br><br><br><br><br><br><br>

	<table border="1" cellpadding="0" cellspacing="0" >
		 <% for (int f =1; f < 9 ; f++){ %>
		 <%if(f %2 == 0){%>
			<tr style="background-color: blue;">
		<%} else{ %>
			<tr style="background-color: white;">
		<%}%>
		<td style="width: 300px; height: 30px;">
		</tr>
			<%} %>
	</table>
	<br><br><br><br>
	<table border="1" cellpadding="0" cellspacing="0" >
		<% int w=1;
			while(w<9){
			if( w %2 == 0){ %>
				<tr><td style="width: 300px; height: 30px; background-color: red;"></td></tr>
				<%}
			else{ %>
				<tr><td style="width: 300px; height: 30px; background-color: white;"></td></tr>
			<%}%>
			<% w++;	} %>
	</table>
	
</body>
</html>