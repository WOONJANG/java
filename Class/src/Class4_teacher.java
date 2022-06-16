import java.util.ArrayList;
import java.util.Arrays;

public class Class4_teacher {

	public static void main(String[] args) {
		
		data_list1 da = new data_list1();
		da.userinput1("강감");
	}
}
abstract class v_constuct1 {
	String user_name;
	public abstract void userinput1 (String nm);
}
class data_list1 extends v_constuct1{
	@Override
	public void userinput1(String nm) {
		if(nm == null) {
			System.out.println("사용자 이름을 입력하세요.");
		}
		else {
			this.user_name = nm;
			check1 ck1 = new check1();
			ck1.db1();
		}
	}
	class check1{
		String user_name = data_list1.this.user_name;	// 부모 class에서 받은 값을 자식 class로 이관
		String data_list1[];	// 필드에 배열을 받는 객체 생성
		ArrayList<String>ar1 = null;	//ArrayList Util을 필드에 객체생성
		public void db1 () {
			// 해당 필드에 있는 ArrayList를 인스턴스로 적용함
			this.data_list1 = new String[] {"홍길동","이순신","유관순"};
			this.ar1 = new ArrayList<>(Arrays.asList(this.data_list1));	//this로 처리
			this.compare();	// 최종으로 DB와 사용자 정보를 비교하는 메소드
		}
		public void compare() {
			int ea = this.ar1.size();
			int dw = 0;
			boolean bl = false;	// 결과 확인 작업
			do {
				if (this.user_name.equals(this.ar1.get(dw))) {
					bl = true;
				}
				dw++;
			}while(dw<ea);
			
			if(bl == true) {
			System.out.println("해당 사용자가 있습니다.");
			}
			else {
			System.out.println("해당 사용자는 가입자가 아닙니다.");
			}
		}
	}
}