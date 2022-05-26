import java.util.Scanner;

public class while_scan1 {

	public static void main(String[] args) {
		
		/* [응용문제]
		 * 총 2번의 질문을 하게 됩니다. 
		 * 숫자를 입력하여 두 수의 합을 구하는 Scanner 제작하시오.*/

			Scanner sc = new Scanner(System.in);
			
			
			int input; // 사용자 입력
			int r = 1; //반복문
			int total=0; //합
			
			while (r <= 2) {
				System.out.printf("%d번째 숫자를 입력하세요\n", r);
				input = sc.nextInt();
				total += input;
				r++;
			}
			System.out.printf("두 수의 합은 %d 입니다", total);
			sc.close();
	}

}
