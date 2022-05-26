
public class While1 {

	public static void main(String[] args) {
		int a = 1; //while 시작값
		while(a < 11) { //while 범위값, 종료값
			//System.out.print(a + ", ");
			a++; //증감
		}
	
	int b  = 10;
	while (b >= 5) {
		//System.out.print(b + ", ");
		b--;
	}
	
	/*[응용문제]
	 * 다음 사항을 while 문으로 작성하시오. 
	 * " 22 ~ 16 까지  숫자를 출력하시오.
	 * */
	
	int c = 22;
	while (c>=16) {
	//	System.out.printf("%d ", c);
		c--;
	}
	
	int aa = 1;    // 초기값
	int bb = 10; // 종료값
	
	while(aa <= bb) { // 반복문 범위
		
	//	System.out.printf("%d ", aa);
	aa++;           //증가
	}
	
	/*[응용문제]
	 * 변수 두개를 이용해 값을 출력하시오. 
	 * 99 ~ 47
	 */

	int cc = 99;
	int dd = 47;
	
	while (cc >=47) {
		//System.out.print(cc + ", ");
		System.out.printf ("%d ", cc);
	cc--;
	}
	
	
	
	
	}

}