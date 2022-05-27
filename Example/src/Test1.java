import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		int user1 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요.");
		int user2 = sc2.nextInt();
		
		int user3 = user1 * user2; 
		System.out.printf("첫번째 입력값 %d * 두번째 입력값 %d 의 결과값은 %d * %d = %d 입니다.\n", user1, user2, user1, user2, user3);
		
		if (user3 < 100) {
			System.out.println("100 이하의 결과값입니다.");
		}
		else if (user3 > 100) {
			System.out.println("100 이상의 결과값입니다.");
		}
		sc1.close();
		sc2.close();
	}

}
