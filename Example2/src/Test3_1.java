
public class Test3_1 {

	public static void main(String[] args) {
		
		String a = "ȫ�浿1";
		String b = "hong11";
		String c = "hong@email.com";
		
		//&& ������ ������ ���� �����ؾ� ��.
		if((a == "ȫ�浿" && b == "hong") || (a == "ȫ�浿" && c == "hong@email.com")) {
//			System.out.println("�ش� ����� ������ Ȯ�� �Ͽ����ϴ�.");
		}
		else {
//			System.out.println("�ش� ����� ������ Ȯ���� �� �����ϴ�.");
		}
		// || ������ �ϳ��� ������ ����.
		if (a=="ȫ�浿"|| b=="hong" || c=="hong@email.com") {
			System.out.println("�ش� ����� ������ Ȯ�� �Ͽ����ϴ�.");
		}
		else {
			System.out.println("�ش� ����� ������ Ȯ���� �� �����ϴ�.");
		}
		
		int no = 24;
		if(no%2==0 && no%3 ==0) {
			System.out.println("2�� ��� �� 3�� ��� ��� ���մϴ�.");
		}
		else {
			System.out.println("�ش簪�� �����տ� ���� ���� �ʽ��ϴ�.");
		}
	}
}
