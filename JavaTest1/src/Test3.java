import java.util.Scanner;

public class Test3 { // ���ǹ� + ¦��Ȧ�� + ��ĳ��

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		int user = sc.nextInt();
		
		if (user > 60) {
			System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.");
		}
		else {
			if(user%2==0) {
				System.out.println("¦��");
			}
			  else {
			  	System.out.println("Ȧ��");
			  }
			/*
			else if (user%2 != 0) {
				System.out.println("Ȧ��");
			}
			 */
			sc.close();
		}
	}
}
