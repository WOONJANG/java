import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args) throws IOException{

		
		try {
//			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");	// java ver.8
			// Charset.forName() : JAVA12 -> EUCKR(ANSI), UTF8, UTF16
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt",Charset.forName("EUCKR")); // 자바 UTF8, 파일 ANSI
//			System.out.println(fr.getEncoding());	// 인코더 형식을 확인
//			System.out.println(fr.read());
			while(true) {	// loop를 활용하여 해당 파일의 문자를 모두 가져옴.
				int m = fr.read(); // -1 : 내용이없음 ( 더 이상 문자가 없을 경우)
			System.out.print((char)m);
				if(m==-1) { // 더 이상 가져올 문자가 없을 경우 loop를 빠져나감
					break;
				}
			}
			fr.close(); // FileReader 종료.
		}catch(IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
	}

}
