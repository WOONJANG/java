import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {

		/* Scanner와 while문을 함께 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작하시오. */

		Scanner bb = new Scanner(System.in);
		System.out.println("몇 단?");
		int aa = bb.nextInt();
		int f = 1;
		int zz;
		while (f <= 9) {
			zz = aa * f;
			System.out.print(zz + " ");
			f++;
		}
		bb.close();
	}

}
