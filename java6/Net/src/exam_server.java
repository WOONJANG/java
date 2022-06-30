import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class exam_server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		OutputStream os = null;
		int port = 9091;
		Scanner in_msg = null;
		String server_msg = null;
		String message = null;
		String user_id = null;
		String exit_msg = null;
		
		try {
			ss = new ServerSocket(port);
			System.out.println("서버에서 사용하실 아이디를 입력해주세요.");
			in_msg = new Scanner(System.in);
			user_id = in_msg.nextLine();
			System.out.println("서버 연결 대기중..");
			
			sc = ss.accept();
			System.out.println("연결 확인");
			is = sc.getInputStream();
			os = sc.getOutputStream();
			
			byte data[] = new byte[1024];
			
			while (true) {

				int n = is.read(data);
				message = new String(data,0,n);
				
				if(message.indexOf(":") == -1 ) {
					System.out.println(message + "님 퇴장하셨습니다.");
					System.exit(0);
				}
				else {
					System.out.println(message);
					System.out.println("내용 입력을 입력해주세요");
					server_msg = user_id + " : [ " + in_msg.nextLine() + " ]";
					os.write(server_msg.getBytes());
					os.flush();
				}

			}
		}catch(Exception e) {
			
			System.out.println("SERVER ERROR");
		}
	}
}