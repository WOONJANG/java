import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// Socket 통신 : Server, Client : 메세지, 파일 전달 송수신통신 (양방향)
// HTTP 통신 : JSON, Image, 동영상, 음악 사용자(요청)가 서버(응답)랑 송수신통신 (단방향)
public class net5 {
	// Server
	public static void main(String[] args) {

		System.out.println("SERVER CONNECT");
		int port = 8080;	// 오픈 할 port번호 셋팅 ( 절대 중복 번호 사용 X )
		String msg = "연결 성공!!";
		
		try {
			// 연결을 지속적으로 유지하기 위해서는 ServerSocket은 절대 재로드 하면 안 됨
				ServerSocket ss = new ServerSocket(port);	// 오픈시킬 포트를 적용
				while(true) {
				System.out.println("ROADING...");
				Socket sc = ss.accept();	// accept() : 클라이언트가 들어오는것을 대기하는 역할을 함.
				System.out.println("HOST : 통신 연결 성공");
				/* SERVER에서 보낸값을 받기 위한 통로 */
				InputStream is = sc.getInputStream();	// Client에서 보내는 값을 읽어들임
				/* CLIENT로 보내는 통로 */
				OutputStream os = sc.getOutputStream();	// Client로 값을 전송
				byte[] data = new byte[1024];	// Client에서 받는 값을 byte로 받음
				int n = is.read(data);	// 해당값을 읽어들임
				String msgclient = new String(data,0,n);	// 해당값을 배열로 확인하여 변수 이관
				System.out.println(msgclient);	// 이관된 값을 출력시키게됨
				
				Scanner sms = new Scanner(System.in);
				String aws = "[ " + sms.nextLine() + " ]"/*"반갑습니다."*/;	// 서버에서 보내는 메세지
				os.write(aws.getBytes());	// 클라이언트로 보내기 위한 메모리 저장
				os.flush();
				
				is.close();
				os.close();
				sc.close();
			}
		}catch(Exception e) {
			System.out.println("현재 서버 포트가 중복되어, 서버를 강제 종료합니다.");
		}
		
		
		
	}

}
