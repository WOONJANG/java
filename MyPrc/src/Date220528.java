import java.util.Scanner;

public class Date220528 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ���� ���� �ݾ��� �ֽ��ϴ�
		 * 3���� ��ǰ
		 * "���ڵ�� ��ǰ�� �Է½����ּ���" �ݾ��� �Է��ϰ�
		 * ��, ���� %�Է����ּ��� : " ��� ������ �Բ�
		 * �ش� ���� ���ڸ� �Է��ϸ� ���� �ݾ��� ����Ǿ� ��µǵ��� �մϴ�.*/
		
		Scanner sc = new Scanner(System.in);
		int re; //�ݺ���
		int total = 0;  //�հ�
		byte item;; // ��ǰ ����
		
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
		sc.close();
		
			
			}

}
