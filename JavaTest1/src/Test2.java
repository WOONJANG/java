
public class Test2 { // ���ǹ�

	public static void main(String[] args) {

		int score = 55;
		String msg = " ";
		
		if (score >= 90) {
			msg = "��� A �Դϴ�.";
		}
		else if (score <= 89 && score >= 70) {
			msg = "��� B �Դϴ�.";
		}
		else if (score <= 69 && score >= 50 ) {
			msg = "��� C�Դϴ�.";
		}
		else {
			msg = "�Ϲ� ����Դϴ�.";
		}
		System.out.println(msg);
	}
}
