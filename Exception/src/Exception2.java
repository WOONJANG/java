
public class Exception2 {

	public static void main(String[] args) {
		
		try {
//			test();  // �޼ҵ� ȣ�� ��ü. error Exception�� ���谡 ����.
			
			Exception2 ex2 = new Exception2();

			String a = "ȫ�浿2";
			ex2.test(a);
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	public void test(String b) throws Exception, NumberFormatException {	
		// throws�� main method���� ����ó�� ���� �ش� method�� ȣ�� �� ��츦 �������� ���.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;		//	�ڵ� �� �ؿ� ����� �ϸ� throws�� return�� ����� ������ ������ ����.
		// ����ó�� ����� ���� ���� main method�� �ٽ� return��Ŵ
		
	}
}
