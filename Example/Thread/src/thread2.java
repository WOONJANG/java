
public class thread2 {

	public static void main(String[] args) {
/*[응요문제]
  Thread를 이용하여 각 배열의 값을 내림차순으로 모두 더하여 결과를 출력하는
  응용프로그램을 제작하시오.
 */
		int data[]  = {6, 9, 10, 15, 3, 17};
		// 힌트 : 6이라는 배열 값이 인수값으로 Thread로 전달
		// 6+5+4+3+2+1 최종값은 출력
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

