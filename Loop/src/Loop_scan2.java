import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {

		/* Scanner�� while���� �Բ� ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�. */

		Scanner bb = new Scanner(System.in);
		System.out.println("�� ��?");
		int aa = bb.nextInt();
		int f = 1;
		int zz;
		while (f <= 9) {
			zz = aa * f;
			System.out.print(zz + " ");
			f++;
		}
		bb.close();
	}

}
