import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {

		/*2차 배열, 2차배열은 다음과 같습니다.
		 * user_list : 	홍길동 	이순신 	강감찬 	유관순 	세종대왕 	김유신 	계백장군
		 * user_point : 3000 		1000 		25000 	19800 	5750 			3630 		0
		 *
		 * "프로그램 시작과 동시에 포인트를 검색할 고객명을 입력하세요"
		 * 입력한 값은 별도에 class를 제작하여 해당 메소드 값으로 매개변수를 이용하여 전달 후 해당 결과값을 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포인트를 검색 할 고객명을 입력하세요");
		String input = sc.next();
		
		point p = new point();
		p.pointsrc(input);
		sc.close();
		p= null;
		
		
	}
	

}

class point {
	public void pointsrc (String nm) {
		
		String inpoint [][] = { {"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
										{"3000", "1000", "25000", "19800", "5750", "3630", "0"}
										};
		int ea = inpoint.length; //2
		int ea2 = inpoint[0].length; //7
		
		int w = 0;
		while(w<ea2) {
			if(nm.equals(inpoint[0][w])) {
				System.out.printf("%s님의 포인트는 %s 입니다.",inpoint[0][w],inpoint[1][w]);
			}
			else {
				System.out.println("고객명을 정확하게 입력하세요.");
				break;
			}
			w++;
		}
		

		}
	}
