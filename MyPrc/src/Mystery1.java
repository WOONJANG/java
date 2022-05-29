import java.util.Scanner;

public class Mystery1 {

	public static void main(String[] args) {
		
		/*
		 * 사용자 패스워드는 a1234 입니다.
		 * 사용자가 패스워드를 입력합니다.
		 * 단, 3회 이상 실패시 다음과 같이 출력되도록합니다.
		 * "패스워드 횟수 제한으로 가까운 지점에 방문하셔야합니다"
		 * 단, 패스워드가 맞을 경우
		 * "로그인 되었습니다."
		 * 라고 출력 되어야합니다.
		 * */


		
		final String pw = "a1234"; //비밀번호
		int count=3;
		
		Scanner sc = new Scanner(System.in);
		String msg = "비밀번호를 입력하세요.";
		int re =1; //반복
		while (re<=3) {
			System.out.println(msg);
			String  userpw = sc.next();
			if (pw.equals(userpw)) {
				System.out.println("로그인 되었습니다.");
				break;
			}
			
			else {
				msg = "올바른 패스워드를 입력하세요.";
				count--;
				if (count==0) {
					System.out.println("패스워드 입력 횟수 제한으로 가까운 지점에 방문하셔야합니다.");
				}
			}
			re++;
		}
sc.close();				
			
			}
		}
		
			
		
				

	
