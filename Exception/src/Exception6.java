
public class Exception6 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ���� ����
		 * �ܺ� Ŭ������ �����մϴ�.
		 * �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ�,
		 * Ȧ���� ��� "Ȧ���� �Դϴ�."�� �ٽ� ȸ�� �ǵ��� �մϴ�.
		 */
		

		try {
			
			int cal = 45*4+16+5+22*8;
			cul c1 = new cul();
			c1.cul_method(cal);
			String result = c1.cul_method(cal);
			System.out.println(result);
			
			
		}catch(Exception z) {
			if(z.getMessage() != null) {
			System.out.println(z.getMessage());
			}
		}
		}
	}
class cul{
	// �ڷ��� �޼ҵ忡�� return���� �߿�. ����, ����, Object�� ���� �ڷ����� ����Ǿ� ����.
	public String cul_method (int q) throws Exception {
		if(q % 2 == 0) {
			throw new Exception("(����)¦�� �Դϴ�. ��Ȯ�� ��");
//			Exception ex = new Exception("(����)¦�� �Դϴ�. ��Ȯ�� ��");
//			throw ex;
		}
		else {
			String msg = "Ȧ�� �Դϴ�.";
			return msg;
		}
	}
}



