import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10;
		if (a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
		}

		else if (a >= 10 || a <= 22) { // ���ǹ��� ������ �����Ͽ� ������.
			System.out.println("��÷ �Դϴ�.");
		} else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}

		/*
		 * ���빮�� Q 1���� 45���� ���� �ϳ��� �Է��ϼ���? error���� => 0�� ���� �Է½� : ���� �Է��� �߸� �Ǿ����ϴ�. 45���� ū
		 * ���� �Է½� : ���ڴ� 1 ~ 45������ �Է��մϴ�.
		 */

		/*
		 * Scanner L = new Scanner(System.in);
		 * System.out.println("Q 1����  45���� ���� �ϳ��� �Է��ϼ���?");
		 * 
		 * byte innum = L.nextByte();
		 * 
		 * if (innum <= 45 && innum >= 1) {
		 * 
		 * if (innum == 7 || innum == 12 || innum == 14) { 
		 * System.out.printf("��÷�Դϴ�.");
		 * } 
		 * else { 
		 * System.out.println("������ȸ�� �����ϼ���.");
		 *  }
		 *   } 
		 *   else if (innum == 0) {
		 * System.out.println("���� �Է��� �߸� �Ǿ����ϴ�."); } 
		 * else if (innum > 45) {
		 * System.out.println("���ڴ� 1 ~ 45������ �Է� ���� �մϴ�."); 
		 * }
		 */
	
		System.out.println("Q 1���� 45���� ���� �ϳ��� �Է��ϼ���?");
		
		Scanner qa = new Scanner(System.in);

		int n = qa.nextInt();
		
		if(n == 0) {
			System.out.println("�����Է��� �߸��Ǿ����ϴ�.");
		}
		else if (n>45) {
			System.out.println("���ڴ� 1~ 45������ �Է°����մϴ�.");
		}
		else {
			if(n==7||n==12||n==14) {
				System.out.println("20% ��÷�Դϴ�");
			}
			else if (n==41){
				System.out.println("50% ��÷�Դϴ�");
			}
			else {
				System.out.println("������ȸ��...");
			}
		}
	qa.close();
	
	
	
	
	
	}

}
