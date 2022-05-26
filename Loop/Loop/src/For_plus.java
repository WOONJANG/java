import java.util.Scanner;

public class For_plus {

	public static void main(String[] args) {
		/* 1부터 10까지 모든 숫자를 합한 결과값을 출력하시오. */

		int f;
		int total = 0;
		for (f = 1; f <= 10; f++) { // total 변수값에 반복값을 지속적으로 증가시킴.
//			total = total + f;
			total += f; // 위와 동일
		}
//		System.out.println("총 합계 : " + total);

		// +=(더하기 할당 기호) -=(빼기 할당 기호) *=(곱하기 할당 기호) /=(나누기 할당 기호)
		// (b = b - f) == (b -= f)
		/*
		 * [응용문제] 전체 값은 500이 있습니다. 총 8회 동안 반복되면서 한번 반복할때마다 12식 감소하도록 하여 최종값을 출력하시오.
		 */

		int a;
		int b = 500;
		int m= 12;
		for (a = 1; a < 9; a++) {
			b -= m;
		}
//		System.out.printf("최종값 : %d", b);
	
	/*[응용문제]
	 * 구구단 2단 2*1 부터 2*9 까지의 총 합계를 출력하시오. 출력값 : 90
	 */
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("어떤 구구단의 총 합을 원하십니까?");
		 int ipgugu = sc.nextInt();
		 int aa;
		 long bb;
		 int total2 = 0;

		 for (aa=1; aa<=9; aa++) {
		 bb= ipgugu * aa;
		 total2 += bb;
		 }
		 System.out.printf("%d", total2);
		 sc.close();
	
	
	
	
	
	
	}

}
