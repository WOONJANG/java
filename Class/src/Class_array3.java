import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {

		/*[���빮��]
		 * ���� ���� �迭 ������ ���� �ִ�.
		 * a1 = {"ȫ�浿, "�̼���", "������", "������", "������"}
		 * a2 = {"100", "80", "39", "60", "55"}
		 * "�˻� �ϰ��� �ϴ� �̸��� �����ּ���" ���
		 * �̼��� �˻��� , �̼��Ŵ��� 80�� �Դϴ�.
		 * ��� ��µǾ���մϴ�.
		 *
		 */
		String a1[] = {"ȫ�浿", "�̼���", "������", "������", "������"};
		String a2[] = {"100", "80", "39", "60", "55"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻� �ϰ��� �ϴ� �̸��� �����ּ���.");
		String input = sc.next();
		
		score s = new score();
		s.search(a1, a2, input);
//score .search(a,  b,   c)
		sc.close();
		
	}

}

class score{
	public void search (String a[], String b[], String c) {

//		System.out.println(Arrays.toString());
	}
}

//input +"����"+  +"�� �Դϴ�."