import java.util.ArrayList;
import java.util.Arrays;

// awt5_abstract.java
// 중복 아이디 체크 시스템 만들기 
// 회원 데이터 { "hong", "lee", "park"}; 
public class awt5 {

	public static void main(String[] args) {
		
		handel hd = new handel();
		hd.disign();
	}
}

class handel extends awt5_abstract {
	private String uid; // awt에서 넘어온 인수값을 클래스에서 활용
	private String return_id;	
	// awt로 다시 값을 전달하는 전역변수, null일 경우 id 사용가능, 
	// id값이 전달 : 해당 아이디는 사용할 수 없음
	
	ArrayList<String> db = null;
	@Override
	public void IDcheck(String id) {	// setter
		this.return_id = null;	// awt에서 중복 버튼을 클릭시 해당 변수를 지속적으로 초기화 하는 붑분
		this.uid = id;
		this.dataload();	// 정상적으로 데이터가 넘어왔을 경우 해당 메소드를 로드하여 확인
		int ea = this.db.size();
		int dw = 0;
		do {
			if(this.uid.equals(this.db.get(dw))) {
				this.return_id = this.db.get(dw);
				break;
			}
			dw++;
		}while(dw < ea);
		
	}
	
	@Override
	public String signok() {

		return this.return_id;
	}
	
	@Override
	public void dataload() {
		String ori[] = { "hong", "lee", "park", "jeong", "kim", "seo"};
		this.db = new ArrayList<>(Arrays.asList(ori));
		
	}
}