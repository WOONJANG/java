
public class Method1 {

	public static void main(String[] args) {
		
		tests t = new tests();
		t.a1++;
		t.a2++;
		t.name1();
		t.b1 += "유관순";
	//	t.b2 += "유관순";
		t.name2();
		
		tests tt = new tests();
		tt.a1++;
		tt.a2++;
		tt.name1();
		tt.b1 += "강참찬";
	//	tt.b2 += "강감찬";
		tt.name2();
		
	}

}

class tests {
	
	int a1 = 1; // 새로운 객체 생성 및 클래스를 호출시 1 이라는 숫자를 다시 가지게 된다. (동적 변수)
	public static int a2 = 1; // 새로운 객체 생셩 및 클래스를 호출하더라도 1 이라는 숫자가 아닌 메모리에 등록된 최종값을 지속적으로 가지게 된다.
	//강제 초기화 시키지 않는 이상은 누적.  (정적 변수)
	String b1 = "이순신";
	public static String b2 [] = { "홍길동"};
	
	
	public void name1() {
	//	System.out.println(a1);
		System.out.println(a2);
	}
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
	}
	
	
}