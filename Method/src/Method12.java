
public class Method12 {

	public static void main(String[] args) {
		// extends를 사용한 자식 class를 load하게 되면 자동으로 부모 class도 함께 사용이 가능하다.
		bbox2 bx = new bbox2();
		bx.b2("이순신");
		System.out.println(bx.abc());
		

	}

}
class bbox { // 기본 외부 class1 main에서 필요한 사항을 체크
	protected String user_info;
	private String user_pw;
	public String user_pw2;
	public String user_pw3;
	
	public bbox() {
	//	this.user_info = "홍길동";
		this.user_pw = "abcd";
		this.user_pw2 = "abcd";
		this.user_pw3 = this.user_pw.replace("abcd","kl2@3$12n");
		
	}
	public String abc () {
		String email = "hong@gmail.com";
		return  email;
	}
	
}

class bbox2 extends bbox{ // bbox에 대한 모든 정보를 bbox2와 공유하게 됨.
	// 단, bbox중에서 private으로 세팅된 값은 공유되지 않음.
	public void b2(String nm){ 
		//main class에서 bbox2를 로드 후
		// 해당 값에 인수값을 정용하여 bbox class에 있는 필드명 중 user_info에 적용 하게 되는 형태.
		this.user_info = nm;
		System.out.println(this.user_info);
//		System.out.println(this.user_pw); //private여서 불가
		System.out.println(this.user_pw2); // public 이여서 가능
		System.out.println(this.user_pw3);
	}
}