<%@ page language="java" 
contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%//request.getAttribute("FCATEGORY") %>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<meta name="viewport" content="width=divice-width,initial-scale=1.0">
		<title> FAQ 더보기 </title>
		<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
		<script src="./js/faq_write.js?v=00000000"></script>
		<link rel="stylesheet" type="text/css" href="./css/faq_write.css?v=00000000">
	</head>	
	<body>
		<form name="f" id="f" method="post" action="./faq_view.do" enctype="application/x-www-form-urlencoded">
<!-- 			<input type="hidden" name="FVIEW" value="Y"> -->
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
				<%=
				//request.getAttribute() : Enumeration(자료형)
					String cate = (String)request.getAttribute("FCATEGORY");
// 					System.out.println(request.getAttribute("FCATEGORY").getName());
				%>
					<td>카테고리</td>
					<td> 
						<select name="CATEGORY">
							<option value="배송문의" <% if(cate.equals("배송문의")){"selected"} %>>배송문의</option>
							<option value="반품/교환/환불" <% if(cate.equals("반품/교환/환불")){"selected"} %>>반품/교환/환불</option>
							<option value="주문/결제" <% if(cate.equals("주문/결제")%>>주문/결제</option>
							<option value="회원서비스" <% if(cate.equals("회원서비스")%>>회원서비스</option>
							<option value="안전거래" <% if(cate.equals("안전거래")%>>안전거래</option>				
						</select>
					</td>
				</tr>
				<tr>
					<td>글쓴이</td>
					<td><%request.getAttribute(name) %></td>
				</tr>
				<tr>
					<td>질문내용</td>
					<td><input type="text" name="USER_Q" id="USER_Q" value=""></td>
				</tr>
				<tr>
					<td>답변내용</td>
					<td><textarea rows="20" cols="100" name="USER_A" id="" value="<%=
						request.getAttribute("FA");
						%>"</textarea></td>
				</tr>
			</table>
			<input type="button" value="삭제" id="del_btn">
			<input type="button" value="리스트" id="list_btn">
			<input type="button" value="수정" id="update_btn" onclick="modify();">
		</form>
	</body>
</html>