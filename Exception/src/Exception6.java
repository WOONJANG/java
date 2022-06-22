
public class Exception6 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 사용자가 45*3+16+5+22*8 해당 연산 값의 최종 값을
		 * 외부 클래스로 전송합니다.
		 * 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며,
		 * 홀수일 경우 "홀수값 입니다."로 다시 회신 되도록 합니다.
		 */
		

		try {
			
			int cal = 45*4+16+5+22*8;
			cul c1 = new cul();
			c1.cul_method(cal);
			String result = c1.cul_method(cal);
			System.out.println(result);
			
			
		}catch(Exception z) {
			if(z.getMessage() != null) {
			System.out.println(z.getMessage());
			}
		}
		}
	}
class cul{
	// 자료형 메소드에서 return값이 중요. 숫자, 문자, Object에 따라서 자료형이 선언되어 생성.
	public String cul_method (int q) throws Exception {
		if(q % 2 == 0) {
			throw new Exception("(예외)짝수 입니다. 재확인 요");
//			Exception ex = new Exception("(예외)짝수 입니다. 재확인 요");
//			throw ex;
		}
		else {
			String msg = "홀수 입니다.";
			return msg;
		}
	}
}



