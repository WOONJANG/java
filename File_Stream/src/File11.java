import java.io.FileInputStream;
import java.io.IOException;

// Stream�� �̿��� FileRoad
public class File11 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			System.out.println(fs.available()); //available : ���� ��ü ũ��
			byte temp[] = new byte[fs.available()]; // ������ �뷮 �迭 ����( ���� ũ�⿡ ���� ����)
			int ea = fs.read(temp);
			String data = new String(temp,0,ea);
			System.out.println(data);
			// �� �Ʒ� ���� 
//		InputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
//		byte temp[] = new byte[49];
//		int ea = fs.read(temp);	// ASCII�ڵ�� ��ü�� �о ea��
//		String data = new String(temp,0,ea);
////		String data = new String(temp,"UTF8"); // String �������·� �迭�� ���
//		System.out.println(data);
		fs.close();
		}catch(Exception z) {
		
		}
		
	}

}
