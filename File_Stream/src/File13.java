import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File13 {

	public static void main(String[] args) throws IOException {
		
		try {
			// 폴더 생성
			// createDirectories : 디렉토리 생성
			Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src\\test"));
			
			// 파일 복사
			// copy : 해당 폴더에 파일을 복사
			Path data1 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"); 
			Path data2 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db(2).txt");
			Files.copy(data1, data2);
						
//			// 파일 생성
//			// createFile : 파일 생성
//			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db3.txt");
//			Files.createFile(data3);
//			
//			// 이동
//			// move : 해당 파일을 다른 디렉토리로 이동
//			Path data4 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db2.txt");
//			Path directory = Paths.get("C:\\java5\\movie_db2.txt");
//			Files.move(directory, data4);
//					
//			// 삭제
//			// delete : 해당 파일을 삭제
//			Path data5 = Paths.get("C:\\java5\\File_Stream\\src\\testtest.txt");
//			Files.delete(data5);
			
		}catch(Exception z) {
			System.out.println(z);
		}
	}
}
