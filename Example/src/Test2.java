import java.util.Scanner;

public class Test2 {

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
		//int re;
		Scanner sc = new Scanner(System.in); // 첫 1or2출력
		Scanner in = new Scanner(System.in); // 입금 입력
		Scanner out = new Scanner(System.in); // 출금 입력
	//	Scanner RE = new Scanner(System.in); // 초기화면 입력
		
		//for (re=1;re<=2;re++) {
		
			System.out.println("1번 입력시 입금화면, 2번 입력시 출금화면으로 이동됩니다.");
			byte inputuser = sc.nextByte(); //사용자 1or2 입력
			
		if (inputuser ==1) {
			System.out.printf("         입금화면입니다.\n입금 하실 금액을 입력해주세요\n");
			int inuser = in.nextInt(); //사용자 입금 입력
			System.out.printf("입금하신 금액은 %d원이며, 현재 총 잔액은 %d원 입니다.\n", inuser, bsm+inuser);
		//	int REuser = RE.nextByte(); // 사용자 입력 초기화면으로 돌아가실려면 3을 눌러주세요.\n
		}
		
		else if (inputuser==2) {
			System.out.printf("         출금화면입니다.\n출금 하실 금액을 입력해주세요\n"); 
			int outuser = out.nextInt(); //사용자 출금 입력  
			System.out.printf("입금하신 금액은 %d원이며, 현재 총 잔액은 %d원 입니다.\n", outuser, bsm-outuser);
		//	int REuser = RE.nextByte(); // 사용자 입력 초기화면으로 돌아가실려면 3을 눌러주세요.\n
		}
				
		else {
			System.out.println("1과 2 중 하나만 입력하세요");
		}
		//}
		sc.close();
		in.close();
		out.close();

/*
  
 
		int money = 100000;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("1번 입금 2번 출금");
		int work = sc2.nextInt();
		
		Scanner cal = new Scanner(System.in);
		if (work == 1) {
			System.out.println("입금 금액 입력");
			int total = cal.nextInt();
			money = money + total;
		}
		else if (work == 2) {
			System.out.println("출금금액 입력");
			money = money - total;
		}
		else {
			System.out.println("정상 입력이 아닙니다");
			sc.close();
		}

		System.out.println("처리된 내용은" + money + "원 입니다.");
		
		sc.close();
		cal.close();
*/






















}

		}
