$(function(){
	
	$("#go_write_page").click(function(){
		location.href='./faq_write.html';
	})
	
	
	
	
})


function faq_write(){
   location.href='./faq_write.html';
}

function modify(FINDEX){
	location.href="./faq_view.html?idx="+FINDEX;
}

function del_faq(){
	if(confirm("해당 데이터를 삭제하겠습니까?\n데이터 삭제시 복구되지않습니다."))
	var uri = window.location.search;
	var idx = uri.split("?idx=");
	console.log(idx[1]);
	location.href="./faq_delete.do?idx=";
}