package aop;

public class aop_class7 {
	// 일반 객체 프로그램이 실행되는 class
	public void aop_test(int a) {
		
		if(a < 0) {
			System.out.println("0보다 작음");
		}
		else if(a == 0) {
			System.out.println("0임");
		}
		else {
			System.out.println("0보다 큼");
		}
	}
}
