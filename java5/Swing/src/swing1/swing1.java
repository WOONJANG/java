package swing1;

public class swing1 {

	public static void main(String[] args) {
		// wrapper class (BOX 상태)
		// float, char, byte, long, short (기본)
		// wrapper class : Byte, Integer, Long, Double (첫자 대문자) 
		
		Integer a = new Integer(20); // new Integer (박싱)
		int b = new Integer(20); // 언박싱 
		if(a.equals(b)) { // 둘 다 new Integer 일 경우(둘 다 박싱 상태일 때) equals로 사용 .
			System.out.println(a+b);
		}
		
		Integer no1 = 10; // 언박싱
		Integer no = new Integer(99);	// 박싱
		// int aa = no; // 언박싱(자동)
		Integer bb = no.intValue(); // 언박싱 // 박싱 상태에 있는 숫자값
		System.out.println(bb);
		
		/* 박싱과 박싱을 비교할 때는 equals를 사용해야하만 비교가 이루어짐 */
	}

}
