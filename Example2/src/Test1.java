import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) { //Scanner + nextLine
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ּ� : ");
		String adress = sc.nextLine();
		
		System.out.println("��ȭ��ȣ : ");
		String phone_number = sc.nextLine();
		
		System.out.println("�ش� ������ Ȯ�����ּ���\n�ּ� : " + adress + " ��ȭ��ȣ : " + phone_number);
		
		sc.close();
	}
}
