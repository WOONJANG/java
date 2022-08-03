<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<title> 세션 </title>
		<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
		<script>
			function logout() {
				if(!confirm("로그아웃 하시겠습니까?")){
					
				}
				else{
					location.href='./logout.jsp';
				}
			}
			
			$(function () {
				$("#logout_btn").focus(function() {
					
					 if($('#logout_btn').css('margin-left') == '0px'){
			               $('#logout_btn').css('margin-left', '100px');
			            }
					 if($('#logout_span').css('display') == 'none'){
			               $('#logout_span').css('display', 'block');
			            }
				});
			});
		</script>
	</head>
	<body>
		<%
		if(session.getAttribute("pnm") == null){
			// jsp에는 별도의 import 사항이 없음
			PrintWriter pr = response.getWriter();
			pr.print("<script>"
			+ "alert('잘못된 접근');"
			+ "history.go(-1);"
			+ "</script>");
		}
		
		%>
		<%= session.getAttribute("pnm") %>(님) 환영합니다.
		[아이디] <%= session.getAttribute("pid") %>
		
		<br><br><br>
		<span id="logout_span" style="display:none;">진짜 로그아웃 할거야?</span>
		<input type="button" id="logout_btn" value="로그아웃" onclick="logout()">
	</body>
</html>