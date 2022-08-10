<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex24 상품 검색 리스트 출력 파트</title>
</head>
<%@include file="./ex24.jsp" %>

<%
String product[][] = {
		{"딸기","",""},
		{"청포도 2Kg","35000","10%"},
		{"적포도 1Kg","18000","5%"}
};

request.setCharacterEncoding("UTF-8");
String search = request.getParameter("search").intern();

	String a_pnm = null;
	String a_pmoney = null;
	String a_psales = null;
	boolean ck = false;
%>
<%-- 	<jsp:include page="ex24.jsp"> --%>
<%-- 		<jsp:param value="<%=search %>" name="search"/> --%>
<%-- 	</jsp:include> --%>
<body>
<%

		int w = 0;
		while(w < product.length){
			if(product[w][0].indexOf(search)>-1){ // -1 위 는 해당 단어가 있는경우
				a_pnm = product[w][0];
				a_pmoney = product[w][1];
				a_psales = product[w][2];
				ck=true;
				%>
				<jsp:include page="ex24.jsp">
				<jsp:param value="<%=search %>" name="search"></jsp:param>
				</jsp:include>
				<% 
				if(a_pmoney != ""){	// 가격이 비어있지 않을 경우
					
				%>
				<ul>
					<li>상품명 : <%=a_pnm %></li>
					<li>가격 : <%=a_pmoney %></li>
					<li>할인률 : <%=a_psales %></li>
				</ul>
				<%
				}
				else{	// 가격이 비어있을 경우
					out.print("<span>해당 상품은 판매 종료</span>");
				}
			}
			w++;
		}
%>
<%
	if(ck=false){	// 모든 배열을 반복해서 값을 확인하지 못할경우
	%>	
	<span>상품명을 다시 확인 해주세요</span>
	<%}
%>

<%--


<%	
request.setCharacterEncoding("UTF-8");
	String search = request.getParameter("search").intern();
	if(search == "포도"){
		String name = "포도";
		int price = 35000;
		String sales = "10%";
		request.setAttribute("name", name);
		request.setAttribute("price", price);
		request.setAttribute("sales", sales);
%>
<p>상품명 : ${name }
<p>가격 : ${price}</p>
<p>할인가 : ${sales}</p>
<%	}
	else if (search == "딸기"){
		out.print("해당 상품은 종료 돤 상품 입니다.");
	}
	else{
		out.print("해당 상품은 없습니다.");
	}
%>  



--%>
</body>
</html>