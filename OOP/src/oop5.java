
public class oop5 {
	// abstract ���� �⺻���� �μ������� �߻� method ���� �ѱ�.
	public static void main(String[] args) {
		load1 ld1 = new load1();
		ld1.datain(20, 30);
		ld1.call();
		
		load2 ld2 = new load2();
		ld2.datain(20, 30);
		ld2.call();
	}

}

abstract class abclass {
	
	int data1, data2;
	
	public void datain(int d1, int d2) {	// �⺻ �߻� method�̸�, ��� data�� �μ��� �޾Ƽ� this.�� ó��
		// ��, �ܺ� class���� �������� ����.
		this.data1 = d1;
		this.data2 = d2;
	}
	
	public abstract void plus();	// ������ class�� �⺻���� plus method�� ������ ������
	
	public void call () {
		this.plus();
	}
	
}
class load1 extends abclass{
	
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
}

class load2 extends abclass{
		
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();
	}
	public void avg() {
		System.out.println("ȫ�浿");
	}
}
