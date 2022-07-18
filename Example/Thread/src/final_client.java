import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class final_client {

	public static void main(String[] args) {

		try {
		client_chat1 c_ch = new client_chat1();
		c_ch.chat_client();
		}catch(Exception a) {
			if(a.getMessage() != null) {
				System.out.println(a);
			}
		}
		
		
	}

}

class client_chat1 {
	String input_ip = "";
	private int input_port = 0;
	Socket sk = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null; // ID값 저장
	String msg = null; // 보내는 메세지
	String s_msg = null; // SERVER에서 날라오는 메세지
	String enter_msg = null;
	String check = null;
	
	public void chat_client() {
		// 각종 Stream을 close 하지 않습니다. 
		// 왜냐하면, 모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료 됩니다.
		// Socket은 본 데이터갑ㄴ경이이루어지면 접속이 끊어지는 현상이 발생
		this.sc = new Scanner(System.in);
		System.out.println("ip 입력");
		this.input_ip = sc.next();
		System.out.println("port 입력");
		this.input_port = sc.nextInt();
		try {
//			this.sc = new Scanner(System.in);
//			System.out.println("ID 생성");
//			this.mid = sc.nextLine();
			this.sk = new Socket(this.input_ip, this.input_port);

			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();

			this.os.flush();

//			int c = 0;
//			while (true) {
//				if (c == 0) {
					this.msg = "[ " + this.mid + " ] (님) 입장";
//				} else {
//					this.sc = new Scanner(System.in);
//					System.out.println("채팅 내용 입력 : ");
//					this.check = this.sc.nextLine().intern();
//					this.msg = "CLINET - [" + this.mid + "] : " + this.check;
//				}
//				
//				if (this.check == "exit") {
//					this.msg = "CLINET - [" + this.mid + "] : (님)이 퇴장";
//					this.os.write(this.msg.getBytes());
//					this.os.flush();
//					
//					this.sk.close();	// 소켓종료
//				} else {
//					this.os.write(this.msg.getBytes());
//					this.os.flush();
//				}
//				
//				byte data[] = new byte[1024];
//				int n = this.is.read(data);
//				this.s_msg = new String(data, 0, n);
//				
////				System.out.println(this.s_msg);
//				
//				c++;
//
//			}
		} catch (Exception b) {
			String error = b.getMessage();
			if(error.indexOf("StringIndexOutOfBoundsException") != -1) {
				System.out.println(b.getMessage() + "연결 끊김");
			}
		}

	}
} 