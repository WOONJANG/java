
public class oop4 {
	//�߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
//		System.out.println(ab.c());
		ab.ab_a();

	}

}

abstract class ab_1{	// �߻� Ŭ����(�ܺο��� �ε尡 ���� �ȵ�) - ��ü ������ �ȵ�.
	
	public void ab_a () {	// free
		
	}
	public void ab_a(int a) {	// free (�μ��� �޴� �߻� �޼ҵ�) - ����ص� �ǰ� ���ص� ��
		
	}
	public abstract void ab_c();	// free ���� ������ �߻� �޼ҵ�
	public abstract int b();	// �߻� �޼ҵ� - ��ü ���� �ȵ�. 
}
	
class ab_2 extends ab_1{
	@Override
	public void ab_c() {
		
	}
	
	@Override
	public void ab_a(int a) { 
		System.out.println(this.c());
	
	}
	
	@Override
	public void ab_a () {
	}
	
	@Override
	public int b() {	// ���� �޼ҵ� + �߻� �޼ҵ�
		return 55;
	}
	
	public int c() {
		return 99;
	}
}

