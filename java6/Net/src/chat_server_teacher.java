// extends
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server_teacher {

	public static void main(String[] args) {

		server_chat s_ch = new server_chat();
		s_ch.chat_server();

	}

}

class server_chat {
	private final int port = 8009;
	ServerSocket ss = null;
	Socket sk = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null; // ID�� ����
	String msg = null;
	String c_msg = null; // ClIENT���� ������� �޼���
	String enter_msg = null;
	String check = null;
	public void chat_server () {
		try {
			this.ss = new ServerSocket(this.port);	//���� ����
			this.sc = new Scanner(System.in);
			System.out.println("ID ����");
			this.mid = sc.nextLine();	// ����� ID �Է�
			System.out.println("ä�ù� ���� �Ϸ�!!\n[ " + this.mid + " ] (��) ����");
			

			
			this.sk = this.ss.accept();	// accept
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			while (true) {
			
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.c_msg = new String(data,0,n);
				
			if(this.c_msg.indexOf("����") != -1) {
				System.out.println(this.c_msg);
				sk.close();
				sc.close();
				break;
				
			}else {
				System.out.println(this.c_msg);
			}
					this.sc = new Scanner(System.in);
					System.out.println("ä�� ���� �Է� : ");
					this.check = this.sc.next().intern();
					if(this.check == "exit") {
						sk.close();
						ss.close();	
						break;
					}
					this.msg = "SERVER - [" + this.mid + "] : " + this.check;
					this.os.write(this.msg.getBytes());
					this.os.flush();
			
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage() + "�����ߺ�");
		}
		
		
	}
}
