import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

//ũ�Ѹ� 2
public class net4 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("ũ�Ѹ� �� url");
		String page = sc.next();
		System.out.println("url title .html");
		String title = sc.next();
		sc.close();
		URL url = new URL(page);
		/* Stream�� ����ϸ� read�� ��� (byte �̿�), Reader ����ϸ� readLine ��밡�� (String), flush() ������� BufferedOutputStream */
		InputStream is = url.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);	//�迭 byte[]
//		System.out.println(bis.read());	// ����� �Դ��� Ȯ��
		byte html[] = new byte[1024];
//		FileOutputStream fos = new FileOutputStream(title + ".html");	// �迭�� �ε��ؼ� ����	// �Ʒ��� ����
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(title + ".html"));
		int s = 0;
		while((s = bis.read(html)) != -1) {	// Stream�� read�� byte���� �Է�
//			fos.write(html, 0, s);	// �Ʒ��� ����
			bos.write(html, 0, s);
		}
		is.close();
		bis.close();
//		fos.close();	// �Ʒ��� ����
		bos.close();
	}

}
