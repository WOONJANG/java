import java.util.Scanner;

public class Date220525 {

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
		int re;
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Scanner out = new Scanner(System.in);
		
		for (re=1;re<=2;re++) {
		System.out.println("1�� �Է½� �Ա�ȭ������, 2�� �Է½� ���ȭ������ �̵��˴ϴ�.");
		int inputuser = sc.nextInt();
			if (inputuser ==1) {
				System.out.printf("�Ա�ȭ���Դϴ�.\n�Ա� �Ͻ� �ݾ��� �Է����ּ���\n");
				int inuser = in.nextInt();
				System.out.printf("�Ա��Ͻ� �ݾ��� %d���̸�, ���� �� �ܾ��� %d�� �Դϴ�.\n", inuser, bsm+inuser);
			}
			else if (inputuser==2) {
				
				System.out.printf("���ȭ���Դϴ�.\n��� �Ͻ� �ݾ��� �Է����ּ���\n");
				int outuser = out.nextInt();
				System.out.printf("�Ա��Ͻ� �ݾ��� %d���̸�, ���� �� �ܾ��� %d�� �Դϴ�.\n", outuser,bsm-outuser);
			}
			else {
				System.out.println("1���� 2�� �� �ϳ��� �Է��ϼ���");
			}
			sc.close();
			in.close();
			out.close();
		}
	}

}
