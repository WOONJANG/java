import java.util.Scanner;

public class Mystery1 {

	public static void main(String[] args) {
		
		/*
		 * ����� �н������ a1234 �Դϴ�.
		 * ����ڰ� �н����带 �Է��մϴ�.
		 * ��, 3ȸ �̻� ���н� ������ ���� ��µǵ����մϴ�.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž��մϴ�"
		 * ��, �н����尡 ���� ���
		 * "�α��� �Ǿ����ϴ�."
		 * ��� ��� �Ǿ���մϴ�.
		 * */


		
		final String pw = "a1234"; //��й�ȣ
		int count=3;
		
		Scanner sc = new Scanner(System.in);
		String msg = "��й�ȣ�� �Է��ϼ���.";
		int re =1; //�ݺ�
		while (re<=3) {
			System.out.println(msg);
			String  userpw = sc.next();
			if (pw.equals(userpw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}
			
			else {
				msg = "�ùٸ� �н����带 �Է��ϼ���.";
				count--;
				if (count==0) {
					System.out.println("�н����� �Է� Ƚ�� �������� ����� ������ �湮�ϼž��մϴ�.");
				}
			}
			re++;
		}
sc.close();				
			
			}
		}
		
			
		
				

	
