import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���̵� �Է����ּ���.");
		String id = sc.nextLine();
		chat_client cc = new chat_client(id);
	}

}

class chat_client{
//	static String input_ip = null;
//	static int input_port = 0;
	static String ip = "127.0.0.1";
	static int port2 = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String m_msg = null;	// ������
	String u_msg = null;	// �޴�
	
	public chat_client(String mid){
		try {
			System.out.println("[ " + mid + " ] (��) ����");
			
			this.sk = new Socket(this.ip, this.port2);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			System.out.println("ä�ó����� �Է��ϴ� �ڵ�");
			
			
			this.m_msg = "[ " + mid + " ] (��) : ����";
			this.os.write(this.m_msg.getBytes());
			this.os.flush();
			
			System.out.println("1");
			
			while(true) {	
				byte data[] = new byte[4096];
				int n = this.is.read(data);
				this.u_msg = new String(data, 0, n);
				System.out.println(this.u_msg);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}