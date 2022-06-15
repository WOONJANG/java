package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		// 문자와 숫자 배열 사용
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList(); // 자료형이 없는 상태

		int w = 0;
		while(w < 5) {
			System.out.println("데이터를 입력해 주시길 바랍니다.");
			String user = sc.next();
			list.add(user);
			w++;
		}
		
		System.out.println(list);
		
		/* 숫자 입력 사항만 모두 더함*/
		int dw =0;
		int total = 0;
		do {
			try {
				Object k = list.get(dw);	// 배열 자료가 숫자 + 문자 형태로 구성이 되어있을 경우는 Object 매개 타입으로 설정합니다.
				int numbers = Integer.parseInt(k.toString());	// 해당 매개 타입을 문자화 하여 ㅔaseInt로 재 검증함
				total += numbers;
			}catch(Exception e) {	// 배열에 매개타입이 숫자가 아닐경우 (예외 상황 발생)
				
			}
			dw++;
		}while(dw < list.size());
//		Object a = list.get(0); // Object 하나의 객체로 인식
		System.out.printf("입력한 모든 배열의 숫자 합은 %d 입니다.",total);
		sc.close();
	}

}
