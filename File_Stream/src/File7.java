import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* 공통명령어 사항 : read(), readLine(), next(), nextLine()  */
// BufferReader (output)
public class File7 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt", Charset.forName("UTF8"));
//			System.out.println((char)fr.read());
			
			// BufferedReader : Temp (임시저장소) - 효율적으로 파일을 보다 빠르게 가져올수있다.
			BufferedReader bf = new BufferedReader(fr);	//readLine()으로 해당 값이 확인 된다.
			/* buffer는 최초 값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다. 
			 * 조건문 사용시에도 한번 작동이 이루어지게 됩니다.*/
			/*
			if(bf.readLine() != null) {
				System.out.println(bf.readLine());
			}
			*/
			/* 반복문
			System.out.println(bf.readLine());	// 첫번째줄 출력
			for(int f =0; f<=2; f++) {
				String data = bf.readLine();
				System.out.println(data);
//			System.out.println(bf.readLine());	// 위에서 첫번째줄이 선언되었기 때문에 두번째줄 부터 출력 된다.
			//해당 임시저장소에서 저장된 내용 중 한개의 라인으로 로드하게 된다. (한줄당 한줄)
			}
			*/
			/* buffer는 속도가 빠른 대신 사용 부분에 무조건 변수 또는 배열로 받은 후 사용하는것을 권장. */
//			String line = "";
//			while((line=bf.readLine())!=null) {
//				System.out.println(line);
//			}
			/* 데이터문서의 라인 갯수를 확인 */
			// LineNumberReader : 파일 전체 라인 갯수를 확인하는 클래스.
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt", Charset.forName("UTF8"));
			LineNumberReader lnr = new LineNumberReader(fr2);
			
			int ea = 0;
			while(lnr.readLine()!=null){
				ea += lnr.getLineNumber();
			}

			System.out.println(ea);
fr.close();
fr2.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}