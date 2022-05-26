import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/* [응용문제]
		 * while문으로 코드를 작성. 프로세서는 다음과 같습니다.
		 * 사용자가 상품을 전체 선택하였습니다. 
		 * Q1. "7000 결제 하시겠습니까?" 라고 출력되며, 숫자 1이라고 입력하면
		 * 최종결제 금액에 추가되어 집니다. 단, 2라고 입력시
		 * 최종결제 금액에 추가 되어 지면 안됩니다.
		 * 총 질문 횟수는 4번 입니다.
		 * 마지막에 최종 결제 금액이 나오도록 코드를 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);
		final int money = 7000;
		int m = 1; // 4번 반복
		int total = 0;
				
		while(m<=4) {
		System.out.printf("%d 번째 상품 7000 결제하시겠습니까? ", m);	
			int input = sc.nextInt();
		 	if(input==1) {
		 		total +=money;
			}
		 	m++;
		}
		System.out.println("총 결제금액은 " + total);
		sc.close();
	}

}
