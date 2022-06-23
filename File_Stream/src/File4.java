import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 파일 쓰기 (write)
public class File4 {

	public static void main(String[] args) throws IOException, Exception {
		// FileWriter : 문자 데이터를 파일에 쓰는 Class 
		
		try {
			String user[] = {"Apple30", "Banana33", "Chi16l", "Death612"};
//			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			// FileWriter ,true를 사용하면 기존 입력된 사항을 초기화하지 않음.
			for(int f = 0; f < user.length; f++) {

				System.out.println(user[f]);
				fw.write(user[f]); // write : 문자, 배열 데이터 값을 파일에 적용함
				
			}
			fw.close(); // 파일 오픈사항을 종료.
		}catch (Exception z) {
			System.out.println("test");
		}

	
		
	}
}
