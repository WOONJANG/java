import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* �����ɾ� ���� : read(), readLine(), next(), nextLine()  */
// BufferReader (output)
public class File7 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt", Charset.forName("UTF8"));
//			System.out.println((char)fr.read());
			
			// BufferedReader : Temp (�ӽ������) - ȿ�������� ������ ���� ������ �����ü��ִ�.
			BufferedReader bf = new BufferedReader(fr);	//readLine()���� �ش� ���� Ȯ�� �ȴ�.
			/* buffer�� ���� ���� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �˴ϴ�. 
			 * ���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �˴ϴ�.*/
			/*
			if(bf.readLine() != null) {
				System.out.println(bf.readLine());
			}
			*/
			/* �ݺ���
			System.out.println(bf.readLine());	// ù��°�� ���
			for(int f =0; f<=2; f++) {
				String data = bf.readLine();
				System.out.println(data);
//			System.out.println(bf.readLine());	// ������ ù��°���� ����Ǿ��� ������ �ι�°�� ���� ��� �ȴ�.
			//�ش� �ӽ�����ҿ��� ����� ���� �� �Ѱ��� �������� �ε��ϰ� �ȴ�. (���ٴ� ����)
			}
			*/
			/* buffer�� �ӵ��� ���� ��� ��� �κп� ������ ���� �Ǵ� �迭�� ���� �� ����ϴ°��� ����. */
//			String line = "";
//			while((line=bf.readLine())!=null) {
//				System.out.println(line);
//			}
			/* �����͹����� ���� ������ Ȯ�� */
			// LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� Ŭ����.
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt", Charset.forName("UTF8"));
			LineNumberReader lnr = new LineNumberReader(fr2);
			
			int ea = 0;
			while(lnr.readLine()!=null){
				ea += lnr.getLineNumber();
			}

			System.out.println(ea);
fr.close();
fr2.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}