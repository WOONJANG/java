import java.util.Scanner;

public class Date220525 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 기본 자산금액 100000
		 * 1 입력시 입금 2 입력시 출금
		 * 메세지가 출력되어야한다.
		 * 1 입력시 
		 * "입금 할 금액을 입력하세요"
		 * 입력금액 + 기본 자산금액 출력
		 * 2 입력시
		 * "출금 할 금액을 입력하세요"
		 * 기본 자산금액 - 입력금액 출력
		 * */
		
		final int bsm = 100000;
		int re;
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Scanner out = new Scanner(System.in);
		
		for (re=1;re<=2;re++) {
		System.out.println("1번 입력시 입금화면으로, 2번 입력시 출금화면으로 이동됩니다.");
		int inputuser = sc.nextInt();
			if (inputuser ==1) {
				System.out.printf("입금화면입니다.\n입금 하실 금액을 입력해주세요\n");
				int inuser = in.nextInt();
				System.out.printf("입금하신 금액은 %d원이며, 현재 총 잔액은 %d원 입니다.\n", inuser, bsm+inuser);
			}
			else if (inputuser==2) {
				
				System.out.printf("출금화면입니다.\n출금 하실 금액을 입력해주세요\n");
				int outuser = out.nextInt();
				System.out.printf("입금하신 금액은 %d원이며, 현재 총 잔액은 %d원 입니다.\n", outuser,bsm-outuser);
			}
			else {
				System.out.println("1번과 2번 중 하나만 입력하세요");
			}
			sc.close();
			in.close();
			out.close();
		}
	}

}
