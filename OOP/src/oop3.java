
public class oop3 {
// Multi Tread : start, run, sleep, setstop
// ��Ƽ ������ : CPU�� �ھ�� ���谡 �ִ�.
	public static void main(String[] args) {
		// ������(Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����.
		// Multi Thread(��Ƽ ������) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���û��.
		// ������ -> ����
		// ��Ƽ ������ -> ���� + ��Ʃ�� + �����۾� (��Ƽ �׽�ŷ)
		Thread my = new mythread();	// �θ�޼ҵ� = �ڽ� �޼ҽ� ȣ��
		//����������� : �ڽ� �޼ҵ� = �ڽ� �޼ҵ�
		Thread my2 = new test2();
		my.start();
		my2.start();	//Thread �޼ҵ忡 �⺻ run�� �۵��ϱ� ���� start ��ɾ�.
		
		int w = 1;
		
		while (w <= 10) {
			System.out.println("����Ŭ���� : " + w);
			w++;
		}
	}
}
class test2 extends Thread {
	@Override
	public void run() {
		int w = 1;
		
		while (w <= 10) {
			System.out.println("�ܺ�Ŭ����2 : " + w);
			w++;
		}
	}
}

class mythread extends Thread {	// Thread : JVM�� �⺻���� ž�� �Ǿ� �ִ� �żҵ�, �ܵ����� ������� ����. (������ extends�� �Ͽ� ���)
	@Override
	public void run() {	// run : ��Ƽ�޼ҵ忡���� ��� �⺻ ���� �޼ҵ�
		
		int f;
		
		for (f=1; f<=10; f++) {
			System.out.println("�ܺ�Ŭ���� : " + f);
		}
	}
}

