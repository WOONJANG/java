import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {

		/*
		 * [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
		 * 
		 * Q. ���� ���� ��ȣ�� �Է��ϼ���?
		 * 
		 * ���� 220524
		 * 
		 * ����ڰ� ���� 220524 �� �Է½� , "������ȣ�� Ʋ���ϴ�." ���
		 * 
		 * ������ ������ȣ �Է½�, "���� Ȯ�εǼ̽��ϴ�." ���
		 * 
		 * ��, 220524�� java����� ���� ���� ����Ǵ� ������ ó���ϼ���.
		 * 
		 * 
		 * 
		 * int sc = 220524;
		 * 
		 * Scanner aa = new Scanner(System.in);
		 * System.out.println("Q. ���� ���� ��ȣ�� �Է��ϼ���?"); //�ܼ� ��� int a = aa.nextInt();
		 * //����� �Է�
		 * 
		 * if (a == sc) { System.out.println("���� Ȯ�εǼ̽��ϴ�."); // �����Ϸ� }
		 * 
		 * else { System.out.println("������ȣ�� Ʋ���ϴ�."); // �����Ұ� }
		 * 
		 * aa.close(); // ��ĳ�� ����
		 */

		// [scanner ���ǻ���]
		// scanner�� import ���
		// ������� ����ڰ� ����� �Է��ϴ����� ���ѹ���
		// �ش� ����ڰ��Է��� ���� �޴� ������ ����

		/*
		 * [���빮��]
		 * 
		 * ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�. ù��° ���� ���� �Է��ϼ���. �ι�° ���� ���� �Է��ϼ���.
		 * 
		 * ù��° ���� �� * �ι�° ���� ���� ���� ����� ����Ͻÿ�. ��, �ش� ������� 100 ���� �� ���, "100������ ������Դϴ�.*
		 * ���, 100 �̻��ϰ�� "�ش� ���� 100 �̻� ����� �Դϴ�." ���.
		 */

	
		/*Scanner zz = new Scanner(System.in);
		//System.out.println("ù��° ���� ���� �Է��ϼ���.");
		int i = zz.nextInt();

		Scanner yy = new Scanner(System.in);
		//System.out.println("�ι�° ���� ���� �Է��ϼ���.");
		int j = yy.nextInt();

		int k = i * j;
		//System.out.printf("ù��° �� * �ι�° �� : %d\n", k);

		if (k < 100) {
		//	System.out.println("100������ ������Դϴ�.");
		} 
		else if (k > 100) {
		//	System.out.println("100�̻��� ������Դϴ�.");
		}
		zz.close();
		yy.close(); */
		/*
		 * else if (k==100) { System.out.println("100�� ������Դϴ�."); }
		 */

		/*[���빮��]
		 * ���� �ڽ��� ���忡�� �� ����� �ϴ� ���μ����� �����ؾ��Ѵ�
		 * ���� �⺻ �ڻ�ݾ� :100,000 
		 * "1�� �Է½� �Ա� 2�� �Է½� ��� �Դϴ�"
		 * ��� �޼����� ���� ���� ���� �Ǿ���մϴ�.
		 * 1���� �Է½� 
		 * "�ش� �ݾ��� �Է��ϼ���."
		 * ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�. 
		 * 2���� �Է½�
		 * "��� �� �ݾ��� �Է��ϼ���."
		 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ� �ݾ��� ����Ͽ� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.*/
		
		System.out.println("1�� �Է½� �Ա� 2�� �Է½� ��� �Դϴ�.");
		
		int bm = 100000; //�⺻ �ڻ�
				
		Scanner qq = new Scanner(System.in);
		Scanner ww = new Scanner(System.in);
		
		int in = qq.nextInt(); // �Աݾ� ����� ��ǲ
		int out = ww.nextInt();
		String inop = qq.next();
		String outop = ww.next();
		
		if (inop.equals("1")) {
			if(inop.equals("1")){
				System.out.println("�ش� �ݾ��� �Է��ϼ���.");//���
			}
			if (inop.equals("1")) {
			System.out.println(bm + in); //�⺻ + �Ա�
		}
		else if (inop.equals("2")) {
			System.out.println("��� �� �ݾ��� �Է��ϼ���."); //���
			System.out.println(bm - out); // �⺻ - ���
			}
		}

		//System.out.println((bm+in) - out); // �⺻ + �Ա� - ���

		
		
		
	}

}
