import java.io.InputStream;
import java.util.Scanner;

public class Date220524 {

	public static void main(String[] args) {
		
		Scanner inputid = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		String userid = inputid.next();
		
		
		Scanner inputpw = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String userpw = inputpw.next();
		
				
		if (userid.equals("qwerty") && userpw.equals("a1234")) {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		}
		else if (userid.equals("qwerty") || userpw.equals("a1234")) {
			System.out.println("���̵� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
		}
		else {
			System.out.println("���̵� ��й�ȣ�� �ؾ���Ƚ��ϱ�?");
		}

	}

}
