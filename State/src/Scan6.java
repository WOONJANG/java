import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		Scanner inid = new Scanner(System.in);
		System.out.println("���� �� ���̵� �Է��ϼ��� : ");
		String userid = inid.next(); // ����� ���̵� �Է�
		
		Scanner inpw = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ��� : ");
		String userpw = inpw.next(); // ����� ��й�ȣ �Է�

		System.out.printf("���̵� : %s, �н����� : %s", userid, userpw);
		
		/*[�α��� ���α׷�]
		 * ȸ������ ���̵�� jung, su
		 * 				�н������
		 * jung : j1234
		 * su : ssh
		 * 
		 *  �ش� ���̵� �ܿ� �������� "���Ե��� ���� ����� �Դϴ�." 
		 *  ��� ����մϴ�. ����, �н����尡 Ʋ����� "ȸ�� ������ �ٽ�Ȯ���ϼ���"��� ����մϴ�
		 *  ���̵�� �н����� ��� ���� ��� "�α��� �Ǽ̽��ϴ�" ��� ����Ͻʽÿ�. */
		
		/*
		 * String a = "jung", b="su"; String aa= "j1234", bb="ssh";
		 */
		
		if (userid.equals("jung") || userid .equals("su" )) {
			{
				if(userid.equals("jung") && userpw.equals("j1234")) {
					System.out.println("�α��� �Ǽ̽��ϴ�");
				}
				else if (userid.equals("su") && userpw.equals("ssh")) {
					System.out.println("�α��� �Ǽ̽��ϴ�");
				}
				else {
					System.out.println("ȸ�� ������ �ٽ�Ȯ���ϼ���.");
				}
			}
		}
		else {
			System.out.println ("���Ե��� ���� ������Դϴ�.");
			
		}
	
		inid.close();
		inpw.close();
		
		
		
		
		
		
		
		
	}

}
