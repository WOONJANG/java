import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		OutputStream os = null;
		int port = 8009;
		Scanner in_msg = null;
		String server_msg = null;
		String message = null;
		
		try {
			ss = new ServerSocket(port);
			System.out.println("���� ���� �����..");
			while (true) {
			sc = ss.accept();
			System.out.println("���� �Ϸ�!!");
			is = sc.getInputStream();
			os = sc.getOutputStream();
			
			byte data[] = new byte[1024];
			int n = is.read(data);
			message = new String(data,0,n);
			System.out.println(message);
			
			in_msg = new Scanner(System.in);
			System.out.println("���� �Է�");
			server_msg = "�̼��� : [ "+ in_msg.nextLine() + " ]";
			os.write(server_msg.getBytes());
			
			os.flush();
			}

		}catch(Exception e) {
			
			System.out.println(e.getMessage() + "���� �ߺ� ���� ��");
		}
		
	}

}
