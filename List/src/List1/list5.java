package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 사용자가 숫자 금액을 입력합니다.
		 * 해당 숫자 금액 횟수는 총 여덟번 입니다.
		 * 0 ~ n까지 입력 
		 * 해당 입력이 모두 끝나면 최종 합계 금액을 출력 시키시오.
		 * 예시 )
		 * 입금할 금액을 적으세요
		 * 100 100 100 100 100 100 100 100 
		 * 결과 ) 
		 * 총 입금 금액은 800원 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> in = new LinkedList<>(); // 빈배열
		String money;
		int total = 0;
		
		while (true) {
			System.out.println("입금할 금액을 적으세요.");
			money = sc.next();
			try {
				int totalmoney = Integer.parseInt(money);	// totalmoney = 입력 받은 값을 숫자로 전환
				total += totalmoney;	// total += 숫자로 전환한 입력값
				in.add(totalmoney);
				int chance = in.size(); // 기회 = 만들어지는 배열 갯수 
				if(chance >= 8) {	// 입력 8회시 멈춤
					break;
				}
			}catch(Exception e) {
				System.out.println("숫자만 입력");
			}
		}
		System.out.printf("총 입금 금액은 %d원 입니다", total);
		sc.close();
	}

}
