package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 
		 * 사용자가 직접 숫자를 입력 받습니다.
		 * 단, 사용자가 문자를 입력할 경우 예외 처리가 진행 되어야 합니다.
		 * 총 숫자 입력은 7번이며, 사용자가 입력한 숫자를 오름차순으로 정렬합니다.
		 * 
		 * "숫자를 하나 입력해주시길 바랍니다. : " - 7번
		 * 문자 입력시 예외처리
		 * 
		 * 100 80 85 221 122 123 51 일 경우
		 * 
		 * [51, 80, 85, 100, 122, 123, 221]
		 * 
		 * 추가
		 * 
		 * 짝수와 홀수를 별도의 배열로 만들기
		 * [80,100 122]
		 * [51, 85, 123,221]
		 * 
		 */
	//	input in = new input();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ex = new ArrayList();
		ArrayList<Integer> ex2 = new ArrayList();

		int ww = 0;
		do {
			System.out.println("숫자입력");
			try {
				Integer ck = Integer.valueOf(sc.next());
				if(ck%2==0) {
					ex.add(ck);
				}
				else {
					ex2.add(ck);
				}
			}catch(Exception e) {
				System.out.println("숫자만입력");
			}
			ww++;
		}while(ww<7);
		Collections.sort(ex);
		System.out.println("짝수 : " + ex);
		Collections.sort(ex2);
		System.out.println("홀수 : " + ex2);
	}
	
}
//class input{
////	public input() {
////		while(true) {
////		try {
////			int f =1 ;
////			if(f <= 7) {
////				
////				for(f=1; f<=7; f++) {
////					System.out.println("숫자를 하나 입력해주시길 바랍니다. : ");
////					int inputnum = sc.nextInt();
////					ex.add(inputnum);
////			}
////				Collections.sort(ex);
////				System.out.println(ex);
////				
////			}
////		}catch(Exception e) {
////			System.out.println("숫자만 입력");
////			
////		}
////	}
////	}
//
//
//}
