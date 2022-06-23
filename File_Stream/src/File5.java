import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

// Scanner를 이용한 File 로드 사용법 (input)
public class File5 {

	public static void main(String[] args) throws IOException{
		// System.in : input
		// System.out : output
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);	// System.in(사용자 입력), FileReader : 파일을 로드
/*			
 			for(;;) {	// loop시 예외처리로 빠질 수 있음
				String result = sc.next();	// 파일 로드 된 입력값을 result로 전달
				if(result != null) {
				System.out.println(result);	// 출력
				}
				else{
					sc.close();
					break;
				}
*/
			int count = 0;
			while(sc.hasNext()) {	// hasNext() : true or false 명령어.  다음입력값 유무확인
				sc.nextLine();
				count++;
			}
			System.out.println(count); // 출력 : 3
			sc.close();
			fr.close();
		}catch(Exception z) {
			System.out.println(z);	
		}
	}
}
