import java.util.Scanner;

public class Test4 { // ��ĳ�� + �ݺ��� + ���ǹ� + ����(0���� ���� ��)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �Է�");
		int gugu = sc.nextInt();
		
		int re = 1;
		do {
			if (gugu >= 0) {
				int result = gugu * re;
				System.out.println(gugu + " * " + re + " = " + (result) );
				re++;
			}
				else {
					System.out.println("�������� �������� �̿��� �� �����ϴ�.");
					break;
				}
		}while(re <= 9); 
		sc.close();
	}
}
