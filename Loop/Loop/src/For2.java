
public class For2 {

	public static void main(String[] args) {
		
		int a; //for문 초기값
		int b=2; //for문 종료값
		int c; //연산한 결과값 사용

		for (a=1; a<=9; a++) {
			c= b*a; //산술 연산 작업
			//System.out.printf("%d ",c);
		}
			/*[응용문제]
			 *  다음 결과값을 보고 코드를 작성하시오.
			 [ 45, 40, 35, 30, 25, 20,*/
		
		int d;
		int e = 5;
		int f;
		
		for (d=9; d>=4; d--) {
			f = d * e ;
		//System.out.printf("%d, ", f);
		}
		
		/*[응용문제]
		 *  다음 결과값을 보고 코드를 작성하시오.
		 [ 11, 22, 33, 44, 55, 66, 77, 88, 99, ]*/
		
		int aa;
		int bb = 11;
		int cc;
		int dd;
		
		for (aa=1; aa<=9; aa++) {
			cc= bb*aa;
		System.out.print(cc + ", ");
		System.out.print(aa * bb + ", ");
			dd= (10*aa)+aa;
			System.out.println(dd);
		}
		
		
		
		
		
		
		
		
	}

}
