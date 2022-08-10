<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex23.jsp 에 대한 추가 데이터 출력 파트</title>
</head>
<body>
<%
	String pnm = request.getParameter("person").intern();
	if(pnm == "강감찬"){
		int point = 5300;
		String sales = "15%";
		request.setAttribute("point", point);
		request.setAttribute("sales", sales);
	}
	else{
		out.print("error");
	}
%>
<p>보유 적립금 : ${point}</p>
<p>회원 등급 할인 정책 : ${sales}</p>
</body>
</html>