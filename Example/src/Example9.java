import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*[���빮��]
		 * A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		 * "������ �Է��ϼ���?" ��� ������ �� 5���� ������ �Ǹ�,
		 * ��� ������ �ջ��Ͽ� ����մϴ�.
		 * */
		
		/*
		 ��� ������ �ջ��� �� 5���� ������ ���� ��� ���� ����ϼ���.
		 ��� �޼����� "�ش� ������ ������ : " ���
		 ��, ���� ������ 40�� ������ ��� "������Դϴ�." ��� �޼����� ��� ��
		 ���μ����� �����մϴ�.
		 40�� �̻��� ��� "�հ�"�̶�� �޼����� ����ϼ���. 
		 */
		
			//�߰���ȹ 
			//"�Է��Ͻ� ���� ���� �����ּ���." ��� ���� ���� ��� �� �ش� ���� ����ŭ �ݺ����� ������ �Ǹ�,
			//���� �� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
			//    �ð� ��� ���߾��~~~

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
		int usersub = sc.nextInt();
		
		int re; //�ݺ�
		int total = 0; // �ջ�
		int total2;
		int total3 = 1;
//		byte sub = 5; // ���񰹼�
		
		for (re=1; re<=usersub; re ++) { //�ݺ� ���� �ٲٱ�*****
			System.out.printf("%d��° ������ �Է��ϼ���?\n", re); // 5�� ���
			int score = sc.nextInt(); //����� �Է�
			total += score; //�ջ� ���
		}
//		System.out.printf("�� �ջ� ������ %d �� �Դϴ�.", total); // �ջ� ���
		System.out.printf("�� ������ %d �� �̸�, ����� %d�Դϴ�.",total,total/usersub); // �ջ� + ��� ���  ���*******
		total2=total/usersub;
		
		if (total2 < 40) {
			System.out.println(" ������Դϴ�.");
		}
		else if (total2 > 40) {
			System.out.println(" �հ�");
		}
		
		
		
		sc.close();//��ĳ�� ����
		*/
		
		//while ������ �ۼ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��");
		int subject = sc.nextInt();
		int w = 1; //�ݺ�
		int user; //����
		int total=0; //�� ��
		
		while (w<=subject) {
			System.out.println("������ �Է����ּ��� : ");
			user = sc.nextInt();
			total += user;
			
			
			w++;
		}
		double avg = ((double)total) / subject;
		String msg;
		if (avg<40) {
			msg =" �����";
		}
		else {
			msg = " �հ�";
		
		
		}
		System.out.println("���� ��� ������ "+avg +"�� �̸�, "+ msg);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
