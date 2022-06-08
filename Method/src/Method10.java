
public class Method10 {
	// 문자열 정규식 코드
	public static void main(String[] args) {
		// setter : 사용자가 입력한 값 또는 수식값등 전달하는 메소드.
		// getter : 연산을 거친 후 return으로 값을 보내는 메소드.
		met m = new met();
		m.setUser_name("홍길동");
		m.setUser_pw("a1234");
		m.setUser_email("test@gmail.com");
		/*
		System.out.println(m.getUser_name());
		System.out.println(m.getUser_pw());
		System.out.println(m.getUser_email());
		*/
		// replace  : 치환형태의 함수 ( 문자 및 문자열 숫자)
		//replaceALL : replace에서 조금 발전된 치환형태의 함수 (java에서 replace와 통용됨.
		String str = "홍길동님 환영합니다."; 
		String str2 = str.replace("님", "고객님");
		System.out.println(str2);
		String nm = "홍 길 동";
		String rnm = nm.replace(" ", ""); // 공백 제거
		System.out.println(rnm);
		String nm3 = "자바가 진짜 사람을 자바요";
		String rnm3 = nm3.replace("자바", "java");
		System.out.println(rnm3);
	}

}
class met {
	private String user_name;
	private String user_pw;
	private String user_email;
	
	public String getUser_name() {
		return this.user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pw() {
		return this.user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_email() {
		return this.user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
}
