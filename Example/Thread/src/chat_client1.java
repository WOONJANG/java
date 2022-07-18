import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// Client 8002
public class chat_client1 {

	public static void main(String[] args) {

		port_chat_8001 pc1 = new port_chat_8001();
		pc1.connect();
		
	}
}

class port_chat_8001{
	String ip = "127.0.0.1";
	int port = 8001;	// 서버에서 오픈한 포트
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String halo_msg = null;
	String my_msg = null;
	String ur_msg = null;
	
	public void connect() {
		
		try {
			while(true) {
				this.sk = new Socket(this.ip,this.port);
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
//===============		/* 서버로 해당 메세지를 전송 */		===============
				this.halo_msg = "클라이언트" + this.port; 
				this.os.write(this.halo_msg.getBytes());
				this.os.flush();
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("내용 입력");
				this.my_msg = sc.nextLine();
				this.os.write(this.my_msg.getBytes());
				this.os.flush();
//===============		/* 서버로 해당 메세지를 전송 */		===============
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}