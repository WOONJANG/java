
public class If3 {

	public static void main(String[] args) {

		// bloolean : true or false�� ����.
		boolean ck = true;
		if (ck == true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		}

		else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}

		String inputid, inputpw;
		inputid = "lee";
		inputpw = "a1234";
		
		// && : �Ѱ��� ���� �̻� ��� �����ϴ� ���. (and)
		// || : �Ѱ��� ���� �̻󿡼� �ϳ��� ���� ���. (or)
		if (inputid == "park" && inputpw == "a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		}

		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
		}

		if (inputid == "park" || inputpw =="kim") {
		// if (inputid =="park || inputpw =="a1234") { �� �����߿� �Ѱ����ε� ���� ��� 	
		System.out.println("ȸ���� Ȯ�εǾ����ϴ�");
		}
		
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
		
		
		
		
		
		
		
	}

}
