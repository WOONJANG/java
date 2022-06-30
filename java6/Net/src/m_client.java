import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력해주세요.");
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
	String m_msg = null;	// 보내는
	String u_msg = null;	// 받는
	
	public chat_client(String mid){
		try {
			System.out.println("[ " + mid + " ] (님) 접속");
			
			this.sk = new Socket(this.ip, this.port2);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			System.out.println("채팅내용을 입력하는 코드");
			
			
			this.m_msg = "[ " + mid + " ] (님) : 내용";
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