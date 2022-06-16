/* 부모class 및 자식(내부)class 연동*/
public class Class1 {

	public static void main(String[] args) {
		/* 부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 적용하지 못함 */
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child();	// 부모 class.자식 class 이름 = 부모class명.new 자식class (인스턴스에 적용)
		pc.c_box();
	}
}

class parents {	// 부모 class
	String a = "홍길동";	// 부모 필드에 있는 전역변수
	String b;
	class child {	// 자식 class
		int a = 20;
		
		public void c_box () {	// 자식 method
			double c = 10.5;	// 자식 method 전용 지역변수
			System.out.println(c);	// 10.5
			System.out.println(this.a);	// 20 // 자식 class 전용 전역변수
			System.out.println(parents.this.a);	// 홍길동 // 자식class에 변수명a가 없으면 그냥 a 찍어도 부모클래스 a(홍길동) 출력
			System.out.println(parents.this.b);	// 이순신	p_box this.b = a 선언
		}
	}
	public void p_box() {	// 부모 method
		String a = "이순신";	// p_box에 있는 지역변수 선언
		this.b = a;
		System.out.println(this.a);	// 홍길동
		System.out.println(a);	// 이순신
	}
}