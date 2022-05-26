
public class If_for2 {

	public static void main(String[] args) {
		// 1~100까지 숫자 중 80 이상의 숫자만 출력
		
		int f;
		for(f=1;f<=100;f++) {
			if(f>=80) {
//				System.out.print(f + " ");
			}
		}

		
		// 200 ~ 300 부터 숫자 중 240 이하 숫자만 출력
		
		int a;
		for (a=200;a<=300;a++) {
			if(a<=240) {
//				System.out.print(a+ " ");
			}
		}
	
		// final
		
		final int aa = 2;
		int bb;

		for(bb=1; bb<=10; bb++) {
			if(bb%aa==0) {
			
//			System.out.printf("%d ",bb);
			}
		}
		
		/*[응용문제]
		 * 구구단중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자만 출력합니다.
		 */
		
		final int a1=2;
		int b1;
		int c1;
		for(b1=1;b1<10;b1++) {
			c1= b1*a1;
			if(c1>=10) {
//				System.out.printf("%d ",c1);
			}
		}
		
		
		/*[응용문제]
		 * 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		 * 18 36 54 72
		 */
		
		final int aaa=18;
		int bbb;
		
		for(bbb=1; bbb<=72; bbb++) {
			if(bbb%aaa == 0) {
//				System.out.print(bbb+ " ");
			} 
		}	
		

		int p;
		int total3;
		for (p=1; p<=9;p++) {
			total3 = p*9;
			if(p%2==0) {
//				System.out.print(total3 + " ");
			}
		}
	
		
		/*[응용문제]
		 * 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		 *1 ~ 20 사이 숫자
		 * 6 14 17 19 
		 */
		
		int qq;
		for(qq=1;qq<=20;qq++) {
			if(qq==6|| qq==14 || qq==17 || qq==19) {
				System.out.print(qq + " ");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
