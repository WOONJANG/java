
public class For1 {

	public static void main(String[] args) {
		// 반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법.
	// for (  초기값  ;   범위 ; 증감)	
		
		int z = 1;
		//z++; // +1 증가 : 출력 후 +1 증가
		//z--;  // -1 감소 : 출력 후 -1 감소
		//++z; // +1 증가 : +1 증가 후 출력
		//--z; // -1 감소 : -1 감소 후 출력
		//System.out.println(z);
		
		
		
		for ( int a= 0; a < 10; a++ ) { // for (  초기값  ;   범위 ; 증감)
			//System.out.println(a);
		}
		
		int b;
		for (b=5; b<11; b++) {
			//System.out.println(b);
		}

		int c;
		for(c=10; c>3; c--) { //주의 사항 : c<3  0~음수까지 전부출력되는 상황이 발생.
			//System.out.println(c);
		}
		
		/*[응용문제]
		 * 20 ~ 27 출력 하시오.*/
		
		int d;
		for (d=20; d<28; d++) {
			//System.out.printf("%d", d);
		}
		/*[응용문제]
		 * 39 ~ 21 출력 하시오.*/
		
		short e;
		for (e=39; e>20;e--) {
			//System.out.printf("%d ", e);
		}
		
		// 1 ~ 10 출력 
	
		int aa;
		int bb = 10;
		
		for (aa=1; aa<=bb; aa++) {
			//System.out.printf("%d \n",aa);
		}
		/*[응용문제]
		 * 변수 2개를 이용하여 다음 데이터를 출력하시오
		 * 55 ~ 4 출력*/

		int cc;
		int dd = 4;
		
		for (cc=55; cc>=dd; cc--) {
			//System.out.printf("%d ", cc);
		}
		
		
		
		
		
	}

}
