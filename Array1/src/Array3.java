import java.util.Arrays; 
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		//5 10 15 20 25 30 35
		
//		int data [] = { 5, 10, 15, 20, 25, 30, 35 };
		/*
		 * for each���� ����� ������ index ��ȣ�� �ʿ���� ����� ���. �ܼ��� �迭���� ��� 
		 * for~do~while�� ����� ������ index ��ȣ�� �ʿ��� �� ���.
		 */
//		for(int f : data) { //int f�� ���������� �迭���� �޾Ƽ� �����Ŵ.
//			if(f%2==0) {
//			System.out.println(f);
//			}
//		}
		
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
/*		
		Scanner sc = new Scanner(System.in);
		String menu [] = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
		String bill [] = new String[4];
		
		int re=0;
		
		
		for (String a : menu) {
			System.out.println("�ֹ� �ϰ��� �ϴ� ������ �Է����ּ���");
			String order = sc.next();
			if(a.equals(order)) {
				bill[re]+=a;
				re++;
			}
			else if(order.equals("�ֹ�����")) {
				break;
			}

		}
		int totalbill = bill.length;
		System.out.println(Arrays.toString(bill));
*/
//============================================================================================
		Scanner sc = new Scanner(System.in);
		String menus [] = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
		String user;
		String user_menu [] = new String[4];
		int ct = 0;
		for(String f : menus) {
//			Scanner�� �ݺ��� �ȿ� ����� loop�� ������ �ݺ������� ����
//			����ڰ� �Է��� ������ �ݺ��� ������ŭ ����ϴ� ����.
			System.out.println("�޴��� �������ּ���.");
			user = sc.next();
			if(user.equals("�ֹ�����")) {
				break;
			}
			else {
				for(String ff : menus) {
					if(user.equals(ff)) {
						user_menu[ct] = ff;
 						ct++;
					}
				}
			}
		}
		System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�." + Arrays.toString(user_menu));			
		sc.close();
			
		}
		
		
		
		
		}



