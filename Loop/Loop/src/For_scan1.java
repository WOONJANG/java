import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
		
		/*
		int a = 5;
		System.out.println(a++); // 5���� ���
		System.out.println(++a); // ���� �ϰ� 6���/ ���� ���� �ۼ��ϸ� 1 + 1 +5 = 7
		 */
		
		/*int b = 10;
		int c = 10;
		int d = ++b + (++c);
		System.out.println(d);
		*/
			
		Scanner sc = new Scanner(System.in); //�Է� ����
		int score; //����� �Է�
		int f; // �ݺ���
		int total = 0; //����ڰ� �Է��� ���� ���� �հ� 
		for(f=1; f<4; f++) {
			System.out.println("������ �Է����ּ���.");
			score = sc.nextInt(); // ����ڰ� �Է��� ��
			total += score; //����ڰ� �Է��� ���� �հ躯���� �̰�
		}
		System.out.println("�� ������ ���� " + total + "�Դϴ�."); //�հ� ���
		sc.close(); //���� ����
		
	}

}