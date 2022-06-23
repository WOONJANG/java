import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

// File7에 대한 추가 설명 BufferReader+Array (output -> input -> output)
public class Buffer_array {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt", Charset.forName("UTF8"));  // output
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<>();	// 빈 배열 class
		String word = "";
		while( ( word = br.readLine() ) != null) {	// buffer에 있는 값을 String 자료형으로 이전 후 
			ar.add(word); // input	// 해당 자료형에 저장된 문자를 배열로 추가 시킴.
		}
		br.close();
		System.out.println(ar);  // 출력 : [버퍼 사용 확인??, 출력 확인 하는 중 입 니 다...., 배열로 변환 가능 한가요?, JAVABufferReader힘듦., 각종 클래스 규칙 여러가지]
		System.out.println(ar.size()); // output // 출력 5
		
	}

}
