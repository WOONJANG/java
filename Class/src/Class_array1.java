import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		// Ŭ���� + �޼ҵ� + �迭 
		String users[] = {"ȫ�浿","�̼���","������"};
//		arrays.lists(users);
		/*[���빮��]
		 * ����ڰ� �ڽ��� �̸��� �Է��մϴ�.
		 * ����� �̸��� �ش� class�� ������ ��ϵ� ����� ����
		 * �̰����� ����� ������ Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * ��ϵ� ������� ��� "������ �Ǿ��ֽ��ϴ�." ���
		 * �̵���� ��� "�̰����� �Դϴ�." ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String input_name = sc.next();
		arrays.lists(users, input_name);
		sc.close();

		
		
		
		
	}
}
class arrays {
	public static void lists (String a[],String data) {
		//System.out.println(Arrays.toString(a));
		String msg = " "; // �޼ҵ�� �ش� ���� �����Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����ؾ��Ѵ�. 
		//String = "  " or null / int  0���� ǥ��
//		int datas = 0;
		int f;
		int ea = a.length; //3
		boolean ck = false;
		for(f=0; f<ea; f++) {
			if (a.equals(a[f])) {
				
				msg = "������ �Ǿ� �ֽ��ϴ�.";
				ck = true;
			}
		}
		if (ck==false) {
			msg = "�̰����� �Դϴ�.";
		}

		arrays ar = new arrays();
		ar.message(msg);
		}
	public void message(String m) {
		System.out.println(m);
	}
}