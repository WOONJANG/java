package Ex;

public class Example7 {
	public static void main(String[] args) {
	int data[] = {11,20,31,49,50};
	order od = new order();
	od.order_check(data); // setter로 값을 보냄
	int result = od.order_recall(); // getter 값을 가져옴
	System.out.println(result);	// 최종 결과값이 적용
	}
}
abstract class abstr{	// 추상 클래스
	// 필드 자료형 변수
//	public abstract void order_check(); // 같다
	abstract public void order_check(int adata[]); //setter
	public abstract int order_recall(); //getter 
}
class order extends abstr{
	//필드 선언 : 1개 이상의 메소드에 값을 사용해야 할 경우만 필드에 선언
	private int total = 0;
	@Override
	public void order_check(int[] adata) {	// 배열을 반복 + 짝수값만 출력 최종값
		int ea = adata.length;
		for(int f = 0; f < ea; f++) {
			if(adata[f] % 2 == 0) {
				this.total += adata[f];
			}
		}
//		this.order_recall(); // 해당 사항은 절대 사용하지 않음.
	}
	@Override
	public int order_recall() {	// 최종값을 리턴
		return this.total;
	}
}