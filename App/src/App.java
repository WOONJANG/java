
public class App {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		//��Ģ���� ��ȣ : +, -, *, /
		
		//c = a + b;
		//c = a - b;
		//c = a * b;
		c = b / a;
		System.out.println(c);
		
		String a1 = "ȫ�浿";
		String b1 = " ȯ���մϴ�.";
		String c1;
		c1 = a1 + b1; //���� ���� �϶�, +�� ���� + ���ڿ��� ǥ���� �� �ִ�.
		System.out.println(c1);
		
		/* ���빮��
		 * ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
		 ȫ�浿�� �������� 50000 �Դϴ�.
		 ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ �� �� �ִ�.*/
		
		
		String inputname = "ȫ�浿";
		int inputpoint = 50000;		
		System.out.println(inputname + "�� �������� " + inputpoint + " �Դϴ�." );
		
		/* ���빮��
		 �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�.
		 �ٱ��Ͽ� ���� ��ǰ ������ ��� ���ؼ� �� ���� �ݾ��� ��µǵ��� �Ͻÿ�.
		 ��, $ȯ���� ��µǾ���մϴ�.
		 8.25
		 4.02
		 3.71
		 ������� ������ ���� ����ϼ���.
		 �� �����ݾ� $  �Դϴ�.
		 */
		
		/*
		 * float p1 = 8.25f; float p2 = 4.02f; float p3 = 3.71f; float total = p1 + p2 +
		 * p3;
		 * 
		 * System.out.println("�� �����ݾ� $"+ total +" �Դϴ�");
		 */
		
		// ==
		
		float p1,p2,p3,total;
		p1 = 8.25f;
		p2 = 4.02f;
		p3 = 3.71f;
		total = p1 + p2 + p3;
		
		System.out.println("�� �����ݾ� $"+ total  +" �Դϴ�");

		int k = 3;
		int j = 9;
		double aw = (double)k/j; // (double) ���������� �ڷ��� ���� �ִ� �ڵ� == �׽�Ʈ���� 
		
		System.out.println(aw);

	}

}
