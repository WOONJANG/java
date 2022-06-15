
public class Time1 {

	public static void main(String[] args) {
		/*try-catch문 : 예외처리기능 문법*/
		int re = 1;
		do {
			try {	// 예외 발생 할 코드를 적용
				Thread.sleep(1000); // 1000 = 1초, 500 = 0.5초
				// Thread.sleep : 일시정지 상태
			}
			catch(/*Interrupted*/Exception d){
			// /*Interrupted*/Exception : 해당 예외 발생이 되었을 경우 처리하기 위한 문법
			}
			System.out.println(re);
			re++;
		}while(re <=10);
	}
}
