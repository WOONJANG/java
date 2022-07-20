//js14.html



	function API(){
		
		this.map = function(){
			
			var way = "망원역 2번출구 뒤쪽 일본 라멘집 '멘지' 추천합니다";
			return way; 
			
			
		}
		
		this.login = function(MID){
			
			var MSG;
			
			if(MID == "hong"){
				MSG = "해당 고객을 확인 하였습니다.";
			}
			else{
				MSG = "ERROR";
			}
			return MSG;
		}
		
	}
	
	var JANGHOHO = new API();