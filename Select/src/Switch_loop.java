
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign = "*";
		int total=0; //* ������ 0 ������ X / *�� ������ ���� �����ϸ� O
		/*case �ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
		���� ������ �������� ����ص� �����ϸ�, case ���� �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ ����.
		��, case�� �ϳ��� ������ ���� ��� ������ ���̽��� ���� �۵����� ����.
		*/
		switch (sign) {
		case "+" -> {
			int a;
			total = 0;
			for(a=1;a<=5;a++) {
				total += a;
			}
		}
		case "-" -> {
			total =0;
System.out.println("�������� ��� ���� �ʽ��ϴ�.");
		
		}
		
		case "*" -> {
			total=1;
			int c=1;
			do {
				total *=c;
				c++;
			}while (c<=5);
		}
		case "/" -> {
			total = 0;
		}
		}
		System.out.printf("�� 1~5 ���� ���� ���� %d �Դϴ�", total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
