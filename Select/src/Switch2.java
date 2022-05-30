import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 사용자가 다음과 같은 질문을 받습니다.
		 * 1~5번 까지 숫자를 하나 입력해 주시길 바랍니다.
		 * 
		 * 결과 내용
		 * 1 : 5% 할인쿠폰
		 * 2 : 10% 할인쿠폰
		 * 3~4 : 택배비 무료
		 * 5 : 다음기회에
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 부터 5번까지 숫자를 하나 입력해 주시길 바랍니다.");
		int user = sc.nextInt();
		String msg;
/*
		switch(user) {
			case 1:
				msg = "5% 할인쿠폰";
				break;
			
			case 2:
				msg = "10% 할인쿠폰";
				break;
			
			case 3:
			case 4:
				msg = "택배비 무료";
				break;
			
			default:
				msg = "다음 기회에";
				break;
		}
*/
		/*switch ver14. 이상 형태*/
		switch (user) {
			case 1 -> {
				msg = "5% 할인쿠폰";
			//break 빠짐
			}
			case 2 ->{
				msg = "10% 할인쿠폰";
			}
			case 3,4 -> {
				msg = "택배비 무료";
			}
			default ->{
				msg = "다음 기회에";
			}
			
			}

		System.out.println(msg);
		sc.close();

	}

			}
