import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/* [���빮��]
		 * ����ڰ� �Է��� ���ڿ��� ���缭 �������� �۵��Ǹ�, ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����Ͻÿ�
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼����� ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ� ���� ���� ���� ¦������ Ȧ�� ������ ����Ͻø� �˴ϴ�.
		 * ��, �ش� �ݺ����� for, while, do~while������ �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.*/
		 Scanner sc = new Scanner(System.in);
		 System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���??");
		 int ipgugu = sc.nextInt();
		 int aa;
		 int bb;
		 int total = 0;
		 sc.close();

		 for (aa=1; aa<=9; aa++) {
		 bb= ipgugu * aa;
		 total += bb;
		 }
		 if(total%2==0) {
			 System.out.printf("�Է��Ͻ� %d���� �������� ������ %d �̸�, �� ������� ¦���Դϴ�.", ipgugu, total);
		 }
		 else {
			 System.out.printf("�Է��Ͻ� %d���� �������� ������ %d �̸�, �� ������� Ȧ���Դϴ�.", ipgugu, total);
		 }
		 //System.out.printf("%d", total2);
	}

}
