
public class Array2 {

	public static void main(String[] args) {
		
		/* hong
		 * kim
		 * park
		 * lee
		 * jang
		 * jung
		 *  */

//		String fn[] = {"hong", "kim", "park", "lee", "jang", "jung"};
//		System.out.println(fn[4]);
//		int word = fn[4].length();
//		System.out.println(word);
		/*[응용문제]
		 * 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 3단어 이상만 출력시키시오. 
		 */
/*
		int member = fn.length;
		int w=0;
		int word; // 각각의 배열 데이터의 문자 갯수파악
		do {
			word = fn[w].length(); // 문자갯수파악
			if(word>3) { // 세단어 이상의 데이터만 출력
				System.out.println(fn[w]);
			}
			w++;
		}while(w<member);
*/
		
		/*[응용문제]
		 * 배열 데이터는 다음과 같다
		 * 15 60 11 14 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오.
		 */
		
		int num[] = {15, 60, 11, 14, 27}; //배열
		int p = num.length; //배열 갯수 파악
		int re=0; //반복
		int total = 0; //합계
		
		//for문
		for(re=0;re<p;re++) {
			total += num[re];
		}
		System.out.println(total);
		
		//while문
		while (re<p) {
			total += num[re];
			re++;
		}
		System.out.println(total);
		
		//do while문
		do {
			total += num[re];
			re++;
		} while (re<p);
			System.out.println(total);
			
		
		
		
		
	}

}
