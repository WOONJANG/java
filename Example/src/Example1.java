import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/* [���빮��]
		 * while������ �ڵ带 �ۼ�. ���μ����� ������ �����ϴ�.
		 * ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�. 
		 * Q1. "7000 ���� �Ͻðڽ��ϱ�?" ��� ��µǸ�, ���� 1�̶�� �Է��ϸ�
		 * �������� �ݾ׿� �߰��Ǿ� ���ϴ�. ��, 2��� �Է½�
		 * �������� �ݾ׿� �߰� �Ǿ� ���� �ȵ˴ϴ�.
		 * �� ���� Ƚ���� 4�� �Դϴ�.
		 * �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);
		final int money = 7000;
		int m = 1; // 4�� �ݺ�
		int total = 0;
				
		while(m<=4) {
		System.out.printf("%d ��° ��ǰ 7000 �����Ͻðڽ��ϱ�? ", m);	
			int input = sc.nextInt();
		 	if(input==1) {
		 		total +=money;
			}
		 	m++;
		}
		System.out.println("�� �����ݾ��� " + total);
		sc.close();
	}

}
