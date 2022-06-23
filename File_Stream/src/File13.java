import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File13 {

	public static void main(String[] args) throws IOException {
		
		try {
			// ���� ����
			// createDirectories : ���丮 ����
			Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src\\test"));
			
			// ���� ����
			// copy : �ش� ������ ������ ����
			Path data1 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"); 
			Path data2 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db(2).txt");
			Files.copy(data1, data2);
						
//			// ���� ����
//			// createFile : ���� ����
//			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db3.txt");
//			Files.createFile(data3);
//			
//			// �̵�
//			// move : �ش� ������ �ٸ� ���丮�� �̵�
//			Path data4 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db2.txt");
//			Path directory = Paths.get("C:\\java5\\movie_db2.txt");
//			Files.move(directory, data4);
//					
//			// ����
//			// delete : �ش� ������ ����
//			Path data5 = Paths.get("C:\\java5\\File_Stream\\src\\testtest.txt");
//			Files.delete(data5);
			
		}catch(Exception z) {
			System.out.println(z);
		}
	}
}
