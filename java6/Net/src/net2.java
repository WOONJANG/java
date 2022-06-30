import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/* ���� ������ �������� */
// TCP(���� ��������) - ���� �ӵ��� ����
// UDP(����� ������ ��������) - ���� �ӵ��� ���� (1 : 1 �� ��� ������ ����)
/* [TCP PORT] 
  80 : WEB (http://)
  21 : FTP (���� ���۽� ���)
  22 : SSH - Linux, Unix (���� ����, ���� �ܺ� ����)
  23 : TELNET - Windows (���� �ܺ� ����)
  25 : SMTP (���� ����) - ���� ������
 110 : POP3 (���� �ޱ�) - ����, ���� �ޱ� (�񵿱�ȭ)
 143 : IMAP (���� �ޱ�) - ����, ���� �ޱ� (������ ����ȭ)
 443 : WEB (https://)
*/

/* SNMP : UDP (���ڹ߼۽ý���), VPN (���� IP) : UDP */
public class net2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է��� �ּ���?");
		String url = sc.next();
		
		URL u = new URL(url);	// URL(class) : ��Ʈ��ũ ���
		URLConnection con = u.openConnection();	// �ش� ��θ� ����
////		System.out.println(con);
		int imgsize = con.getContentLength();	// indexOf ��� -1(����), �ܿ��� ���� Ȯ��
////		System.out.println(imgsize);
//		String imgtype = con.getContentType();	// ���� �Ӽ��� Ȯ��
////		System.out.println(imgtype);
//		Long date = con.getDate();	// ���� �ε� ��¥
////		System.out.println(date);
		
		// openStream() : URL���� ���
		InputStream is = u.openStream();	//URL���� ������ �о�ö� �����
		BufferedInputStream bi = new BufferedInputStream(is);	// URL���� ���� ������ �ӽ�����
		FileOutputStream fo = new FileOutputStream("copy.mp4");	// "copy.Ȯ���ڸ�" ���� ���� (jpg, mp4 ��)
		byte data[] = new byte[1024];	// 1024byte = 1kb �� ������

		int imgdata = 0;
		int cnt = 0;	// �ݺ���
		while ((imgdata=bi.read(data))!= -1) {
			fo.write(data, 0, imgdata);	// ������ ������ �ٿ��ֱ�
			cnt += imgdata;	//1024++;
			System.out.println("�ٿ�ε���... +" + (cnt*100)/imgsize + "%");
		}
		fo.flush();
		fo.close();
		sc.close();
		System.out.println("�ٿ�ε� �Ϸ�");
	}

}
