
public class Do_plus {

	public static void main(String[] args) {
	
		/*[응용문제]
		 * do ~ while문
		 * 30 ~ 35까지 합계치 출력*/
	
		int st = 30;
		int bn = 0;
		do {
			bn += st; 
			st++;
		}while(st<36);
//	System.out.println(bn);
	
	/*[응용문제]
	 * 합계숫자 189가 있습니다 단, 1~10까지 합계치와 현재 189를 뺀 총 합계를 구하시오*/
		
		int a = 189;
		int b = 1;
		int c = 0;
		
		do {
			c += b;
			b++;
		}while (b<=10);
		
//		System.out.println(a-c);
		//==//
		int ww= 1;
		int total = 189;
		
		do {
			total -=ww;
			ww++;
		}while (ww<11);
		
		System.out.println("결과값 : " + total);
	
	
	}

}
