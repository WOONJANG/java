import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* Scanner�� do ~while���� �Բ� ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�. */

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� ?");
		int dan = sc.nextInt();
		int s = 1;
		int R;
		do {
			R = dan * s;
			System.out.printf("%d ", R);
			s++;
		} while (s <= 9);
		sc.close();
	}
}
