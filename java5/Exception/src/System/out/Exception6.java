package System.out;

public class Exception6 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ���� ����
		 * �ܺ� Ŭ������ �����մϴ�.
		 * �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ�,
		 * Ȧ���� ��� "Ȧ���� �Դϴ�."�� �ٽ� ȸ�� �ǵ��� �մϴ�.
		 */
		
		/*[���빮��]
		 * ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88 }
		 * �ش� ������ ���� ���ڰ��� ��� �ǵ��� �� �迭 �Ͻÿ�.
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter)�� ����
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�Ͽ� �����մϴ�
		 * getter���� �ش� �迭�� return���� ���������մϴ�.
		 * ��, �ܺ�Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
		int result = 45*3+16+5+22*8;
		cal ca = new cal();
		try {
			ca.math(result);
			System.out.println(ca.math(result));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

class cal{
	public String math(int a) throws Exception {
		String msg = "";
		if(a % 2 == 0) {
			throw new Exception("¦��, ����ó��");
		}
		else {
			msg = "Ȧ�� �Դϴ�.";
			 return msg;
		}

	}
}
}

