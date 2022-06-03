import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 배열생성 + 기본(클래스)메소드 문제
		 * 사용자가 다음 질문에 값을 입력 하게 됩니다.
		 * "학급 학생 이름을 입력해 주세요"
		 * 무조건 총 배열 데이터는 5개가 생성되어 집니다.
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 리스트로 구성하여 출력하시오.
		 * 예시 ) 사용자가 입력한 형태 : hong kim park lee jang
		 * 결과 - hong, kim, park, lee, jang
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String lists = "";
		for(int re=0; re<5; re++) {
		System.out.println("학급 학생 이름을 입력해 주세요");
		String input_name = sc.next();
		lists += input_name + " ";
		}
		cre_name(lists);
		sc.close();
	}
	

	public static void cre_name (String a) {
//		System.out.println(a);
		
	a = a.trim();
	String userin[] = a.split("\\s+");	//split : 문자열 또는 숫자열을 특성 문자 기준으로 배열을 만들 수 있는 명령어.
		System.out.println(Arrays.toString(userin));
		
	}
}

	

