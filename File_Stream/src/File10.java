import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

// OutputStream (output) - 최상위
// (하위) FileOutputStream, ObjectOutputStream, AudioOutputStream
public class File10 {

	public static void main(String[] args) {
		String a = "홍길동";
		String b = "123456789";
		 // byte[] : 문자열을 ASCII 형태의 배열로 변경 할 때 사용
		byte[] c = b.getBytes();	// getBytes("언어패킷")
		System.out.println(Arrays.toString(c));
		OutputStream os = System.out; 
		try {
			os.write(c,0,c.length); // (byte배열이름, 배열번호, 배열크기)
			os.flush();	// 출력 파트
		}catch(Exception z) {
			
		}
		
		
	}

}
