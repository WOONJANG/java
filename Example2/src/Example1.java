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
		int min = 1; // 최소값
		int max = 9; // 최대값 - 1
		Random random = new Random();
		int pcrd = random.nextInt(max + min) + min;
		System.out.println(pcrd); // 랜덤값
//		int user_input = sc.nextInt();
//		ex2.setter(int user_input, int pc_num);
 //==============================================
		
		int re;

		for(re=5; re>0; re--) {
		System.out.printf("총 기회가 %s 번 남았습니다. 1 ~ 10까지 번호 중 한의 번호를 입력해주세요.\n", re);
		int user_input = sc.nextInt();
			if( pcrd == user_input) {
				System.out.println("정답");
				break;
			}
			else if( pcrd < user_input) {
				System.out.printf("DOWN \n", re-1);
			}
			else if( pcrd  > user_input) {
				System.out.printf("UP \n", re-1);
			}
			if (re == 1) {
				System.out.println("\n실패 정답은 " + pcrd);
				break;
			}
		}
		sc.close();
		System.exit(0);
		
	}

}
