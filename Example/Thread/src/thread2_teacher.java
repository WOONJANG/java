// Thread�� ���� ���������� ��� X
public class thread2_teacher {

	public static void main(String[] args) {
/*[���乮��]
  Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ�
  �������α׷��� �����Ͻÿ�.
 */
		int data[]  = {6, 9, 10, 15, 3, 17};
		// ��Ʈ : 6�̶�� �迭 ���� �μ������� Thread�� ����
		// 6+5+4+3+2+1 �������� ���
		//[21, 38, ]
		plus_box pb = null;
		for(int f = 0; f < data.length; f++) {
			pb = new plus_box(data[f]);
			pb.start();
		}
		

	}
}

class plus_box extends Thread{
	int number = 0;
	public plus_box(int no) {	//Thread���� ���� ����ϱ� ���� �⺻ �޼ҵ�
		this.number = no;
	}
	int sum = 0;
	@Override
	public void run() {	// run�޼ҵ�� ���� �μ����� ������
		//�ݺ���
		for(int f = this.number; f > 0; f--) {
			sum += f;
		}
		System.out.println(sum);
	
	}
}
