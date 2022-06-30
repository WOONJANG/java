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
	String mid = null; // ID값 저장
	String msg = null;
	String c_msg = null; // ClIENT에서 날라오는 메세지
	String enter_msg = null;
	String check = null;
	public void chat_server () {
		try {
			this.ss = new ServerSocket(this.port);	//소켓 생성
			this.sc = new Scanner(System.in);
			System.out.println("ID 생성");
			this.mid = sc.nextLine();	// 사용자 ID 입력
			System.out.println("채팅방 개설 완료!!\n[ " + this.mid + " ] (님) 입장");
			

			
			this.sk = this.ss.accept();	// accept
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			while (true) {
			
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.c_msg = new String(data,0,n);
				
			if(this.c_msg.indexOf("퇴장") != -1) {
				System.out.println(this.c_msg);
				sk.close();
				sc.close();
				break;
				
			}else {
				System.out.println(this.c_msg);
			}
					this.sc = new Scanner(System.in);
					System.out.println("채팅 내용 입력 : ");
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
			System.out.println(e.getMessage() + "서버중복");
		}
		
		
	}
}
