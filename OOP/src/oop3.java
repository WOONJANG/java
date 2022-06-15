
public class oop3 {
// Multi Tread : start, run, sleep, setstop
// 멀티 쓰레드 : CPU의 코어와 관계가 있다.
	public static void main(String[] args) {
		// 쓰레드(Thread) : 프로세스 내부에서 독립적으로 실행되는 작업을 말함.
		// Multi Thread(멀티 쓰레드) : 프로세서 내부에서 두가지 이상의 작업을 동시사용.
		// 쓰레드 -> 음악
		// 멀티 쓰레드 -> 음악 + 유튜브 + 문서작업 (멀티 테스킹)
		Thread my = new mythread();	// 부모메소드 = 자식 메소스 호출
		//기존사용형태 : 자식 메소드 = 자식 메소드
		Thread my2 = new test2();
		my.start();
		my2.start();	//Thread 메소드에 기본 run을 작동하기 위한 start 명령어.
		
		int w = 1;
		
		while (w <= 10) {
			System.out.println("내부클래스 : " + w);
			w++;
		}
	}
}
class test2 extends Thread {
	@Override
	public void run() {
		int w = 1;
		
		while (w <= 10) {
			System.out.println("외부클래스2 : " + w);
			w++;
		}
	}
}

class mythread extends Thread {	// Thread : JVM에 기본으로 탑재 되어 있는 매소드, 단독으로 사용하지 않음. (무조건 extends를 하여 사용)
	@Override
	public void run() {	// run : 멀티메소드에서만 사용 기본 실행 메소드
		
		int f;
		
		for (f=1; f<=10; f++) {
			System.out.println("외부클래스 : " + f);
		}
	}
}

