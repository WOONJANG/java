package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * ����ڰ� ���� �ݾ��� �Է��մϴ�.
		 * �ش� ���� �ݾ� Ƚ���� �� ������ �Դϴ�.
		 * 0 ~ n���� �Է� 
		 * �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��� ��Ű�ÿ�.
		 * ���� )
		 * �Ա��� �ݾ��� ��������
		 * 100 100 100 100 100 100 100 100 
		 * ��� ) 
		 * �� �Ա� �ݾ��� 800�� �Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> in = new LinkedList<>(); // ��迭
		String money;
		int total = 0;
		
		while (true) {
			System.out.println("�Ա��� �ݾ��� ��������.");
			money = sc.next();
			try {
				int totalmoney = Integer.parseInt(money);	// totalmoney = �Է� ���� ���� ���ڷ� ��ȯ
				total += totalmoney;	// total += ���ڷ� ��ȯ�� �Է°�
				in.add(totalmoney);
				int chance = in.size(); // ��ȸ = ��������� �迭 ���� 
				if(chance >= 8) {	// �Է� 8ȸ�� ����
					break;
				}
			}catch(Exception e) {
				System.out.println("���ڸ� �Է�");
			}
		}
		System.out.printf("�� �Ա� �ݾ��� %d�� �Դϴ�", total);
		sc.close();
	}

}
