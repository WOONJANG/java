/*
 * Exception : try, catch�� �Բ� ����� ��. (����ó������)
 * - RuntimeException : Error �߻���, ����ó�� üũ�� ����. - Null, Class, Arraysize
 * - OtherException : ����ó�� üũ���� �����. 
 * Exception[����] 
 * ArithmeticException : 0���� ������ �߻�
 * NullPointerExc... : Null ��ü �����Ҷ�
 * ClassCastExc... : Ŭ������ ��ȯ
 * NumberFormatExc... : ���������� ��ȯ
 * ArrayIndexOutOfBoundExc... : �迭 ������ �ε��� ��ȣ ����  
 * IOException : ����� ���� �߻� 0
 * Exception : ��ü ����ó�� ��Ȳ 0
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//try : �ش� ���� int�� ���� (1)
			a = Integer.valueOf(b);	// error �߻� : a1�� �����ε�, ������ ��ȯ�� a��� ���ڷ� ���Ͽ� ���� (2)
		}catch(NumberFormatException e) {
			System.out.println(e);	// � �κп��� ������ �߻� (3)
		}
		finally {	// catch�� �۵��Ǿ�� �۵� ��.
			b = b.replaceAll("[a-z]", ""); // ������ ��ó�� (4)
			a = Integer.valueOf(b);	// �ٽ� ������ ���ۼ��ؼ� ��� (5)
//			System.out.println("test");
			System.out.println(b);		// ���� ����� ��� (6)
		}

	}

}
