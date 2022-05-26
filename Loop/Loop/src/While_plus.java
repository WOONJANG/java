
public class While_plus {

	public static void main(String[] args) {
		
		/* 5 ~ 10까지 더한 합계 수를 출력 */
		
		int s = 5; // 초기값
		int t = 0; // 합계치를 누적시키기 위한 변수값
		
		while (s < 11) {
			// t= t+s;
			t += s;
			s++;
		}
//			System.out.printf("합계 : %d",t);
	
	
			/*[응용문제]
			 * 3 ~ 8까지 곱한 총 합계 수를 출력하시오.*/
			
			int st = 3;
			int bn = 1; //곱하기 합계를 설정시 "1" 기본값으로 설정
			
			while (st<=8) {
				bn *= st;
				st++;
			}
			//System.out.println(bn);
	
				
	
	
	
	}

}
