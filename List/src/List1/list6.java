package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		// ���ڿ� ���� �迭 ���
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList(); // �ڷ����� ���� ����

		int w = 0;
		while(w < 5) {
			System.out.println("�����͸� �Է��� �ֽñ� �ٶ��ϴ�.");
			String user = sc.next();
			list.add(user);
			w++;
		}
		
		System.out.println(list);
		
		/* ���� �Է� ���׸� ��� ����*/
		int dw =0;
		int total = 0;
		do {
			try {
				Object k = list.get(dw);	// �迭 �ڷᰡ ���� + ���� ���·� ������ �Ǿ����� ���� Object �Ű� Ÿ������ �����մϴ�.
				int numbers = Integer.parseInt(k.toString());	// �ش� �Ű� Ÿ���� ����ȭ �Ͽ� ��aseInt�� �� ������
				total += numbers;
			}catch(Exception e) {	// �迭�� �Ű�Ÿ���� ���ڰ� �ƴҰ�� (���� ��Ȳ �߻�)
				
			}
			dw++;
		}while(dw < list.size());
//		Object a = list.get(0); // Object �ϳ��� ��ü�� �ν�
		System.out.printf("�Է��� ��� �迭�� ���� ���� %d �Դϴ�.",total);
		sc.close();
	}

}
