
public class Class3 {
			// package�� ������� ���� ( default ��)
	public static void main(String[] args) {
		//�ڷ���(��������) ��ȯ
		//double -> int �� ��ȯ 
		double a = 137.5;
		int b = (int)a; 
		//int -> doudble �� ��ȯ
		int c = 35;
		double d = (double)c;
		System.out.println(d); //137.5
		
		//String -. int ��ȯ : ���ڿ��� ���ڷ� ��ȯ�� X
		String x = "35";
		String x2 = "156";
		int z = Integer.parseInt(x);  // parseInt (int ���� ����ϴ� ������� �����.
//		int z = Integer.valueOf(x); // �ӵ� ����. valueOf Ŭ�����ȿ� �޼ҵ�(�޼ҵ��Լ�)- > parseInt 
		int total = Integer.parseInt(x) + Integer.parseInt(x2); //�������� ���ڷ� ��ȯ�Ͽ� �������� ó����.
		System.out.println(total);
		
		String j = "123456789";
		String j2 = "1234567892";
//		int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		Long total2 = Long.parseLong(j) + Long.parseLong(j2); //Long ���� Long.paresLong ���
		double total3 = (double)total2; 
		System.out.println(total3);
		
		//����(char) -> ���� (String) : �⺻ ���ĸ� ����.
		char p = 'M';//char �� < '  ' > ���. �� ������ ����
		String p2 = String.valueOf(p);// =>>>>> char -> String �� ������ �� ������ ����. (ValueOf) ���.
		System.out.println(p2);
		
	}

}

