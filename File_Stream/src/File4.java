import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// ���� ���� (write)
public class File4 {

	public static void main(String[] args) throws IOException, Exception {
		// FileWriter : ���� �����͸� ���Ͽ� ���� Class 
		
		try {
			String user[] = {"Apple30", "Banana33", "Chi16l", "Death612"};
//			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			// FileWriter ,true�� ����ϸ� ���� �Էµ� ������ �ʱ�ȭ���� ����.
			for(int f = 0; f < user.length; f++) {

				System.out.println(user[f]);
				fw.write(user[f]); // write : ����, �迭 ������ ���� ���Ͽ� ������
				
			}
			fw.close(); // ���� ���»����� ����.
		}catch (Exception z) {
			System.out.println("test");
		}

	
		
	}
}
