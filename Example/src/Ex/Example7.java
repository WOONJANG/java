package Ex;

public class Example7 {
	public static void main(String[] args) {
	int data[] = {11,20,31,49,50};
	order od = new order();
	od.order_check(data); // setter�� ���� ����
	int result = od.order_recall(); // getter ���� ������
	System.out.println(result);	// ���� ������� ����
	}
}
abstract class abstr{	// �߻� Ŭ����
	// �ʵ� �ڷ��� ����
//	public abstract void order_check(); // ����
	abstract public void order_check(int adata[]); //setter
	public abstract int order_recall(); //getter 
}
class order extends abstr{
	//�ʵ� ���� : 1�� �̻��� �޼ҵ忡 ���� ����ؾ� �� ��츸 �ʵ忡 ����
	private int total = 0;
	@Override
	public void order_check(int[] adata) {	// �迭�� �ݺ� + ¦������ ��� ������
		int ea = adata.length;
		for(int f = 0; f < ea; f++) {
			if(adata[f] % 2 == 0) {
				this.total += adata[f];
			}
		}
//		this.order_recall(); // �ش� ������ ���� ������� ����.
	}
	@Override
	public int order_recall() {	// �������� ����
		return this.total;
	}
}