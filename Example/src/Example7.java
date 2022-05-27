import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 사용자가 다음 질문에 확인하여 값을 입력 후, 해당 결과를 도출하는 프로세서를 제작합니다.
		 * "첫번째 입력값 단, (1~10까지) 입니다. : "
		 * "두번째 입력값 단, (1~10까지) 입니다. : "
		 * "세번째 입력값 단, (1~10까지) 입니다. : "
		 * "마지막질문입니다. 해당 세가지 값에 대한 산술기호를 적으시오." (+ - * /)
		 * 
		 * 해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력시키시오.
		 */
/*		
		Scanner sc = new Scanner(System.in);
		
			int r=0; //사칙연산 결과값
		
			System.out.println("첫번째 입력값 단, (1~10까지) 입니다. : ");
			int user1 = sc.nextInt();
			System.out.println("두번째 입력값 단, (1~10까지) 입니다. : ");
			int user2 = sc.nextInt();
			System.out.println("세번째 입력값 단, (1~10까지) 입니다. : ");
			int user3 = sc.nextInt();
			System.out.println("마지막질문입니다. 해당 세가지 값에 대한 산술기호를 적으시오. : ");
			String user4 = sc.next();
			
			if (user4.equals("+")) {
				r = user1 + user2 + user3;
//				System.out.printf("입력값에 대한 결과는 %d + %d + %d = %d 입니다",user1, user2, user3, user1+user2+user3);
			}
			else if (user4.equals("-")) {
				r = user1 - user2 - user3;
//				System.out.printf("입력값에 대한 결과는 %d - %d - %d = %d 입니다",user1, user2, user3, user1-user2-user3);
			}
			else if (user4.equals("*")) {
				r = user1 * user2 * user3;
//				System.out.printf("입력값에 대한 결과는 %d * %d * %d = %d 입니다",user1, user2, user3, user1*user2*user3);
			}
			else if (user4.equals("/")) {
				r = user1 / user2 / user3;
//				System.out.printf("입력값에 대한 결과는 %d / %d / %d = %d 입니다.",user1, user2, user3, user1/user2/user3);
			}
			else {
				System.out.println("사칙연산 + - * / 중 한개를 입력하세요.");
			}
			System.out.printf("입력값 %d %s %d %s %d = %d 입니다. ",user1, user4, user2, user4, user3, r);
			sc.close();
*/				
	
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째값 입력");
			int a1= sc.nextInt();
			System.out.println("두번째값 입력");
			int a2 = sc.nextInt();
			System.out.println("세번째값 입력");
			int a3 = sc.nextInt();
			System.out.println("산술기호입력");
			String a4 = sc.next();
			
		
			if (a4.equals("+")) {
				System.out.println(a1+a2+a3);
			}
			else if (a4.equals("-")) {
				System.out.println(a1-a2-a3);
			}
			else if (a4.equals("*")) {
				System.out.println(a1*a2*a3);
			}
			else {
				System.out.println(a1/a2/a3);		
			}
		
	
	}
	
	
	}


