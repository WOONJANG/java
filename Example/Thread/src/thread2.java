
public class thread2 {

	public static void main(String[] args) {
/*[���乮��]
  Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ�
  �������α׷��� �����Ͻÿ�.
 */
		int data[]  = {6, 9, 10, 15, 3, 17};
		// ��Ʈ : 6�̶�� �迭 ���� �μ������� Thread�� ����
		// 6+5+4+3+2+1 �������� ���
		//[21, 38, ]
		
		cal ca = null;
		int f = 0;
		for (f = 0; f < data.length; f++) {
			ca = new cal(data[f]);
			ca.start();
		}
		
	}
}
class cal extends Thread {
	int a = 0;
	int total = 0;
	public cal (int aa) {
		this.a = aa;
	}
	@Override
	public void run() {
		for (int f = this.a; f > 0; f--) {
			this.total += f;
		}
		System.out.println(this.total);
		
	}
}

