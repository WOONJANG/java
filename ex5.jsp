<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 선택문 </title>
</head>
<body>
	
	<%
		String level = "3";
		String msg = "";
		switch (level){
		case "1" :
			msg = "일반회원";
			break;
		case "2" :
			msg = "실버회원";
			break;
		case "3" :
			msg = "골드회원";
			break;
		default :
			msg = "미가입회원";
			break;
		}
	%>
	<input type="text" value="<%=msg%>" readonly>
	<br><br><br><br><br><br><br><br><br><br><br>
	
	
	<!-- 배열로 찍기 -->
	<%String list[] = {"무통장입금","신용카드","도서상품권","휴대폰결제"};%>
	<%for (int f=0;f < list.length; f++){ %>
	<input type="radio"value="<%=list[f]%>"><%=list[f]%>
	<%} %>
	<br><br><br><br><br><br><br><br><br><br><br>
	
	<!--  응용문제 : 반목문 + switch문 -->
	
	<%for(int ff=1; ff < 5; ff++){
	String payment = "";
		switch(ff){
		case 1 : 
			payment = "무통장입금";
		break;
		case 2 :
			payment = "신용카드";
		break;
		case 3 : 
			payment = "도서상품권";
		break;
		case 4 :
			payment = "휴대폰결제";
		break;
		}
		%>
		<input type="radio" name="payment" value="<%=payment%>"><%=payment%>
		<% }%>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>