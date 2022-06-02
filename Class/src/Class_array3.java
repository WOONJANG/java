import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {

		/*[응용문제]
		 * 다음 문자 배열 데이터 값이 있다.
		 * a1 = {"홍길동, "이순신", "강감찬", "유관순", "김유신"}
		 * a2 = {"100", "80", "39", "60", "55"}
		 * "검색 하고자 하는 이름을 적어주세요" 출력
		 * 이순신 검색시 , 이순신님은 80점 입니다.
		 * 라고 출력되어야합니다.
		 *
		 */
		String a1[] = {"홍길동", "이순신", "강감찬", "유관순", "김유신"};
		String a2[] = {"100", "80", "39", "60", "55"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 하고자 하는 이름을 적어주세요.");
		String input = sc.next();
		
		score s = new score();
		s.search(a1, a2, input);
//score .search(a,  b,   c)
		sc.close();
		
	}

}

class score{
	public void search (String a[], String b[], String c) {

//		System.out.println(Arrays.toString());
	}
}

//input +"님은"+  +"점 입니다."