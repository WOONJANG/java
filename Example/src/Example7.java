import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� ��, �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		 * "ù��° �Է°� ��, (1~10����) �Դϴ�. : "
		 * "�ι�° �Է°� ��, (1~10����) �Դϴ�. : "
		 * "����° �Է°� ��, (1~10����) �Դϴ�. : "
		 * "�����������Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�." (+ - * /)
		 * 
		 * �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű�ÿ�.
		 */
/*		
		Scanner sc = new Scanner(System.in);
		
			int r=0; //��Ģ���� �����
		
			System.out.println("ù��° �Է°� ��, (1~10����) �Դϴ�. : ");
			int user1 = sc.nextInt();
			System.out.println("�ι�° �Է°� ��, (1~10����) �Դϴ�. : ");
			int user2 = sc.nextInt();
			System.out.println("����° �Է°� ��, (1~10����) �Դϴ�. : ");
			int user3 = sc.nextInt();
			System.out.println("�����������Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�. : ");
			String user4 = sc.next();
			
			if (user4.equals("+")) {
				r = user1 + user2 + user3;
//				System.out.printf("�Է°��� ���� ����� %d + %d + %d = %d �Դϴ�",user1, user2, user3, user1+user2+user3);
			}
			else if (user4.equals("-")) {
				r = user1 - user2 - user3;
//				System.out.printf("�Է°��� ���� ����� %d - %d - %d = %d �Դϴ�",user1, user2, user3, user1-user2-user3);
			}
			else if (user4.equals("*")) {
				r = user1 * user2 * user3;
//				System.out.printf("�Է°��� ���� ����� %d * %d * %d = %d �Դϴ�",user1, user2, user3, user1*user2*user3);
			}
			else if (user4.equals("/")) {
				r = user1 / user2 / user3;
//				System.out.printf("�Է°��� ���� ����� %d / %d / %d = %d �Դϴ�.",user1, user2, user3, user1/user2/user3);
			}
			else {
				System.out.println("��Ģ���� + - * / �� �Ѱ��� �Է��ϼ���.");
			}
			System.out.printf("�Է°� %d %s %d %s %d = %d �Դϴ�. ",user1, user4, user2, user4, user3, r);
			sc.close();
*/				
	
			Scanner sc = new Scanner(System.in);
			System.out.println("ù��°�� �Է�");
			int a1= sc.nextInt();
			System.out.println("�ι�°�� �Է�");
			int a2 = sc.nextInt();
			System.out.println("����°�� �Է�");
			int a3 = sc.nextInt();
			System.out.println("�����ȣ�Է�");
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


