import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 상품 가격은 42000 입니다.
			사용자가 해당 상품 갯수를 입력하게 됩니다.
			해당 상품 가격에 맞는 갯수 만큼 곱하여 최종 결제 금액을 출력.
			extends 사용.
			단, 42000은 절대 숫자가 바뀌면 안된다.	 또한 최대 구매 가능 갯수는 5개.	 
			최종 결과 값은 main method에서 출력.
		 */
		basket2 b2 = new basket2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 상품을 몇개 구매 하시겠습니까?");
		int ea = sc.nextInt(); // 사용자 입력
		b2.basket_1(ea); // 내보내기
		b2.basket_2(); // 출력
		sc.close(); // 스캐너 종료
	}

}
class basket1{
	private final int item = 42000;
	protected int a;
	protected int b;
	
	public void basket_1(int goods_ea) { // 받기
		this.a = goods_ea;
		this.b = this.a * item;
	}
}
class basket2 extends basket1{
	public void basket_2() {
		
		if (this.a > 5 || this.a < 0) {
			System.out.println("해당 상품은 1개 ~ 5개 까지만 구매 가능합니다.");
			System.exit(0);
		}
		
		System.out.printf("주문한 상품의 갯수 %d개, 총 %d원 입니다.", a, this.b);
		System.exit(0);
	}
}