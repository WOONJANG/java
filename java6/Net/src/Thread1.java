// Thread 사용방식
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
		// 쓰레드 메소드를 호출하여 해당 클래스에 CPU 한개를 할당
		Thread t2 = new Thread(b2);	// 쓰레드 선언 ( 쓰레드로 작동시킬 클래스명)
		t2.start();	// run 메소드를 작동시키기위한 명령어
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
	public void run() {	// Thread의 기본 메소드
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.no);
		
	}
}
