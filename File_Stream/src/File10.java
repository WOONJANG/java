import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

// OutputStream (output) - �ֻ���
// (����) FileOutputStream, ObjectOutputStream, AudioOutputStream
public class File10 {

	public static void main(String[] args) {
		String a = "ȫ�浿";
		String b = "123456789";
		 // byte[] : ���ڿ��� ASCII ������ �迭�� ���� �� �� ���
		byte[] c = b.getBytes();	// getBytes("�����Ŷ")
		System.out.println(Arrays.toString(c));
		OutputStream os = System.out; 
		try {
			os.write(c,0,c.length); // (byte�迭�̸�, �迭��ȣ, �迭ũ��)
			os.flush();	// ��� ��Ʈ
		}catch(Exception z) {
			
		}
		
		
	}

}
