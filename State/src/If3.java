
public class If3 {

	public static void main(String[] args) {

		// bloolean : true or false로 구분.
		boolean ck = true;
		if (ck == true) {
			System.out.println("회원가입이 진행 됩니다.");
		}

		else {
			System.out.println("이용약관에 동의하셔야만 진행 됩니다.");
		}

		String inputid, inputpw;
		inputid = "lee";
		inputpw = "a1234";
		
		// && : 한가지 조건 이상 모두 만족하는 경우. (and)
		// || : 한가지 조건 이상에서 하나라도 맞을 경우. (or)
		if (inputid == "park" && inputpw == "a1234") {
			System.out.println("로그인 하셨습니다.");
		}

		else {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}

		if (inputid == "park" || inputpw =="kim") {
		// if (inputid =="park || inputpw =="a1234") { 두 조건중에 한가지로도 맞을 경우 	
		System.out.println("회원이 확인되었습니다");
		}
		
		else {
			System.out.println("확인된 아이디가 없습니다.");
		}
		
		
		
		
		
		
		
	}

}
