import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* Scanner와 do ~while문을 함께 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작하시오. */

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 ?");
		int dan = sc.nextInt();
		int s = 1;
		int R;
		do {
			R = dan * s;
			System.out.printf("%d ", R);
			s++;
		} while (s <= 9);
		sc.close();
	}
}
