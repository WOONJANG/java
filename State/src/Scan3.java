import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {

		Scanner inputnumber = new Scanner(System.in);

		System.out.println("Q ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?");
		
		System.out.print("����ڰ� �Է��� ���� : ");

		int evenoddnumber = inputnumber.nextInt() % 2; // %�� ���� �����鼭 �������� Ȯ���ϴ� ���ı�.

		if (evenoddnumber == 0) {
			System.out.println("¦���� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ���� �Դϴ�.");
		}
inputnumber.close();
	}

}
