
public class Class3 {
			// package를 사용하지 못함 ( default 라서)
	public static void main(String[] args) {
		//자료형(데이터형) 변환
		//double -> int 로 변환 
		double a = 137.5;
		int b = (int)a; 
		//int -> doudble 로 변환
		int c = 35;
		double d = (double)c;
		System.out.println(d); //137.5
		
		//String -. int 변환 : 문자에서 숫자로 변환은 X
		String x = "35";
		String x2 = "156";
		int z = Integer.parseInt(x);  // parseInt (int 형에 사용하는 산술연산 언어임.
//		int z = Integer.valueOf(x); // 속도 느림. valueOf 클래스안에 메소드(메소드함수)- > parseInt 
		int total = Integer.parseInt(x) + Integer.parseInt(x2); //문자형을 숫자로 변환하여 산술계산을 처리함.
		System.out.println(total);
		
		String j = "123456789";
		String j2 = "1234567892";
//		int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		Long total2 = Long.parseLong(j) + Long.parseLong(j2); //Long 사용시 Long.paresLong 사용
		double total3 = (double)total2; 
		System.out.println(total3);
		
		//문자(char) -> 문자 (String) : 기본 지식만 제공.
		char p = 'M';//char 는 < '  ' > 사용. 한 음절만 가능
		String p2 = String.valueOf(p);// =>>>>> char -> String 할 때에도 한 음절만 가능. (ValueOf) 사용.
		System.out.println(p2);
		
	}

}

