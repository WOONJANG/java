import java.util.Scanner;

public class Test4 { // 스캐너 + 반복문 + 조건문 + 음수(0보다 작은 수)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자 입력");
		int gugu = sc.nextInt();
		
		int re = 1;
		do {
			if (gugu >= 0) {
				int result = gugu * re;
				System.out.println(gugu + " * " + re + " = " + (result) );
				re++;
			}
				else {
					System.out.println("음수값은 구구단을 이용할 수 없습니다.");
					break;
				}
		}while(re <= 9); 
		sc.close();
	}
}
