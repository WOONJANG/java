import java.util.Scanner;

public class Test1 { // ����ġ Ȥ�� equals �����Դϱ�...

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("on & off �� �ϳ��� �Է��ϼ���.");
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
