import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class exam_client {

	public static void main(String[] args) {
		String ip = "192.168.1.114";
		int port = 9091;
		Scanner sn = null;
		Scanner sn1 = null;
		Socket sc = null;
		OutputStream os =null;
		InputStream is = null;
		String userid = "";
		String msg ="";
		
		
		try {
			sc = new Socket(ip, port);
			sn1 = new Scanner(System.in);
			System.out.println("채팅에 사용하실 아이디를 입력해주세요.");
			
			userid = sn1.nextLine();
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			
			for (;;) { //지속적으로 소켓에 계속 접속되도록 하는 형태
				sn = new Scanner(System.in);
				System.out.println("입력하실 내용을 작성해주세요");
				
				msg = userid + " : [ "+sn.nextLine() + " ]";
			
				if((msg.indexOf("exit"))!=-1) {
					os.write(userid.getBytes());
					System.out.println("채팅이 종료되었습니다.");
					System.exit(0);
					
				}
				else {
				
				os.write(msg.getBytes());
				os.flush();

				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data, 0, n);
				System.out.println(message);
				}
			}



		} catch (Exception c) {
			System.out.println(c.getMessage());
			if ((c.getMessage()) != null) {
				System.out.println("현재 접속 장애가 발생함");
				
				// TODO: handle exception
			}
		}
		finally { //클라이언트가 접속 종료 시 해당 소켓 및 각종 Stream, Scanner등을 모두 종료
			try {
				sc.close();
				os.close();
				is.close();
				sn.close(); //접속 종료 시 체크
			} catch (Exception e) {
				
				
			}
		}
	}

}
