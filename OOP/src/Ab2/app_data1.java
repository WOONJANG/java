package Ab2;

public interface app_data1 {
	String a = null;	// �ʵ忡 �ڷ����� �����ִ� ����  ����� ��� ���� ��ü�� �ȵ�. (������ �� ����)
	int b = 0;
	public void user_join(); // ���� ������ �޼ҵ�� this ��� �� ��.
	default void aaa() {	// default���� this. ����� ������ (���� ���� ��쿡��)
		System.out.println(this.a);
	}
}
