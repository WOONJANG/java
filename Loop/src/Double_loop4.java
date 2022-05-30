
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 2*9 ... 3*9 큰반복문 for 작은반복문 do while문
		 * */
/*
		int f = 1;
		for (f=2;f<=3;f++) {
			int w= 1;
			do {
				System.out.println(f + " *"+ w +"=" + (f*w));
				w++;
			}while(w<=9);
		}
*/ //==============================================
		
		/*[응용문제]
		 * 구구단 7~9단 까지 
		 * 단, 각 구구단 곱셈값은 5까지만 나오도록 한다. 7*1~7*5 ... 9*5
		 * 큰 반복문 do while 작은 반복문 while
		 *  */
/*		
		int a =7;
		do {
			int b =1;
			while(b<=5) {
				System.out.println(a+"*"+b+"="+(a*b));
				b++;
			}
			a++;
		}while(a<=9);
*/ //==============================================
		
		/*[응용문제]
		 * 다음 결과값을 확인하여 코드를 작성합니다.
		 * 큰 for문 작은 while문.
		 * 1*1
		 * 2*2
		 * ...
		 * 9*9
		 */

		int a;
		int total;
		for (a=1; a<=9; a++) {
			int b=a;
			while(b<=a) {
				total = a*b;
//				System.out.printf("%d * %d = %d \n", a, b, total);
				b++;
			}
		}

	//==============================================	
	
/*[응용문제]
 * 다음 해당 결과값처럼 출력이 되도록 더블 반복문을 이용하시오.(큰 반복문 while 작은 반복문 do while)
 * 1+1=2
 * 2+1=3
 * 2+2=4
 * 3+1=4
 * 3+2=5
 * 3+3=6
 * 4+1=5
 * ...
 * 4+4=8
 */
	
		int aa=1;

		while (aa<=4) {
			int bb=1;
			do {
				System.out.printf("%d * %d = %d\n", aa, bb, (aa*bb));
				bb++;
			}while(bb<=aa);
			aa++;
		}
	

	
	
	
	
	
	}
	

}
