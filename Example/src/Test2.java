import java.util.Scanner;

public class Test2 {

public static void main(String[] args) {

/*[���빮��]
* �⺻ �ڻ�ݾ� 100000
* 1 �Է½� �Ա� 2 �Է½� ���
* �޼����� ��µǾ���Ѵ�.
* 1 �Է½�
* "�Ա� �� �ݾ��� �Է��ϼ���"
* �Է±ݾ� + �⺻ �ڻ�ݾ� ���
* 2 �Է½�
* "��� �� �ݾ��� �Է��ϼ���"
* �⺻ �ڻ�ݾ� - �Է±ݾ� ���
* */

		final int bsm = 100000;
		//int re;
		Scanner sc = new Scanner(System.in); // ù 1or2���
		Scanner in = new Scanner(System.in); // �Ա� �Է�
		Scanner out = new Scanner(System.in); // ��� �Է�
	//	Scanner RE = new Scanner(System.in); // �ʱ�ȭ�� �Է�
		
		//for (re=1;re<=2;re++) {
		
			System.out.println("1�� �Է½� �Ա�ȭ��, 2�� �Է½� ���ȭ������ �̵��˴ϴ�.");
			byte inputuser = sc.nextByte(); //����� 1or2 �Է�
			
		if (inputuser ==1) {
			System.out.printf("         �Ա�ȭ���Դϴ�.\n�Ա� �Ͻ� �ݾ��� �Է����ּ���\n");
			int inuser = in.nextInt(); //����� �Ա� �Է�
			System.out.printf("�Ա��Ͻ� �ݾ��� %d���̸�, ���� �� �ܾ��� %d�� �Դϴ�.\n", inuser, bsm+inuser);
		//	int REuser = RE.nextByte(); // ����� �Է� �ʱ�ȭ������ ���ư��Ƿ��� 3�� �����ּ���.\n
		}
		
		else if (inputuser==2) {
			System.out.printf("         ���ȭ���Դϴ�.\n��� �Ͻ� �ݾ��� �Է����ּ���\n"); 
			int outuser = out.nextInt(); //����� ��� �Է�  
			System.out.printf("�Ա��Ͻ� �ݾ��� %d���̸�, ���� �� �ܾ��� %d�� �Դϴ�.\n", outuser, bsm-outuser);
		//	int REuser = RE.nextByte(); // ����� �Է� �ʱ�ȭ������ ���ư��Ƿ��� 3�� �����ּ���.\n
		}
				
		else {
			System.out.println("1�� 2 �� �ϳ��� �Է��ϼ���");
		}
		//}
		sc.close();
		in.close();
		out.close();

/*
  
 
		int money = 100000;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("1�� �Ա� 2�� ���");
		int work = sc2.nextInt();
		
		Scanner cal = new Scanner(System.in);
		if (work == 1) {
			System.out.println("�Ա� �ݾ� �Է�");
			int total = cal.nextInt();
			money = money + total;
		}
		else if (work == 2) {
			System.out.println("��ݱݾ� �Է�");
			money = money - total;
		}
		else {
			System.out.println("���� �Է��� �ƴմϴ�");
			sc.close();
		}

		System.out.println("ó���� ������" + money + "�� �Դϴ�.");
		
		sc.close();
		cal.close();
*/






















}

		}
