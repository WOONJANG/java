package swing1;

public class swing1 {

	public static void main(String[] args) {
		// wrapper class (BOX ����)
		// float, char, byte, long, short (�⺻)
		// wrapper class : Byte, Integer, Long, Double (ù�� �빮��) 
		
		Integer a = new Integer(20); // new Integer (�ڽ�)
		int b = new Integer(20); // ��ڽ� 
		if(a.equals(b)) { // �� �� new Integer �� ���(�� �� �ڽ� ������ ��) equals�� ��� .
			System.out.println(a+b);
		}
		
		Integer no1 = 10; // ��ڽ�
		Integer no = new Integer(99);	// �ڽ�
		// int aa = no; // ��ڽ�(�ڵ�)
		Integer bb = no.intValue(); // ��ڽ� // �ڽ� ���¿� �ִ� ���ڰ�
		System.out.println(bb);
		
		/* �ڽ̰� �ڽ��� ���� ���� equals�� ����ؾ��ϸ� �񱳰� �̷���� */
	}

}
