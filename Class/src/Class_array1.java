import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		// 클래스 + 메소드 + 배열 
		String users[] = {"홍길동","이순신","김유신"};
//		arrays.lists(users);
		/*[응용문제]
		 * 사용자가 자신의 이름을 입력합니다.
		 * 사용자 이름을 해당 class로 보내서 등록된 사용자 인지
		 * 미가입자 사용자 인지를 확인하는 코드를 작성하시오.
		 * 등록된 사용자일 경우 "가입이 되어있습니다." 출력
		 * 미등록일 경우 "미가입자 입니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String input_name = sc.next();
		arrays.lists(users, input_name);
		sc.close();

		
		
		
		
	}
}
class arrays {
	public static void lists (String a[],String data) {
		//System.out.println(Arrays.toString(a));
		String msg = " "; // 메소드로 해당 값을 전달할때는 비어있는 값을 명확하게 적용해야한다. 
		//String = "  " or null / int  0으로 표현
//		int datas = 0;
		int f;
		int ea = a.length; //3
		boolean ck = false;
		for(f=0; f<ea; f++) {
			if (a.equals(a[f])) {
				
				msg = "가입이 되어 있습니다.";
				ck = true;
			}
		}
		if (ck==false) {
			msg = "미가입자 입니다.";
		}

		arrays ar = new arrays();
		ar.message(msg);
		}
	public void message(String m) {
		System.out.println(m);
	}
}