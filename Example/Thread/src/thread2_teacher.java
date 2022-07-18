// Thread는 절대 순차적으로 출력 X
public class thread2_teacher {

	public static void main(String[] args) {
/*[응요문제]
  Thread를 이용하여 각 배열의 값을 내림차순으로 모두 더하여 결과를 출력하는
  응용프로그램을 제작하시오.
 */
		int data[]  = {6, 9, 10, 15, 3, 17};
		// 힌트 : 6이라는 배열 값이 인수값으로 Thread로 전달
		// 6+5+4+3+2+1 최종값은 출력
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
	public plus_box(int no) {	//Thread에서 값을 사용하기 위한 기본 메소드
		this.number = no;
	}
	int sum = 0;
	@Override
	public void run() {	// run메소드는 절대 인수값을 못받음
		//반복문
		for(int f = this.number; f > 0; f--) {
			sum += f;
		}
		System.out.println(sum);
	
	}
}
