import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

// Scanner�� �̿��� File �ε� ���� (input)
public class File5 {

	public static void main(String[] args) throws IOException{
		// System.in : input
		// System.out : output
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);	// System.in(����� �Է�), FileReader : ������ �ε�
/*			
 			for(;;) {	// loop�� ����ó���� ���� �� ����
				String result = sc.next();	// ���� �ε� �� �Է°��� result�� ����
				if(result != null) {
				System.out.println(result);	// ���
				}
				else{
					sc.close();
					break;
				}
*/
			int count = 0;
			while(sc.hasNext()) {	// hasNext() : true or false ��ɾ�.  �����Է°� ����Ȯ��
				sc.nextLine();
				count++;
			}
			System.out.println(count); // ��� : 3
			sc.close();
			fr.close();
		}catch(Exception z) {
			System.out.println(z);	
		}
	}
}
