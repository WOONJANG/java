import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {

		/*2�� �迭, 2���迭�� ������ �����ϴ�.
		 * user_list : 	ȫ�浿 	�̼��� 	������ 	������ 	������� 	������ 	����屺
		 * user_point : 3000 		1000 		25000 	19800 	5750 			3630 		0
		 *
		 * "���α׷� ���۰� ���ÿ� ����Ʈ�� �˻��� ������ �Է��ϼ���"
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű������� �̿��Ͽ� ���� �� �ش� ������� ����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻� �� ������ �Է��ϼ���");
		String input = sc.next();
		
		point p = new point();
		p.pointsrc(input);
		sc.close();
		p= null;
		
		
	}
	

}

class point {
	public void pointsrc (String nm) {
		
		String inpoint [][] = { {"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
										{"3000", "1000", "25000", "19800", "5750", "3630", "0"}
										};
		int ea = inpoint.length; //2
		int ea2 = inpoint[0].length; //7
		
		int w = 0;
		while(w<ea2) {
			if(nm.equals(inpoint[0][w])) {
				System.out.printf("%s���� ����Ʈ�� %s �Դϴ�.",inpoint[0][w],inpoint[1][w]);
			}
			else {
				System.out.println("������ ��Ȯ�ϰ� �Է��ϼ���.");
				break;
			}
			w++;
		}
		

		}
	}
