import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10;
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		}

		else if (a >= 10 || a <= 22) { // 조건문에 범위를 설정하여 적용함.
			System.out.println("당첨 입니다.");
		} else {
			System.out.println("범위 밖의 숫자 입니다.");
		}

		/*
		 * 응용문제 Q 1부터 45까지 숫자 하나를 입력하세요? error문구 => 0의 값을 입력시 : 숫자 입력이 잘못 되었습니다. 45보다 큰
		 * 숫자 입력시 : 숫자는 1 ~ 45까지만 입력합니다.
		 */

		/*
		 * Scanner L = new Scanner(System.in);
		 * System.out.println("Q 1부터  45까지 숫자 하나를 입력하세요?");
		 * 
		 * byte innum = L.nextByte();
		 * 
		 * if (innum <= 45 && innum >= 1) {
		 * 
		 * if (innum == 7 || innum == 12 || innum == 14) { 
		 * System.out.printf("당첨입니다.");
		 * } 
		 * else { 
		 * System.out.println("다음기회에 참여하세요.");
		 *  }
		 *   } 
		 *   else if (innum == 0) {
		 * System.out.println("숫자 입력이 잘못 되었습니다."); } 
		 * else if (innum > 45) {
		 * System.out.println("숫자는 1 ~ 45까지만 입력 가능 합니다."); 
		 * }
		 */
	
		System.out.println("Q 1부터 45까지 숫자 하나를 입력하세요?");
		
		Scanner qa = new Scanner(System.in);

		int n = qa.nextInt();
		
		if(n == 0) {
			System.out.println("숫자입력이 잘못되었습니다.");
		}
		else if (n>45) {
			System.out.println("숫자는 1~ 45까지만 입력가능합니다.");
		}
		else {
			if(n==7||n==12||n==14) {
				System.out.println("20% 당첨입니다");
			}
			else if (n==41){
				System.out.println("50% 당첨입니다");
			}
			else {
				System.out.println("다음기회에...");
			}
		}
	qa.close();
	
	
	
	
	
	}

}
