import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class net6 {
	// Client
	public static void main(String[] args) throws Exception {
		System.out.println("CLIENT CONNECT");
		String ip = "127.0.0.1";	// localhost
		int port = 8080;
		try {
			while(true) {
				Socket sc = new Socket(ip,port);	// ������ Server IP, ������ Sever Port
				System.out.println("CONNECT ����!!");
				Scanner umsg = new Scanner(System.in);
			String cmsg = "[ " + umsg.nextLine() + " ]"/*"�ȳ��ϼ���."*/;
			/* Client���� Server�� ������ ��� */
			OutputStream os = sc.getOutputStream();
			
			/* Server���� ������ ���� �޴� ��� */
			/* Client���� ������ �޼����� �޸𸮿� ���� �� byte�� ���� */
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			/* Server���� ȸ�ŵ� �������� byte�迭�� ���� �� ��� */
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String (data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
			is.close();
			}
		}catch(Exception e) {
			System.out.println("CONNECT ����!!");
		}
	}

}
