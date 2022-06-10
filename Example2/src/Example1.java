import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 A파트 : PC랜덤 , Scanner(5) 
		 B파트 : PC에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과처리
		 
		  PC가 숫자를 하나 선택. ( 1 ~ 10 )
		  기회는 총 5번.
		  총 기회는 5번 남았습니다. 1 ~ 10까지 번호 중 한의 번호를 입력.
		  ex PC가 7일 경우, 사용자 숫자와 비교
		  -PC 7 vs 사용자 2 = > 결과 UP
		  총 기회는 4번 남았습니다.
		  PC 7 vs 사용자 4 = > 결과 UP
		  총 기회가  3번 남았습니다.
		  PC 7 vs 사용자 7 => 정답입니다. 동시에 모든 프로세서 정지.
		  
		 */
		Example2 ex2 = new Example2();
		Scanner sc = new Scanner(System.in);
//==============================================
						//랜덤 유틸 형식
		Random random = new Random();
		int pcrd = random.nextInt(10) + 1; // pc 랜덤값
	//	System.out.println(pcrd); // pc 랜덤값 출력 확인
 //==============================================
/*						//일반 랜덤 형식 (random double)
		double pcrd2 = (int)(Math.random()*10+1);
		System.out.println(pcrd2); 													*/
//==============================================
		
		int w = 5;
		
		do {
			System.out.printf("잔여 기회 : %d \n숫자 입력 : ", w);
			int user = sc.nextInt();
			ex2.ex22(pcrd, user);
			String out = ex2.result();
			System.out.println(out);
			int check = out.indexOf("정답"); //inexOf : 단어 검색  (-1 : 없음.) (0 : 있음.)
			if(check == 0) { // 정답일 경우 종료
				break;
			}
			w--;
		}while(w > 0);
	}

}
