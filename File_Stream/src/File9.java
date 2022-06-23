import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// (최상위) Reader - BufferedReader, FileReader, CharArrayReader  
// (하위) - 문서파일 ASCII
// (하위) InputStreamReader - 이미지, 동영상, 오디오

// InputStream(입력)
public class File9 {

	public static void main(String[] args) {
		// Stream : 이미지, 동영상, 오디오 같은 파일을 로드하기 위해서 (바이너리)
		// InputStream : 모든 입력장치에 대한 값을 받는 클래스. 기본(int)
		// InputStrean (최상위 입력장치)
		// - FileInputStream, AudioInputStream, ObjectInputStream
		InputStream is = new InputStream() {	// 기본 클래스를 로하여 오버라이드 메소드를 불러옴
			
			@Override
			public int read() throws IOException { // byte 1 ~ 2 
				
				int a = 15;
				
				return a;
			}
		};
	
		// InputStreamReader (언어패킷 변경) - FileInputStream
		// InputStreamReader("파일명", EUCKR) or InputStreamReader("파일명",UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
//			System.out.println(ir.read());
//			System.out.println(is.read());
		}catch(Exception z) {
			System.out.println(z);
		}
		
		Reader reader = new Reader() {
			
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		
		// 키보드값 로드
		InputStream user = System.in;
		try {
			int code = user.read();	// 키보드 입력 ASCII 코드값을 반환
			if(code == 13) {
				System.out.println("엔터키는 사용하실 수 없습니다.");
			}
			else if (code == 45){
				System.out.println("- 불");
			}
//			System.out.println(code);
		}catch(Exception z) {
			
		}

	}

}
