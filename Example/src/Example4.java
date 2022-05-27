
public class Example4 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 다음 결과값에 맞춰서 코드가 출력 되도록 하시오.
		 * 해당 코드는 for문으로 작성합니다.
		 * 45 35 25 15 10
		 */
		int a;
		int b = 5;
		int c;
		for(a=9; a>1; a--) {
			c= a*b;
			if(a%2==1 || c==10) { //if(a%2==1 || a==2) {
			// if( a !=1){
				System.out.printf("%d ", c);
			}
		//}
			
			}
		}
	}


