import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*
		int a;
		int total = 0;
		for(a=1; a<=100; a++) {
			total += a; 
			}
		System.out.println(total);
		 */
		
		/*
		 * 1~100까지 곱한 결과값은?
		 */
		
		int f;
		// Biginteger : java에서 모든 무한의 값을 저장 할 수 있는 유일한 자료형.
		BigInteger b = new BigInteger("1"); //합계에 사용 할 자료형 변수 1을 최초값으로 설정 단, " " 무조건 적용해야한다.
		for (f=1; f<=100; f++) {
			 //multiply : 곱하기를 담당함.
			//add : 더하기 
			//subtract : 빼기 
			//divide : 나누기 
			b = b.multiply(BigInteger.valueOf(f));
		}		
			System.out.println(b);

	
	
	
	
	
	
	
	
		}
		
	}

