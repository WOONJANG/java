<%@page import="config.faq_select_module"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="./js/faq_list.js?v=00000002"></script>
<link rel="stylesheet" type="text/css" href="./css/faq.css?v=8">
<title>FAQ 리스트</title>
<script>
	function faq_write(){
		location.href='./faq_write.html'
	}
</script>
</head>
<body>
<%
ArrayList<faq_select_module> faqdata = (ArrayList<faq_select_module>)request.getAttribute("list");
%>
<section class="faq_view">
	<div class="faq_list">
		<p>FAQ LIST</p>
		<span class="faq_content">
			<ul>
				<li>카테고리</li>
				<li>제목</li>
				<li>글쓴이</li>
				<li>등록일자</li>
			</ul>
		</span>
		<% if(faqdata.size()==0){ %>
		<span class="faq_content_view">
			<ul class="nodata">
				<li>등록된 FAQ가 없습니다</li>
			</ul>
		</span>
		<% } else { 
			for(faq_select_module fetch : faqdata){
		%>
		<span class="faq_content_view" onclick="modify(<%=fetch.getFIDX()%>)">
			<ul>
				<li><%=fetch.getFCATEGORY()%></li>
				<li class="left_text"><%=fetch.getFQ()%></li>
				<li><%=fetch.getFUSER()%></li>
				<li><%=fetch.getTIME()%></li>
			</ul>
		</span>
		<%
				}
			}
		%>
	</div>
	<div class="pageing">
	<ol>
	<li>1</li>
	</ol>
	</div>
	<div class="page_btn">
	<input type="button" value="FAQ 등록" class="faq_btn" title="FAQ 등록" onclick="faq_write();">
	</div>
</section>
</body>
</html>