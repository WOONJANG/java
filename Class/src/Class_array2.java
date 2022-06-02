import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 부터 10까지 숫자를 하나 선택하세요.");
		int no = sc.nextInt();
		
		
		//메모리 초기화
		memorys m = new memorys();
//		memorys m = null;
//		m = new memorys();
		m.ms(no);
		m=null; //해당 인스턴스를 비움.
		
		m = new memorys();
		m.rd();
		
	}

}

class memorys{
	public void ms(int user) {
		//Math.random() 랜덤메소드 사용법 기본은 자료형 double 이다.
		//random -> 보안코드 인증코드 추첨 룰렛 
		double a = Math.random(); //0.0 ~ 1.0 
		int w=0;
		while (w<=10) {
			int b = (int)(Math.random()*10)+1; //기본값이 소숫점이므로 *10 해야 (0~10)정수형이 나옴. *10(0~9), *10+1(1~10)double -> int 변경
//			System.out.printf("%d ", b);
			w++;
		}
		
		
		
/*		
	if(user==b) {
		System.out.println("당첨");
	}
	else {
		System.out.println("다음기회에");
	}
		
		
//		System.out.println(a);
	*/	
		
	}
	
	public void rd() { //random util 사용법
		Random r = new Random();	// random 객체생성 및 인스턴스 적용
		int w = 0;
		while (w<=5) {
			
			System.out.print(r.nextInt(45)+1+ " "); //0~9까지 r.nextInt를 사용
			w++;
		}

	}
}