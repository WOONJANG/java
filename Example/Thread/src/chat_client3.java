import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// Client 8001
public class chat_client3 {

	public static void main(String[] args) {

		port_chat_8003 pc3 = new port_chat_8003();
		pc3.connect();
	}
}

class port_chat_8003{
	String ip = "127.0.0.1";
	int port = 8003;	// �������� ������ ��Ʈ
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String halo_msg = null;
	String my_msg = null;
	String ur_msg = null;
	
	public void connect() {
		
		try {
			this.sk = new Socket(this.ip,this.port);
			while(true) {
				this.sk = new Socket(this.ip,this.port);
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
//===============		/* ������ �ش� �޼����� ���� */		===============
				this.halo_msg = "Ŭ���̾�Ʈ" + this.port; 
				this.os.write(this.halo_msg.getBytes());
				this.os.flush();
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("���� �Է�");
				this.my_msg = sc.nextLine();
				this.os.write(this.my_msg.getBytes());
				this.os.flush();
//===============		/* ������ �ش� �޼����� ���� */		===============
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}