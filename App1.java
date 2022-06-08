package App;
import java.util.Scanner;


public class App1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 할 데이터 학생명을 입력해 주세요?");
		String student = sc.next();

		System.out.println("검색할 과목 점수 [전체] or [과목명]");
		String score = sc.next();
		
		a12 ap2 = new a12(student,score);
		
		if(ap2.s123 == true) {
			
		if(score.equals("전체")) {
			String a22[] = ap2.a5();
			
			System.out.println(student+"님의 점수"+"\n국어:"+a22[1]+",수학:"+a22[2]+",과학:"+a22[3]+",역사:"+a22[4]);
		}
		
		else{
			System.out.println(student+"님의 "+score+"점수는:"+ap2.a4());
		}
		}
		
		else {
			System.out.println("존재하지 않는 과목이거나 이름입니다");
		}
		ap2 =null;
		sc.close();
			
	}
}
//=========================================================================================================




/* a12 [][] = {
0{"박은경", "이경훈", "장운", "조기현", "김진수"}, // 이름
1{"80", "78", "92", "67", "40" }, // 국어
2{"40", "80", "80", "92", "100"}, // 수학
3{"95", "30", "55", "90", "65"}, // 과학
4{"20", "80", "100", "95", "30"} // 역사
};
*/

