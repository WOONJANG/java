import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		
		apink ap = new apink ("홍길동", 25, "test@gmail.com", -1000);

	//	ap.names();
	//	System.out.println(ap.nm2);
	System.out.println(ap.data1()); // 홍길동
	System.out.println(ap.data3());
	System.out.println(ap.data4()); // 0 (조건문)
	}

}

class apink {
	// private 선언은 class 필드에서 생성해야 한다.
//	String nm2;
	private String nm;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	
	public void names() {
		if(this.nm == "홍길동") { // 홍길동으로 들어오면 hong으로 변경
			this.nm = "hong";
			String e[] = this.email.split("@"); // email 중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
			this.email_cp = e[1];
		}
	}
	
	
	public apink (String nm1, int age2, String email3, int point4) { //private
		// setter 형태
		this.nm = nm1; 
		this.email = email3;
		if(point4 < 0 ) {
			this.point = 0;
		}
		else {
			this.point = point4;
		}
		names();
	}
	
	public String data1() {
		return this.nm; // return 맨 마지막에 사용하는 코드.
		// return 밑에 코드는 모두 오류가 발생하게 된다.
	}
	public String data3() {
		return this.email_cp;
	}
	public int data4() {
		// getter 형태
		return this.point;
	}
}