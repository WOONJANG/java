import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ��ǰ ������ 42000 �Դϴ�.
			����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
			�ش� ��ǰ ���ݿ� �´� ���� ��ŭ ���Ͽ� ���� ���� �ݾ��� ���.
			extends ���.
			��, 42000�� ���� ���ڰ� �ٲ�� �ȵȴ�.	 ���� �ִ� ���� ���� ������ 5��.	 
			���� ��� ���� main method���� ���.
		 */
		basket2 b2 = new basket2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ش� ��ǰ�� � ���� �Ͻðڽ��ϱ�?");
		int ea = sc.nextInt(); // ����� �Է�
		b2.basket_1(ea); // ��������
		b2.basket_2(); // ���
		sc.close(); // ��ĳ�� ����
	}

}
class basket1{
	private final int item = 42000;
	protected int a;
	protected int b;
	
	public void basket_1(int goods_ea) { // �ޱ�
		this.a = goods_ea;
		this.b = this.a * item;
	}
}
class basket2 extends basket1{
	public void basket_2() {
		
		if (this.a > 5 || this.a < 0) {
			System.out.println("�ش� ��ǰ�� 1�� ~ 5�� ������ ���� �����մϴ�.");
			System.exit(0);
		}
		
		System.out.printf("�ֹ��� ��ǰ�� ���� %d��, �� %d�� �Դϴ�.", a, this.b);
		System.exit(0);
	}
}