
public class Exception2 {

	public static void main(String[] args) {
		
		try {
//			test();  // 메소드 호출 자체. error Exception과 관계가 없음.
			
			Exception2 ex2 = new Exception2();

			String a = "홍길동2";
			ex2.test(a);
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	public void test(String b) throws Exception, NumberFormatException {	
		// throws는 main method에서 예외처리 없이 해당 method를 호출 할 경우를 막기위해 사용.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;		//	코드 맨 밑에 사용을 하며 throws는 return과 비슷한 성격을 가지고 있음.
		// 예외처리 결과에 대한 값을 main method로 다시 return시킴
		
	}
}
