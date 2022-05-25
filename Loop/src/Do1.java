
public class Do1 {

	public static void main(String... args) {
		
		int a = 1; //초기값
		do {
//			System.out.printf("%d, ",a); //출력값
			a++; //증감
		} while(a<11) ; //범위값, 종료값
		
		/*[응용문제]
		 * 5 ~ 0 까지 출력 단, do ~while문 사용.
		 * */

		int aa = 5;
		do {
//			System.out.print(aa + " ");
			aa--;
		} while (aa>=0);
		
		int b = 50; //기초값
		int c = 60; // 종료값

		do {
			System.out.print(b +" ");
			b++;
		}while(b <= c);
		
		
		
		
		
	}

}
