
public class Class3 {

	public static void main(String[] args) {
		
		apink m = new apink();
		m.f_method("�̺���");
		apink.cafe LA = m.new cafe();
		LA.call();
	}

}

abstract class father{	// �߻� class (abstract�� ����ϸ� �߻�)
	public String u_name;	// ���� ���� (abstract�� �����Ƿ� �߻��� �ƴ�)
	public abstract void f_method(String name);	// �߻� method
}	
class apink extends father{
	
	@Override
	public void f_method(String name) {	// �߻� method�� ���� method�� ��ȯ
		this.u_name = name;	// �߻� method�� �ִ� ���������� ���� �̰�
	}
	
	class cafe {
		String msg = apink.this.u_name;	// �θ� class�� �ִ� ���������� �ڽ� class ���������� �̰�
		public void call() {
			String msg2 = this.msg + "�� ¯ ! !";
			System.out.println(msg2);
		}
	}
}