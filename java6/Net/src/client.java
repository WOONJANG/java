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
			System.out.println("서버 접속 완료!!");
			is = sc.getInputStream();
			os = sc.getOutputStream();

			while(true) {	// 지속적으로 소켓에 계속 접속되도록 하는 형태
				System.out.println("내용 입력");
				in_msg = new Scanner(System.in);
				client_msg = "홍길동 : [ "+ in_msg.nextLine() + " ]";
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
				System.out.println("서버 접속 실패!!");
			}
		}finally{	// Client가 접속 종료시 해당 소켓 및 각종 Stream, Scanner 모두 종료
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
