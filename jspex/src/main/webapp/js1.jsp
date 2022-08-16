<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 6일차 session</title>
</head>
<body>

	<!--
		session, cookie : client에 대한 정보를 저장하여 서버와 통신하면서 페이지 이동시, 지속적으로 사용가능하도록 하는 객체
						※ Chrome에서 session, cookie가 저장 되더라도 Edge에서는 적용이 안되므로 새롭게 등록해야함
	
		session : client 입력정보 -> server에 저장 - > 브라우저에 저장하는 형태
		
		cookie : server에서 생성 -> client에 저장되어 사용 된다
		
		예시 ) session : 로그인, 메일발송에 대한 정보, 결제 정보
			cookie : 팝업창, 접속자 PC정보
			
		
		session의 단점 : 여러 server에서 공유를 할 수 없음(JSP)
		
		cookie의 단점 : 정보 노출 단계가 낮은편 (JS, JSP)
		
	 -->
	<a href="js1_1.jsp">session 생성</a>
	<a href="js1_2.jsp">session 확인</a>
	<a href="js1_3.jsp">session 삭제</a>
</body>
</html>