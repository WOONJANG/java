package Ab2;

public class app {

	public static void main(String[] args) {
		
//		// (자식) = (부모)
//		members mb = new members();
//		mb.oop1();
//		mb.oop2();

		//(부모) = (자식) => interface 기준으로 적용 된 Override만 호출 (형변환)
//		members mb = new members(); // 자식 class 전용
//		app_data2 ap = mb;	// interface 전용 (class에서 interface 기준으로 변환)
		
		app_data2 ap = new members();
		members mb2 = (members)ap; // interface에서 class로 변환
		mb2.oop1();
		ap.oop1();
	}

}

/*
 * class members implements app_data1 { 
 * app_data1에 강제로 자료형 선언하는 방식 
 * }
 */

class members implements app_data2 {
	@Override
	public void oop1() {
		System.out.println("test");
	}
	@Override
	public void oop2() {
		System.out.println("test2");
	}
	
	public void opp1() {
		System.out.println("test3");
	}
}