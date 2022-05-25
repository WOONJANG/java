import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		Scanner inid = new Scanner(System.in);
		System.out.println("접속 할 아이디를 입력하세요 : ");
		String userid = inid.next(); // 사용자 아이디 입력
		
		Scanner inpw = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요 : ");
		String userpw = inpw.next(); // 사용자 비밀번호 입력

		System.out.printf("아이디 : %s, 패스워드 : %s", userid, userpw);
		
		/*[로그인 프로그램]
		 * 회원가입 아이디는 jung, su
		 * 				패스워드는
		 * jung : j1234
		 * su : ssh
		 * 
		 *  해당 아이디 외에 나머지는 "가입되지 않은 사용자 입니다." 
		 *  라고 출력합니다. 또한, 패스워드가 틀릴경우 "회원 정보를 다시확인하세요"라고 출력합니다
		 *  아이디와 패스워드 모두 맞을 경우 "로그인 되셨습니다" 라고 출력하십시오. */
		
		/*
		 * String a = "jung", b="su"; String aa= "j1234", bb="ssh";
		 */
		
		if (userid.equals("jung") || userid .equals("su" )) {
			{
				if(userid.equals("jung") && userpw.equals("j1234")) {
					System.out.println("로그인 되셨습니다");
				}
				else if (userid.equals("su") && userpw.equals("ssh")) {
					System.out.println("로그인 되셨습니다");
				}
				else {
					System.out.println("회원 정보를 다시확인하세요.");
				}
			}
		}
		else {
			System.out.println ("가입되지 않은 사용자입니다.");
			
		}
	
		inid.close();
		inpw.close();
		
		
		
		
		
		
		
		
	}

}
