/*
 * Exception : try, catch와 함께 사용을 함. (예외처리사항)
 * - RuntimeException : Error 발생시, 예외처리 체크를 안함. - Null, Class, Arraysize
 * - OtherException : 예외처리 체크사항 모두함. 
 * Exception[종류] 
 * ArithmeticException : 0으로 나눌때 발생
 * NullPointerExc... : Null 객체 잠조할때
 * ClassCastExc... : 클래스형 변환
 * NumberFormatExc... : 숫자형으로 변환
 * ArrayIndexOutOfBoundExc... : 배열 참조시 인덱스 번호 오류  
 * IOException : 입출력 문제 발생 0
 * Exception : 전체 예외처리 현황 0
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//try : 해당 값을 int로 변경 (1)
			a = Integer.valueOf(b);	// error 발생 : a1이 문자인데, 강제로 변환시 a라는 문자로 인하여 오류 (2)
		}catch(NumberFormatException e) {
			System.out.println(e);	// 어떤 부분에서 문제가 발생 (3)
		}
		finally {	// catch가 작동되어야 작동 함.
			b = b.replaceAll("[a-z]", ""); // 데이터 재처리 (4)
			a = Integer.valueOf(b);	// 다시 문법을 재작성해서 사용 (5)
//			System.out.println("test");
			System.out.println(b);		// 최종 결과값 출력 (6)
		}

	}

}
