
public class Method3 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 인수값 2개의 숫자를 적용하여 계산되도록 한다,
		 * 최종 계산값을 받아서 출력하시오.
		 * 157, 45
		 * 157 * 45
		 * 최종 결과값 출력 : 7065
		 */
		
		data cal = new data();
		int result = cal.a(157, 45);
		System.out.println(result); //7065
		cal.m2();
		cal.a();
		
		/*[응용문제]=================================================
 			다음 숫자 하나를 해당 메소드로 전달 하게 됩니다.
 			해당 메소드에서는 다음과 같이 처리합니다.
 			숫자 3을 전달하면 3 * 1 ~ 3 * 9 까지의 모든 결과값을 더하여 출력 하시오.
 		*/
				
		int result2 = cal.ex(3);
		System.out.println(result2);
		//========================================================
		String ck = cal.exex("hong");
		System.out.println(ck);
		
		
	}

}
class data {
	
	public int a (int a, int b) {
		int c = a*b;
		return c;
	}
	public void a () { //	같은 이름이라도 인수값을 유 무 차이로 되긴하나 권고하진않는다. (헷갈림)
		System.out.println("연습입니다."); //	연습입니다.
	}
	public void m2() {
		int z = a(100, 200);
		System.out.println(z); // 20000
	}
	
	//응용문제===========================
	
	public int ex (int aa) {
		
		int re;
		int total = 0;
		
		for(re=1; re<=9; re++) {
			total += aa * re;
		}
		return total; // 반복문 안에는 return 적용 불가, 또한 조건문이라도 더블로 return 사용 불가.
	}
	//================================
	public String exex (String mid) {
		String msg = "";
		String msg2 = "홍길동";
		if (mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancle";
		}
		return msg; // 해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴.
	}


}
