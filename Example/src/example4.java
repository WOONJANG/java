import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * �迭���� + �⺻(Ŭ����)�޼ҵ� ����
		 * ����ڰ� ���� ������ ���� �Է� �ϰ� �˴ϴ�.
		 * "�б� �л� �̸��� �Է��� �ּ���"
		 * ������ �� �迭 �����ʹ� 5���� �����Ǿ� ���ϴ�.
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ� ����Ͻÿ�.
		 * ���� ) ����ڰ� �Է��� ���� : hong kim park lee jang
		 * ��� - hong, kim, park, lee, jang
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String lists = "";
		for(int re=0; re<5; re++) {
		System.out.println("�б� �л� �̸��� �Է��� �ּ���");
		String input_name = sc.next();
		lists += input_name + " ";
		}
		cre_name(lists);
		sc.close();
	}
	

	public static void cre_name (String a) {
//		System.out.println(a);
		
	a = a.trim();
	String userin[] = a.split("\\s+");	//split : ���ڿ� �Ǵ� ���ڿ��� Ư�� ���� �������� �迭�� ���� �� �ִ� ��ɾ�.
		System.out.println(Arrays.toString(userin));
		
	}
}

	

