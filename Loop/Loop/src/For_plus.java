import java.util.Scanner;

public class For_plus {

	public static void main(String[] args) {
		/* 1���� 10���� ��� ���ڸ� ���� ������� ����Ͻÿ�. */

		int f;
		int total = 0;
		for (f = 1; f <= 10; f++) { // total �������� �ݺ����� ���������� ������Ŵ.
//			total = total + f;
			total += f; // ���� ����
		}
//		System.out.println("�� �հ� : " + total);

		// +=(���ϱ� �Ҵ� ��ȣ) -=(���� �Ҵ� ��ȣ) *=(���ϱ� �Ҵ� ��ȣ) /=(������ �Ҵ� ��ȣ)
		// (b = b - f) == (b -= f)
		/*
		 * [���빮��] ��ü ���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��Ҷ����� 12�� �����ϵ��� �Ͽ� �������� ����Ͻÿ�.
		 */

		int a;
		int b = 500;
		int m= 12;
		for (a = 1; a < 9; a++) {
			b -= m;
		}
//		System.out.printf("������ : %d", b);
	
	/*[���빮��]
	 * ������ 2�� 2*1 ���� 2*9 ������ �� �հ踦 ����Ͻÿ�. ��°� : 90
	 */
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("� �������� �� ���� ���Ͻʴϱ�?");
		 int ipgugu = sc.nextInt();
		 int aa;
		 long bb;
		 int total2 = 0;

		 for (aa=1; aa<=9; aa++) {
		 bb= ipgugu * aa;
		 total2 += bb;
		 }
		 System.out.printf("%d", total2);
		 sc.close();
	
	
	
	
	
	
	}

}
