	
	$(function(){
	// 제이쿼리 시작	
		const $submit_btn = $("#submit_btn");	// 작성완료 버튼
		const $cancle_btn = $("#cancle_btn");	// 작성취소 버튼
		// 작성완료 버튼
		$($submit_btn).click(function () {

		const $user_name = $("#user_name");
		const $user_name_val = $("#user_name").val();	// 고객명 벨류값
		const $user_product = $("#user_product");
		const $user_product_val = $("#user_product").val();	// 상품명 벨류값
		const $review_text = $("#user_review_text");
		const $review_text_val = $("#user_review_text").val(); // 내용 벨류값
		
		
		
            if($user_name_val == ""){
				alert("고객명을 입력하세요.");
				$user_name.focus();
			}
         	else if ($user_product_val == ""){
				alert("상품명을 입력하세요.");
				$user_product.focus();
			}
			else if ($review_text_val == ""){
				alert("리뷰 내용을 입력하세요.");
				$review_text.focus();
			}
			else{
				f.submit();			
			}
			
			
			
			
			
			
			
		
		});
		
		
		// 작성취소 버튼
		$("#cancle_btn").click(function(){
			location.reload();
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	// 제이쿼리 마지막	
	});
	
	
	