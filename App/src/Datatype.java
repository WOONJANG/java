
public class Datatype {

	public static void main(String[] args) {
		
		//1234 정수 / 12.34 실수
		
		String a = "1234"; // String은 무조건 문자 ("") 사용.
		System.out.println(a);
		/* 정수형 */
		byte b = 127; //byte : java에서 제일 작은 단위, -128 ~ 127
		System.out.println(b);

		short c = 32767; //short : -32768 ~ 32767
		System.out.println(c);
		
		int d = 1000000; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long e = 999999; //long : 0이 18개, 기본 메모리 할당에서 추가 적용시 가능 범위 증가. long 사용시 , 리미트해제 끝에 L 작성.
		System.out.println(e);
		/* 정수형 END */
		
		
		/* 실수형 */
		
		float f = 3.5f; // float : 소숫점 사용시 끝에 무조건 f 작성. 3.40248xxxxxxxxx... ~ +38
		System.out.println(f);
		
		double g = 44.53232;// double : 소숫점 사용시 끝에 d작성(안해도 출력 가능) 1.784xxxxxxxx... ~ +308
		System.out.println(g);
		/* 실수형 END */
		
		
		
		
	}

}
