import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ���� ���� �ݾ��� �ֽ��ϴ�
		 * 3���� ��ǰ
		 * "���ڵ�� ��ǰ�� �Է½����ּ���" �ݾ��� �Է��ϰ�
		 * ��, ���� %�Է����ּ��� : " ��� ������ �Բ�
		 * �ش� ���� ���ڸ� �Է��ϸ� ���� �ݾ��� ����Ǿ� ��µǵ��� �մϴ�.*/
/*
		Scanner sc = new Scanner(System.in);
		int re; //�ݺ���
		int total = 0;  //�հ�

			System.out.println("�����Ͻ� ��ǰ ������ �Է½����ּ���.");
			int ea = sc.nextInt();

		for (re=1; re<=ea; re++) {
			System.out.println("���ڵ�� ��ǰ�� �Է½����ּ���.");
			int price = sc.nextInt();
			total += price;
		}
		System.out.printf("%d���� ��ǰ �� �ݾ��� %d�Դϴ�. ���� �ۼ�Ʈ�� �Է����ּ���.\n", ea, total);
		int coupon = sc.nextInt();

		double a = coupon * 0.01;
		double b = total * a;
		double c = total - b;
		System.out.println(coupon + "�ۼ�Ʈ ���α��� ����Ͽ� ���� ���� �ݾ��� " + c + "���Դϴ�." );
		sc.close();
		*/

		int f, ff;
		int total = 0;
		for (f = 1; f <= 3; f++) {
//			System.out.println(f);
			for (ff = 1; ff <= 4; ff++) {
//				System.out.println(ff);
				total += f + ff;
				System.out.println(f + " + " + ff + " = ");
			}
		}

	}

}