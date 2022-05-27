import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*[응용문제]
		 * A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		 * "점수를 입력하세요?" 라는 문구는 총 5번이 나오게 되며,
		 * 모든 점수는 합산하여 출력합니다.
		 * */
		
		/*
		 모든 점수를 합산한 후 5개의 점수에 대한 평균 값을 출력하세요.
		 출력 메세지는 "해당 점수의 평점은 : " 출력
		 단, 평점 점수가 40점 이하일 경우 "재시험입니다." 라고 메세지를 출력 후
		 프로세서는 종료합니다.
		 40점 이상일 경우 "합격"이라고 메세지를 출력하세요. 
		 */
		
			//추가기획 
			//"입력하실 과목 수를 적어주세요." 라고 제일 먼저 출력 후 해당 과목 수만큼 반복문이 적용이 되며,
			//과목 수 만큼 평균값이 적용되어야 합니다.
			//    시간 없어서 못했어요~~~

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요.");
		int usersub = sc.nextInt();
		
		int re; //반복
		int total = 0; // 합산
		int total2;
		int total3 = 1;
//		byte sub = 5; // 과목갯수
		
		for (re=1; re<=usersub; re ++) { //반복 갯수 바꾸기*****
			System.out.printf("%d번째 점수를 입력하세요?\n", re); // 5번 출력
			int score = sc.nextInt(); //사용자 입력
			total += score; //합산 계산
		}
//		System.out.printf("총 합산 점수는 %d 점 입니다.", total); // 합산 출력
		System.out.printf("총 점수는 %d 점 이며, 평균은 %d입니다.",total,total/usersub); // 합산 + 평균 출력  요기*******
		total2=total/usersub;
		
		if (total2 < 40) {
			System.out.println(" 재시험입니다.");
		}
		else if (total2 > 40) {
			System.out.println(" 합격");
		}
		
		
		
		sc.close();//스캐너 종료
		*/
		
		//while 문으로 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 수");
		int subject = sc.nextInt();
		int w = 1; //반복
		int user; //점수
		int total=0; //총 합
		
		while (w<=subject) {
			System.out.println("점수를 입력해주세요 : ");
			user = sc.nextInt();
			total += user;
			
			
			w++;
		}
		double avg = ((double)total) / subject;
		String msg;
		if (avg<40) {
			msg =" 재시험";
		}
		else {
			msg = " 합격";
		
		
		}
		System.out.println("최종 평균 점수는 "+avg +"점 이며, "+ msg);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
