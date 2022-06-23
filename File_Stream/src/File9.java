import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// (�ֻ���) Reader - BufferedReader, FileReader, CharArrayReader  
// (����) - �������� ASCII
// (����) InputStreamReader - �̹���, ������, �����

// InputStream(�Է�)
public class File9 {

	public static void main(String[] args) {
		// Stream : �̹���, ������, ����� ���� ������ �ε��ϱ� ���ؼ� (���̳ʸ�)
		// InputStream : ��� �Է���ġ�� ���� ���� �޴� Ŭ����. �⺻(int)
		// InputStrean (�ֻ��� �Է���ġ)
		// - FileInputStream, AudioInputStream, ObjectInputStream
		InputStream is = new InputStream() {	// �⺻ Ŭ������ ���Ͽ� �������̵� �޼ҵ带 �ҷ���
			
			@Override
			public int read() throws IOException { // byte 1 ~ 2 
				
				int a = 15;
				
				return a;
			}
		};
	
		// InputStreamReader (�����Ŷ ����) - FileInputStream
		// InputStreamReader("���ϸ�", EUCKR) or InputStreamReader("���ϸ�",UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
//			System.out.println(ir.read());
//			System.out.println(is.read());
		}catch(Exception z) {
			System.out.println(z);
		}
		
		Reader reader = new Reader() {
			
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		
		// Ű���尪 �ε�
		InputStream user = System.in;
		try {
			int code = user.read();	// Ű���� �Է� ASCII �ڵ尪�� ��ȯ
			if(code == 13) {
				System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
			}
			else if (code == 45){
				System.out.println("- ��");
			}
//			System.out.println(code);
		}catch(Exception z) {
			
		}

	}

}
