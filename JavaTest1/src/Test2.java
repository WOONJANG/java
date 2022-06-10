
public class Test2 { // 조건문

	public static void main(String[] args) {

		int score = 55;
		String msg = " ";
		
		if (score >= 90) {
			msg = "등급 A 입니다.";
		}
		else if (score <= 89 && score >= 70) {
			msg = "등급 B 입니다.";
		}
		else if (score <= 69 && score >= 50 ) {
			msg = "등급 C입니다.";
		}
		else {
			msg = "일반 등급입니다.";
		}
		System.out.println(msg);
	}
}
