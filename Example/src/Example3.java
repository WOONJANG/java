import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
/*[응용문제]
 * 사용자가 해당 값을 입력합니다.
 * 단, 사용자가 두개의 숫자를 입력하되 첫번째 입력 숫자와 두번째 입력 숫자 범위 안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
 * 단, 코드는 do ~ while문으로 작석합니다
 * 예시 ) 첫번째 숫자 5, 두번째 숫자 10 
 * 출력값은 " 범위 숫자 모든 합계는 : 45 입니다.
 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 입력 숫자");
		int input1 = sc.nextInt();
		System.out.println("두번째 입력 숫자");
		int input2 = sc.nextInt();
		
		int total = 0;
		
		do {
			total += input1;
			input1++;
		} while(input1<=input2);
		
		System.out.printf("범위 숫자의 모든 합계는 : %d 입니다", total);
		
		sc.close();
	}
  
}
