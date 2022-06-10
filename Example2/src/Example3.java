
public class Example3 {

	public static void main(String[] args) {
		
		inherit2 ih2 = new inherit2();
		ih2.it ("홍길동", "aaa5");
		ih2.print();

	}

}

class inherit1 { // 주로 데이터 받는 역할.
	
	private String nm; // 같은 클래스(inherit1)
	protected String pw; // 같은 클래스(inherit1) + 상속 받은 클래스(extends 한 inherit2)에서도 사용, 외부 로드 불가.
	public String nm2; // inherit1 에서 받은 부분을 inherit2에서도 사용할 수 있도록 하기 위함
	public String aa;
	static String bb;
	
	public void it (String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		this.aa = this.nm;
		this.bb = this.nm;
	}
}

class inherit2 extends inherit1 { // 주로 데이터 처리 하는 역할.
	
	public void print () {
		System.out.println(this.aa + " " + this.pw);
		System.out.println(this.bb +" "+ this.pw);
		
	}
	
}