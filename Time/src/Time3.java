
public class Time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("수업 시작");
			Thread.sleep(5000);
			System.out.println("수업 종료");
		}catch(InterruptedException a){
			System.out.println(a);
			
		}
		 */
/*[응용문제]
 * 외부 class가 있습니다
 * 단, main class에서 해당 외부 class를 load하면
 * 해당 메소드에서 즉각적으로 8초동안 로딩이 발생한다.
 * 로딩 8초동안 "처리중입니다. 잠시만 기다려 주세요" 출력
 * 8초 이후에 return으로 "입금이 모두 처리되었습니다" 라는 문자를 받도록 하십시오.
 */	
		
		exam ex = new exam();
		ex.road();
		System.out.println(ex.end());
	}
}

class exam {
	String msg="";
	String k = ".";
	public void road() {
		try {
			String msg1 = "처리중입니다. 잠시만 기다려주세요.";

			System.out.println(msg1 +k);
			Thread.sleep(1000);
			System.out.println(msg1 + k + k);
			Thread.sleep(1000);
			System.out.println(msg1 + k+k+k);
			Thread.sleep(1000);
			System.out.println(msg1 + k+k+k+k);
			Thread.sleep(1000);
			
		}catch(InterruptedException a){
			System.out.println(a);
			
		}
	}
	public String end() {
		String out ="입금이 모두 처리되었습니다";
	return out;
}
}
