import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 	����� �н������ a1234�Դϴ�.
		 	����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��µǵ����մϴ�.
		 	"�н����� Ƚ�� �������� ����� ������ �湮�ϼž��մϴ�"
		 	��, �н����尡 ���� ��� " �α��� �Ǿ����ϴ�" ��� ��� �Ǿ���մϴ�.
		 */
	
/*		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���");
		String pw = sc.next();
		
		for (a=0; a<5;a++) {
			if(pw.equals("a1234")) {
				System.out.println("�α��� ����");
				break;
			}
			else if (!(pw.equals("a1234"))) {
				System.out.println("�н����带 �ٽ� �Է��ϼ���");
				pw = sc.next();
				a++;
			}
			if (a == 2) {
				System.out.println("����� ������ �湮�ϼž��մϴ�");
				break;
			}
		}
*/
		final String pw = "a1234";
		int count = 3;
		
		Scanner sc = new Scanner(System.in);
		int w = 0 ;
		String msg = "�н����带 �Է��ϼ���";
		while (w<3) {
			System.out.println(msg);
			String userpw = sc.next();
			if(pw.equals(userpw)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
			}
			else {
				msg = "�ùٸ� �н����带 �Է����ּ���.";
				count--;
				if(count==0) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮 �ϼž� �մϴ�.");
				}
			}
			w++;
			sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}	