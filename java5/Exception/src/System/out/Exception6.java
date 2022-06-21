package System.out;

public class Exception6 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 사용자가 45*3+16+5+22*8 해당 연산 값의 최종 값을
		 * 외부 클래스로 전송합니다.
		 * 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며,
		 * 홀수일 경우 "홀수값 입니다."로 다시 회신 되도록 합니다.
		 */
		
		/*[응용문제]
		 * 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88 }
		 * 해당 데이터 값중 문자값만 출력 되도록 재 배열 하시오.
		 * 단, 메인에서는 해당 배열을 외부 클래스 (setter)로 전송
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열하여 생성합니다
		 * getter에서 해당 배열을 return으로 보내도록합니다.
		 * 단, 외부클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */
		int result = 45*3+16+5+22*8;
		cal ca = new cal();
		try {
			ca.math(result);
			System.out.println(ca.math(result));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

class cal{
	public String math(int a) throws Exception {
		String msg = "";
		if(a % 2 == 0) {
			throw new Exception("짝수, 예외처리");
		}
		else {
			msg = "홀수 입니다.";
			 return msg;
		}

	}
}
}

