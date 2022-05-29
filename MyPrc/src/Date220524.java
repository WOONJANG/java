import java.io.InputStream;
import java.util.Scanner;

public class Date220524 {

	public static void main(String[] args) {
		
		Scanner inputid = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String userid = inputid.next();
		
		
		Scanner inputpw = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");
		String userpw = inputpw.next();
		
				
		if (userid.equals("qwerty") && userpw.equals("a1234")) {
			System.out.println("로그인 하셨습니다.");
		}
		else if (userid.equals("qwerty") || userpw.equals("a1234")) {
			System.out.println("아이디나 비밀번호를 다시 확인해주세요.");
		}
		else {
			System.out.println("아이디나 비밀번호를 잊어버렸습니까?");
		}

	}

}
