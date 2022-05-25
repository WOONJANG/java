import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {

		/*
		 * [인증번호 발송에 대한 번호 비교 코드]
		 * 
		 * Q. 인증 받은 번호를 입력하세요?
		 * 
		 * 숫자 220524
		 * 
		 * 사용자가 숫자 220524 외 입력시 , "인증번호가 틀립니다." 출력
		 * 
		 * 동일한 인증번호 입력시, "인증 확인되셨습니다." 출력
		 * 
		 * 단, 220524는 java실행시 가장 먼저 실행되는 변수로 처리하세요.
		 * 
		 * 
		 * 
		 * int sc = 220524;
		 * 
		 * Scanner aa = new Scanner(System.in);
		 * System.out.println("Q. 인증 받은 번호를 입력하세요?"); //콘솔 출력 int a = aa.nextInt();
		 * //사용자 입력
		 * 
		 * if (a == sc) { System.out.println("인증 확인되셨습니다."); // 인증완료 }
		 * 
		 * else { System.out.println("인증번호가 틀립니다."); // 인증불가 }
		 * 
		 * aa.close(); // 스캐너 종료
		 */

		// [scanner 주의사항]
		// scanner를 import 사용
		// 문구출력 사용자가 어떤값을 입력하는지에 대한문구
		// 해당 사용자가입력한 값을 받는 변수를 지정

		/*
		 * [응용문제]
		 * 
		 * 사용자가 입력하여 조건에 맞는 메세지를 출력하시오. 첫번째 숫자 값을 입력하세요. 두번째 숫자 값을 입력하세요.
		 * 
		 * 첫번째 숫자 값 * 두번째 숫자 값에 대한 결과를 출력하시오. 단, 해당 결과값이 100 이하 일 경우, "100이하의 결과값입니다.*
		 * 출력, 100 이상일경우 "해당 값은 100 이상 결과값 입니다." 출력.
		 */

	
		/*Scanner zz = new Scanner(System.in);
		//System.out.println("첫번째 숫자 값을 입력하세요.");
		int i = zz.nextInt();

		Scanner yy = new Scanner(System.in);
		//System.out.println("두번째 숫자 값을 입력하세요.");
		int j = yy.nextInt();

		int k = i * j;
		//System.out.printf("첫번째 값 * 두번째 값 : %d\n", k);

		if (k < 100) {
		//	System.out.println("100이하의 결과값입니다.");
		} 
		else if (k > 100) {
		//	System.out.println("100이상의 결과값입니다.");
		}
		zz.close();
		yy.close(); */
		/*
		 * else if (k==100) { System.out.println("100이 결과값입니다."); }
		 */

		/*[응용문제]
		 * 고객이 자신의 통장에서 입 출금을 하는 프로세서를 제작해야한다
		 * 고객의 기본 자산금액 :100,000 
		 * "1번 입력시 입금 2번 입력시 출금 입니다"
		 * 라는 메세지가 제일 먼저 실행 되어야합니다.
		 * 1번을 입력시 
		 * "해당 금액을 입력하세요."
		 * 사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산 금액을 출력하시면 됩니다. 
		 * 2번을 입력시
		 * "출금 할 금액을 입력하세요."
		 * 사용자가 입력한 금액 - 기본 자산 금액을 계산하여 총 자산 금액을 출력하시면 됩니다.*/
		
		System.out.println("1번 입력시 입금 2번 입력시 출금 입니다.");
		
		int bm = 100000; //기본 자산
				
		Scanner qq = new Scanner(System.in);
		Scanner ww = new Scanner(System.in);
		
		int in = qq.nextInt(); // 입금액 사용자 인풋
		int out = ww.nextInt();
		String inop = qq.next();
		String outop = ww.next();
		
		if (inop.equals("1")) {
			if(inop.equals("1")){
				System.out.println("해당 금액을 입력하세요.");//출력
			}
			if (inop.equals("1")) {
			System.out.println(bm + in); //기본 + 입금
		}
		else if (inop.equals("2")) {
			System.out.println("출금 할 금액을 입력하세요."); //출력
			System.out.println(bm - out); // 기본 - 출금
			}
		}

		//System.out.println((bm+in) - out); // 기본 + 입금 - 출금

		
		
		
	}

}
