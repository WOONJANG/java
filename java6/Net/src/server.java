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
			System.out.println("서버 연결 대기중..");
			while (true) {
			sc = ss.accept();
			System.out.println("연결 완료!!");
			is = sc.getInputStream();
			os = sc.getOutputStream();
			
			byte data[] = new byte[1024];
			int n = is.read(data);
			message = new String(data,0,n);
			System.out.println(message);
			
			in_msg = new Scanner(System.in);
			System.out.println("내용 입력");
			server_msg = "이순신 : [ "+ in_msg.nextLine() + " ]";
			os.write(server_msg.getBytes());
			
			os.flush();
			}

		}catch(Exception e) {
			
			System.out.println(e.getMessage() + "서버 중복 실행 중");
		}
		
	}

}
