import java.io.FileInputStream;
import java.io.IOException;

// Stream을 이용한 FileRoad
public class File11 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			System.out.println(fs.available()); //available : 파일 전체 크기
			byte temp[] = new byte[fs.available()]; // 무제한 용량 배열 파일( 파일 크기에 따라서 변함)
			int ea = fs.read(temp);
			String data = new String(temp,0,ea);
			System.out.println(data);
			// 위 아래 같음 
//		InputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
//		byte temp[] = new byte[49];
//		int ea = fs.read(temp);	// ASCII코드로 전체를 읽어서 ea로
//		String data = new String(temp,0,ea);
////		String data = new String(temp,"UTF8"); // String 문자형태로 배열을 출력
//		System.out.println(data);
		fs.close();
		}catch(Exception z) {
		
		}
		
	}

}
