
public class Datatype {

	public static void main(String[] args) {
		
		//1234 ���� / 12.34 �Ǽ�
		
		String a = "1234"; // String�� ������ ���� ("") ���.
		System.out.println(a);
		/* ������ */
		byte b = 127; //byte : java���� ���� ���� ����, -128 ~ 127
		System.out.println(b);

		short c = 32767; //short : -32768 ~ 32767
		System.out.println(c);
		
		int d = 1000000; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long e = 999999; //long : 0�� 18��, �⺻ �޸� �Ҵ翡�� �߰� ����� ���� ���� ����. long ���� , ����Ʈ���� ���� L �ۼ�.
		System.out.println(e);
		/* ������ END */
		
		
		/* �Ǽ��� */
		
		float f = 3.5f; // float : �Ҽ��� ���� ���� ������ f �ۼ�. 3.40248xxxxxxxxx... ~ +38
		System.out.println(f);
		
		double g = 44.53232;// double : �Ҽ��� ���� ���� d�ۼ�(���ص� ��� ����) 1.784xxxxxxxx... ~ +308
		System.out.println(g);
		/* �Ǽ��� END */
		
		
		
		
	}

}
