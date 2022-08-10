<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 1 - JQuery Ajax -그래프+타이머+배열</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="./js/jquery.js"></script>
<script>
	$(function() {	// JQ 시작
		
		$.fn.weather = function() {
			
			var $apikey = "uchyu";
		
			$.ajax({
				url:"./ajax2_1.jsp",	// 외부에서도 접속 가능하게 하기위해 JSON, JSP값을 받도록 함
				cache : false,
				dataType : "html",	// JSON, XML 파일 외에는 모두 html로 작성
				data : {
					apikey : $apikey	// 데이터 통신을 위해 APIKEY 확인
				},
				type : "GET",
				success : function($data) {
					// JSON 파일이 아닌 이상은 parseJSON을 이용하여 파서 해야만 배열로 인식
					var $jdata = jQuery.parseJSON($data);	// JS => JSONparse
					$.fn.ani($jdata)
// 					console.log($jdata);
				},
				error : function() {
					console.log("AJAX NETWORK ERROR");
				}
			});
			setTimeout($.fn.weather,5000);	// 매 5초 마다 데이터 로드
		}
	
	setTimeout($.fn.weather,5000);	// 최초 실행시 적용되는 부분
	
	$.fn.ani = function($jdata){
		console.log($jdata.length);
		var $w = 0;
		while($w < $jdata.length){
		var $area = $jdata[$w]["area"];
		var $rain = $jdata[$w]["rain"];
// 		console.log($area + $rain);
// 	$("#dataload>span:eq(0)>ul>li:eq(1)").css("width", $rain*2 + "px");
	$("#dataload>span:eq("+$w+")>ul>li:eq(1)").animate({
		"width" : $rain * 2 + "px"
	},500);
	$w++;
	}
	}
		
	});	// JQ 종료
</script>
</head>
<body>
	<p>각 지역구 강수량</p>
	<div id="dataload" style="width: 700px; height: 500px; border-left: 1px solid black; border-bottom: 1px solid black;">
		<!-- 강동 -->
		<span style="display: block; width: inherit; height: 50px; ">
			<ul style="list-style: none; width: inherit; height: inherit; margin: 0; padding : 0;">
				<li style="height: 25px;">강동구</li>
				<li style="width: 0px; height: 25px; background-color: purple;"></li>
			</ul>
		</span>
		<!-- 중랑 -->
		<span id="dataload" style="display: block; width: inherit; height: 50px; ">
			<ul style="list-style: none; width: inherit; height: inherit; margin: 0; padding : 0;">
				<li style="height: 25px;">중랑구</li>
				<li style="width: 0px; height: 25px; background-color: green;"></li>
			</ul>
		</span>
		<!-- 강남 -->
		<span id="dataload" style="display: block; width: inherit; height: 50px; ">
			<ul style="list-style: none; width: inherit; height: inherit; margin: 0; padding : 0;">
				<li style="height: 25px;">강남구</li>
				<li style="width: 0px; height: 25px; background-color: orange;"></li>
			</ul>
		</span>
		<!-- 동대문 -->
		<span id="dataload" style="display: block; width: inherit; height: 50px; ">
			<ul style="list-style: none; width: inherit; height: inherit; margin: 0; padding : 0;">
				<li style="height: 25px;">동대문구</li>
				<li style="width: 0px; height: 25px; background-color: blue;"></li>
			</ul>
		</span>
		<!-- 중 -->
		<span id="dataload" style="display: block; width: inherit; height: 50px; ">
			<ul style="list-style: none; width: inherit; height: inherit; margin: 0; padding : 0;">
				<li style="height: 25px;">중구</li>
				<li style="width: 0px; height: 25px; background-color: skyblue;"></li>
			</ul>
		</span>
		<!-- 성동 -->
		<span id="dataload" style="display: block; width: inherit; height: 50px; ">
			<ul style="list-style: none; width: inherit; height: inherit; margin: 0; padding : 0;">
				<li style="height: 25px;">성동구</li>
				<li style="width: 0px; height: 25px; background-color: yellowgreen;"></li>
			</ul>
		</span>
<%-- 		<% --%>
// 			for(){
<%-- 		%> --%>
<%-- 		<%} %> --%>
	</div>

</body>
</html>