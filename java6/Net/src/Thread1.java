// Thread �����
public class Thread1 {

	public static void main(String[] args) {

		/* extends Thread */
//		int w =0;
//		while (w< 6) {
//			box b = new box(w);
//			Thread t = new Thread(b);
//			t.start();
//			w++;
//		}
		
		/* interface Runnable Thread */
		for (int f = 0; f < 10; f++) {
		box2 b2 = new box2(f);
		// ������ �޼ҵ带 ȣ���Ͽ� �ش� Ŭ������ CPU �Ѱ��� �Ҵ�
		Thread t2 = new Thread(b2);	// ������ ���� ( ������� �۵���ų Ŭ������)
		t2.start();	// run �޼ҵ带 �۵���Ű������ ��ɾ�
		}
	}
}

class box extends Thread {

	int no = 0;

	public box(int a) {
		this.no = a;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.no);
	}
}

class box2 implements Runnable{
	int no = 0;
	public box2(int b) {
		this.no = b;
	}
	@Override
	public void run() {	// Thread�� �⺻ �޼ҵ�
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.no);
		
	}
}
