import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		int user1 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		int user2 = sc2.nextInt();
		
		int user3 = user1 * user2; 
		System.out.printf("ù��° �Է°� %d * �ι�° �Է°� %d �� ������� %d * %d = %d �Դϴ�.\n", user1, user2, user1, user2, user3);
		
		if (user3 < 100) {
			System.out.println("100 ������ ������Դϴ�.");
		}
		else if (user3 > 100) {
			System.out.println("100 �̻��� ������Դϴ�.");
		}
		sc1.close();
		sc2.close();
	}

}
