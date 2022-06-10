import java.util.Scanner;

public class Test1 { // 스위치 혹시 equals 문제입니까...

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("on & off 중 하나를 입력하세요.");
		String user = sc.next();
		String msg = "";
		boolean ck = false;

		if(user.equals("on")) {
			ck = true;
		}

/*				
		switch (user) {
			case "on" -> {
			msg = "true";
			}
			case "off" -> {
			msg = "false";
			}
		}
		System.out.println(msg);
		
 */
		System.out.println(ck);
		sc.close();
	}
}
