import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		//5 10 15 20 25 30 35
		
		int data [] = { 5, 10, 15, 20, 25, 30, 35 };
		/*
		 * for each���� ����� ������ index ��ȣ�� �ʿ���� ����� ���. �ܼ��� �迭���� ��� 
		 * for~do~while�� ����� ������ index ��ȣ�� �ʿ��� �� ���.
		 */
		for(int f : data) { //int f�� ���������� �迭���� �޾Ƽ� �����Ŵ.
			if(f%2==0) {
//			System.out.println(f);
			}
		}
		
/*
		String pay[] = { "�������Ա�", "�ſ�ī��", "�޴�������", "��ǰ��", "����" };
		Scanner sc =new Scanner(System.in);
		
		System.out.println("�����ϰ����ϴ� ���¸� �������ּ���.");
		String pm = sc.next();
		for (String z : pay) { //�迭data�� ���� ���� �̹Ƿ� �޴� �������� ���� �������� ����ؾ� �Ѵ�.
			if(pm.equals(z)) {
				if(z.equals("�޴�������")) {
//					System.out.println("���� �ý����������� �ش� ������ ����ϽǼ� �����ϴ�.");
				}
				else{
//					System.out.println(pm+"�� ���� ����˴ϴ�.");
					}
			}
		}
		sc.close();
		//===============================================================================
*/		
		/*[���빮��]
		 * { "�ܹ���", "����", "ġŲ", "Ŀ��" }
		 * "�ֹ� �ϰ��� �ϴ� ������ �������ּ���"
		 * �ش� ������ �� 4���� ����� �˴ϴ�.
		 * ��, "�ֹ� ����" ��� �Է½� , ��� �ֹ� ����Ǹ�,
		 * �ֹ� ������ ���.
		 */
		String orders [] = new String [4];
		String menu[] = {"�ܹ���", "����", "ġŲ", "Ŀ��" }; //�迭
		int re;

		Scanner sc = new Scanner(System.in);
		for(re=1;re<=4;re++) {
		System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���?");
		String order = sc.next();
			
	 
				if(order.equals(menu)) {
					menu[re] += orders;
				}
				
				else if (order.equals("�ֹ�����")) {
					break;
				}

				
			
		}
		System.out.println(Arrays.toString(orders));
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
