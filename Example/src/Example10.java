import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�.
		 * ���� �׸��� ��ü 3�����̸�, ��� true�� ���� �Ǿ�߸� ���� ���μ����� ������ �˴ϴ�.
		 * ����ڿ��� ���� �Ǵ� ������ ������ �����ϴ�.
		 * "�����׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ��� ������(1) ���Ǿ���(2)
		 * 
		 * ���� �׸��߿� �Ѱ����� �������� ���� ���
		 * "��� ���� �ϼž߸� ���� �˴ϴ�. " ��� ��� �մϴ�.
		 * ��� ���� �Ͽ��� ���
		 * "ȸ�������� �Ϸ�Ǿ����ϴ�." ��� ����մϴ�.
		 * */
/*		byte re=0;//�ݺ���
		Scanner sc = new Scanner(System.in);
		
			System.out.println("���� �׸� �����Ͻðڽ��ϱ�? ������(1) ���� �� ��(2)");
			int check = sc.nextInt();
			for(re=1;re<=3;re++) {
			if (check==1) {
			}
			else if  (check != 1) {
				System.out.println("��� ���� �ϼž߸� ���� �˴ϴ�.");
				break;
			}
			}
*/
		
		Scanner sc = new Scanner(System.in);
		int w = 1; //�ݺ���
		int agree;
		boolean all_agree = false;
		do {
			System.out.println("���� �׸� �����Ͻðڽ��ϱ�?\n������(1) ���� �� ��(2)");
			agree = sc.nextInt();
			
			if (agree == 1 ) {
				all_agree = true;
			}
			else {
				all_agree = false;
				break;
			}
			w++;
		}while(w<=3);
	
		if(all_agree == false) {
			System.out.println("��� �����ϼž߸� ���� �˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		}
	}
}

