		
		$(function() {
		
		// 회원가입 완료 버튼
			$("#join_ok").click(function () {
				if($("#user_id").val() == ""){
					alert("아이디를 입력해주세요.");
					$("#user_id").focus();
				}
				else if ($("#user_pw").val() == ""){
					alert("비밀번호를 입력해주세요.");
					$("#user_pw").focus();
				}
				else if ($("#user_pw_ck").val() == ""){
					alert("비밀번호확인을 입력해주세요.");
					$("#user_pw_ck").focus();
				}
				else if ($("#user_name").val() == ""){
					alert("이름을 입력해주세요.");
					$("#user_name").focus();
				}
				else if ($("#user_email").val() == ""){
					alert("이메일을 입력해주세요.");
					$("#user_email").focus();
				}
				else if ($("#user_tel").val() == ""){
					alert("전화번호를 입력해주세요.");
					$("#user_tel").focus();
				}
				else if ($("#zipcode").val() == ""){
					alert("주소검색을 눌러서 주소를 입력해주세요.");
				}
				else if ($("#home_addr").val() == ""){
					alert("상세주소를 입력해주세요.");
					$("#homeaddr").focus();
				}
				// 공란 검토 후 체크
				else{
					if($("#ck").val() != "ok"){
						alert("아이디 중복체크를 해주세요");
					}
					else if ($("#user_pw").val() != $("#user_pw_ck").val()){
						alert("동일한 패스워드를 입력하셔야합니다.");
					}
					else if ($("#user_email").val() != ""){
						var email_ck = /^[0-9a-zA-Z]([-_.])?[0-9a-zA-Z]*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,8}$/i;
						if(email_ck.test($("#user_email").val()) == false){
							alert("정상적인 이메일 형식을 입력해주세요.");
						}
						else{
							if(isNaN($("#user_tel").val()) == true){
								alert("연락처는 숫자만 입력해주세요");
							}
						else{
							f.method="POST";
							f.action="joinok.do";
							f.enctype="application/x-www-form-urlencoded";
							f.submit();
						}
						}
					}
				}
			});
			
			
			});