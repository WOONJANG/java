import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
/*[���빮��]
 * ����ڰ� �ش� ���� �Է��մϴ�.
 * ��, ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� ù��° �Է� ���ڿ� �ι�° �Է� ���� ���� �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
 * ��, �ڵ�� do ~ while������ �ۼ��մϴ�
 * ���� ) ù��° ���� 5, �ι�° ���� 10 
 * ��°��� " ���� ���� ��� �հ�� : 45 �Դϴ�.
 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° �Է� ����");
		int input1 = sc.nextInt();
		System.out.println("�ι�° �Է� ����");
		int input2 = sc.nextInt();
		
		int total = 0;
		
		do {
			total += input1;
			input1++;
		} while(input1<=input2);
		
		System.out.printf("���� ������ ��� �հ�� : %d �Դϴ�", total);
		
		sc.close();
	}
  
}
