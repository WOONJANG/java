
public class For1 {

	public static void main(String[] args) {
//더블 반복문
		/* 구구단 2단 ~ 3단까지 */
/*
		int f, ff; //반복문에 사용 할 변수 선언을 미리 함.
		
		for(f=2;f<=3;f++) { //큰 for문 2~3까지만 반복.
			
			for(ff=1; ff<=9; ff++) { //작은 반복문 1~9까지 반복.
				//해당 작은 반복문이 작동할 때 마다 출력을 사용함
				System.out.printf("%d * %d = %d\n", f, ff, f*ff);
			}
		}
		*/
		
		/*[응용문제]
		 * 구구단 5단 ~ 7단까지 출력을 하되, 4까지만 연속적으로 나오는 수식구를 출력하시오
		 * 해당 결과값의 총 합계를 출력하세요.*/
		
		int a, aa;
		int total = 0;
		
		for (a=5; a<=7; a++) {
			for(aa=1; aa<=4; aa++) {
				//System.out.printf("%d * %d = %d\n", a, aa, a*aa);
			total +=aa*a;
			}
		}
		//System.out.printf("총 합계 : %d",total);
		//==//
		
		
	
		
		
		
		
		
	}

}
