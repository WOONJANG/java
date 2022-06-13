import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//재귀메소드 사용법
		op_method om = new op_method(); // main class에 로드
	}
}

/*
  재귀메소드 : method를 직 간접으로 호출 하는 프로세서.
  반복문 or 외부 class를 재실행 등 복잡한 문제를 해결하기 위해서
  구현하는 method 형태를 말한다.
 */

class op_method {
	
	Scanner sc = new Scanner(System.in);
	private String nm;
	
	public op_method() {	// 최초 실행 메소드
		this.m1();
	}
		
	public void m1() {	// 메소드 m1 작동
		System.out.println("찾을 이름을 입력하세요?");
		this.nm = sc.next();
		this.m2();
	}
	
	public void m2() {	// m1에 대한 결과값을 m2가 확인
		if(this.nm.equals("홍길동")) {
			sc.close();
			System.exit(0);
		}
		else {
			System.out.println("해당 이름은 없습니다.");
			this.m1();	// m1을 재 호출 (재귀메소드)
		}
	sc.close();
	}
}	
