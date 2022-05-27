
public class Example6 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 1~10 까지 순차적으로 적용하는 반복문이 있습니다.
		 * 단, 1~5까지는 모두 곱하고 6~10까지는 모든 값을 더합니다.
		 * 해당 두개의 값을 비교하여 더한값이 큰지, 곱한값이 큰지 결과로 출력하시오.
		 */
		
		/*int a=1;
		int totalp=0;
		int totalm=1;
		
		for (a=1; a<=10; a++) {
			if(a<=5) {
				totalm *= a;
			}
			else{
				if (a>=6) {
					totalp += a;
				}
			}
		}
		System.out.printf("1~5 까지 곱한값 : %d\n6~10 까지 더한값 : %d\n", totalm, totalp);

		if(totalp<totalm) {
			System.out.println("1~5 까지 곱한값이 큽니다");
		}
		else if (totalp > totalm) {
			System.out.println("6~10 까지 더한값이 큽니다");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		*/
		
		int w = 1;
		int total1 = 0; // +
		int total2 = 1; // *
		while(w<=10) {
			if(w<=5) {
				total2 *= w;
			}
			else {
				total1 += w;
			}
			w++;
		}
		if (total1 < total2) {
			System.out.println("곱한값이 더 크다.");
		}
		else if(total2 > total1) {
			System.out.println("더한값이 더 크다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		
		
		
		
		
	}
}






