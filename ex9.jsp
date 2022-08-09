<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP2일차 2 SPA응용</title>
</head>
<body>
<!--  응용문제
	사용자가 숫자 1부터 9까지 선택 
	해당 숫자를 선택 후 전송 버튼을 클릭시 해당 숫자에 맞는 구구단을 출력하시오 -->
	
	<%
	request.setCharacterEncoding("UTF-8");
	String gu = request.getParameter("gugu");
	if(gu != null){%>
		<table border="1" style="text-align: center;">
		<%
			int c = Integer.parseInt(gu);
			for(int b = 1; b <=9; b++){
			int result = (c*b);
		%>
		<tr><td width=100px height=30px><%=c%> * <%=b%> = <%=result%></td></tr>
		<%}%>
		</table>
		<%
	}else{
	%>
		<form name="frm" id="frm" method="post" action="./ex9.jsp">
		<select name="gugu">
			<%for (int a=1;a<=9; a++){%>
			<option value="<%=a%>"><%=a%>단</option>
			<%}%>
		</select>
	<input type="submit" value="전송">
	<%} %>
</form>
</body>
</html>