/* �θ�class �� �ڽ�(����)class ����*/
public class Class1 {

	public static void main(String[] args) {
		/* �θ� �ν��Ͻ��� ������ ���� ������ �ڽ� class�� ���� �������� ���� */
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child();	// �θ� class.�ڽ� class �̸� = �θ�class��.new �ڽ�class (�ν��Ͻ��� ����)
		pc.c_box();
	}
}

class parents {	// �θ� class
	String a = "ȫ�浿";	// �θ� �ʵ忡 �ִ� ��������
	String b;
	class child {	// �ڽ� class
		int a = 20;
		
		public void c_box () {	// �ڽ� method
			double c = 10.5;	// �ڽ� method ���� ��������
			System.out.println(c);	// 10.5
			System.out.println(this.a);	// 20 // �ڽ� class ���� ��������
			System.out.println(parents.this.a);	// ȫ�浿 // �ڽ�class�� ������a�� ������ �׳� a �� �θ�Ŭ���� a(ȫ�浿) ���
			System.out.println(parents.this.b);	// �̼���	p_box this.b = a ����
		}
	}
	public void p_box() {	// �θ� method
		String a = "�̼���";	// p_box�� �ִ� �������� ����
		this.b = a;
		System.out.println(this.a);	// ȫ�浿
		System.out.println(a);	// �̼���
	}
}