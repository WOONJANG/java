import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * 배열 데이터 : {"홍길동", "이순신", "유관순"};
		 * 세개의 데이터가 있습니다.
		 * 메인 class에서 문자를 하나 전송 합니다.
		 * 단, 문자가 null로 보낼 수 있으며, 배열 데이터와 관계 없는 "강감찬"이라고 보낼 수도 있습니다.
		 * 외부 class명 : data_list 이며
		 * 추상 class명 : v_construct 입니다.
		 * 외부 class안에 내부 class 명 : check
		 * 입니다.
		 * 
		 * [결과형태]
		 * main class에서 "강감찬"을 적용할 경우
		 * 내부 class에서 "해당 사용자는 가입자가 아닙니다." 라고 출력
		 * main class에서 "홍길동", "이순신", "유관순"을 적용할 경우
		 * 내부 class에서 "해당 사용자가 있습니다." 라고 출력
		 * 단, ArrayList로 배열을 load 하십시오. 
		*/
		
		
		data_list v = new data_list();
		v.datalist_method(null);
		data_list.cal vc = v.new cal();
		vc.check();
	}
}

abstract class v_construct{
	public String u_name;
	abstract void datalist_method(String user);
	String arr[] = {"홍길동", "이순신", "유관순"};	// 배열 데이터
	ArrayList<String> ar = new ArrayList<>(Arrays.asList(arr)); // ArrayList로 Array data를 ar 이름으로 load
}	
class data_list extends v_construct{
		@Override
		public void datalist_method(String user) {
			this.u_name = user;  // user = v.datalist_method(null);
		}
	class cal{
		String msg="";
		public void check() {
			for(int f = 0; f < ar.size(); f++) {
			if(null == u_name) {
				this.msg ="사용자 이름을 입력하세요.";	
			}
			else {
				if(ar.get(f) != u_name) {	// ar 받아온 data의 f반복 이 u_name 와 다르면 
					this.msg = "해당 사용자는 가입자가 아닙니다.";
				}
				else {
					this.msg = "해당 사용자가 있습니다.";
					break;
				}
			}
			}
			System.out.println(this.msg);
		}
	}
}