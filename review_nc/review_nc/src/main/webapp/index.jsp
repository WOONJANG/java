<%@page import="configure.dataload"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title> 리뷰 등록 완료 페이지</title>
		<script>
			function del_data(idx) {
				const KEY = 01023866958;
				if(prompt("삭제 비밀번호 확인") == KEY){
				location.gref="review_del.do?ridx=" + idx;
				}
			}
			
			function review_insert_page() {
				location.gref="./review_write.html";
			}
		</script>
	</head>
	<style>
	 tr:nth-child(2n) {
	 	background-color: #ccc;
	 }
	 table, tr, td {
	 	text-align: center;
	 	width: auto;
	 	height: auto;
	 }
	</style>
	<body>
	<%-- JSP 주석 ( <% JSP OPEN ) ( %> JSP CLOSE) ( <%= 출력 )--%> 
<%
	ArrayList<dataload> list = (ArrayList<dataload>)request.getAttribute("list");
%>
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>고유값</td>
				<td>고객명</td>
				<td>상품명</td>
				<td>평점</td>
				<td>내용</td>
				<td>시간</td>
				<td>이미지</td>
				<td>수정/삭제</td>
			</tr>
<%
	for(dataload a : list){
		
		int num = Integer.parseInt(a.getvalues());
		String star = null;
		switch(num){
			case 1:
				star = "★☆☆☆☆";
				break;
			case 2:
				star = "★★☆☆☆";
				break;
			case 3:
				star = "★★★☆☆";
				break;
			case 4:
				star = "★★★★☆";
				break;
			case 5:
				star = "★★★★★";
				break;
		}
%>
		<tr>
			<td><%=a.getidx()%></td>
			<td><%=a.getname()%></td>
			<td><%=a.getproduct()%></td>
			<td><%=star%></td>
			<td><%=a.gettext()%></td>
			<td><%=a.getdate()%></td>
			<td><%=a.getimg()%></td>
			<td><input type="button" value="수정" style="background-color: black; color:white;"><input type="button" value="삭제" onclick="del_data(<%=a.getidx()%>);" style="background-color: red; color:white; "></td>

		</tr>

<%
	}
%>
		</table>
		<br>
		<input type="button" value="리뷰등록하러가기" onclick="review_insert_page();">
	</body>
</html>