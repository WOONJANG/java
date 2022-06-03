
public class example3 {

	public static void main(String[] args) {

		/*[응용문제]
		 * 배열 + 기본(클래스)메소드 문제
		 * product : 수박 참외 사과 배 딸기 키위 바나나 망고
		 * money : 35000 8000 4000 5500 3800 4400 11000 18900
		 * 장바구니에 해당 상품을 모두 담았습니다.
		 * 단, 그 중 사과와 바나나는 제외하고 총 결제 금액을 출력하시오.
		 * 75600
		 */
		
		String product[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		int money[] = {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
		datas(product, money);
		
	}
	public static void datas (String a[], int b[]) {
/*//for문
		int re;
		int ea = a.length; //과일 갯수
		int total = 0;
		for (re=0;re<a.length;re++) {
			if (!a[re].equals("사과") && !a[re].equals("바나나")) { // 불러온 배열[인덱스]
				total += b[re];
			}
		}
		System.out.println("총합계 : " + total);
 */
		//do while 문
		int re = 0;
		int ea = a.length;
		int total = 0;
		do {
			if(!a[re].equals("사과") && !a[re].equals("바나나")) {
				total += b[re];
			}
			re++;
		}while(re<a.length);
		System.out.println(total);
	}	
}
