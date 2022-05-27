import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 	사용자 패스워드는 a1234입니다.
		 	사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다음과 같이 출력되도록합니다.
		 	"패스워드 횟수 제한으로 가까운 지점에 방문하셔야합니다"
		 	단, 패스워드가 맞을 경우 " 로그인 되었습니다" 라고 출력 되어야합니다.
		 */
	
/*		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요");
		String pw = sc.next();
		
		for (a=0; a<5;a++) {
			if(pw.equals("a1234")) {
				System.out.println("로그인 성공");
				break;
			}
			else if (!(pw.equals("a1234"))) {
				System.out.println("패스워드를 다시 입력하세요");
				pw = sc.next();
				a++;
			}
			if (a == 2) {
				System.out.println("가까운 지점에 방문하셔야합니다");
				break;
			}
		}
*/
		final String pw = "a1234";
		int count = 3;
		
		Scanner sc = new Scanner(System.in);
		int w = 0 ;
		String msg = "패스워드를 입력하세요";
		while (w<3) {
			System.out.println(msg);
			String userpw = sc.next();
			if(pw.equals(userpw)) {
			System.out.println("로그인 되었습니다.");
			break;
			}
			else {
				msg = "올바른 패스워드를 입력해주세요.";
				count--;
				if(count==0) {
					System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문 하셔야 합니다.");
				}
			}
			w++;
			sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}	