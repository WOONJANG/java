import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		
		Socket sc = null;
		String ip = "192.168.1.114";
		int port = 8009;
		InputStream is = null;
		OutputStream os = null;
		Scanner in_msg = null;
		String client_msg = null;
		String message = null;
		
		try {
			sc = new Socket(ip,port);
			System.out.println("���� ���� �Ϸ�!!");
			is = sc.getInputStream();
			os = sc.getOutputStream();

			while(true) {	// ���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
				System.out.println("���� �Է�");
				in_msg = new Scanner(System.in);
				client_msg = "ȫ�浿 : [ "+ in_msg.nextLine() + " ]";
				os.write(client_msg.getBytes());

				os.flush();
				
				byte data[] = new byte[1024];
				int n = is.read(data);
				message = new String(data,0,n);
				System.out.println(message);
			}
			
			
		}catch(Exception e) {
			if(e.getMessage() != null) {
				in_msg.close();
				System.out.println("���� ���� ����!!");
			}
		}finally{	// Client�� ���� ����� �ش� ���� �� ���� Stream, Scanner ��� ����
			try {
				sc.close();
				os.close();
				is.close();
				in_msg.close();
			}catch(Exception ee) {
				
			}
		}
		
	}

}
