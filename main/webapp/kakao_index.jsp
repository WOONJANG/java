<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카카오 API + joinpart.java</title>
<style>
	.logoutcss{
		background-color: yellow;
		color : black;
		font-weight: bold;
		width: 183px;
		height: 45px;
	}
</style>
</head>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script>

</script>
<body>		
			<input type="button" class="logoutcss" value="자회사몰 회원가입" onclick="join();"><br>
	      	<img src="./kakao_login.png" onclick="kakao_login();"> <br>
	        <input type="button" class="logoutcss" value="카카오 로그아웃" onclick="kakaoLogout();">
	        
	        <form name="kakao" method="post" action="kakaojoin.do">
	        	<input type="hidden" name="userid" value="">
	        	<input type="hidden" name="username" value="">
	        	<input type="hidden" name="useremail" value="">
	        </form>
</body>
<script>
		Kakao.init('46592fa6c4589bd36b1a0c301096487d'); 
		console.log(Kakao.isInitialized()); 
		// 카카오 로그인
	function kakao_login() {
		
		Kakao.Auth.login({
		      success: function (response) {
		          Kakao.API.request({
		            url: '/v2/user/me',
		            success: function (response) {
		            	console.log(response)	// API 배열
		            	kakao.userid.value = response["id"];
		            	kakao.username.value = response["kakao_account"]["profile"]["nickname"];
		            	kakao.useremail.value = response["kakao_account"]["email"];
		            	
		            	kakao.submit();
		            },
		            fail: function (error) {
		              console.log(error)
		            },
		          })
		        },
		        fail: function (error) {
		          console.log(error)
		        },
		    });
	}
		
	// 카카오 로그아웃
function kakaoLogout() {
		// 웹 + 하이브리드 앱 : API
		// 웹 전용 : Auth
    if (Kakao.Auth.getAccessToken()) {
      Kakao.API.request({
        url: '/v1/user/unlink',
        success: function (response) {
		    alert("로그아웃 완료");
        	console.log(response)
        },
        fail: function (error) {
          console.log(error)
        },
      })
      Kakao.Auth.setAccessToken(undefined)
    }
  }  
	
	//자회사 가입
	function join() {
		location.href="join.do";
		
	}
</script>
</html>