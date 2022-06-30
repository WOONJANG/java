import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class note {

	public static void main(String[] args) {

		String ip = "192.168.1.114";
		int port = 8009;
		InputStream is = null;
		OutputStream os = null;
		String input_msg = null;
		
		try {
			System.out.println("서버 접속 완료!!");
			while(true) {
				Socket sc = new Socket(ip,port);
			is = sc.getInputStream();
			os = sc.getOutputStream();
			Scanner in_msg = new Scanner(System.in);
			System.out.println("내용 입력");
			input_msg = "[ "+ in_msg.nextLine() + " ]";
			os.write(input_msg.getBytes());

			os.flush();
			is.close();
			sc.close();
			in_msg.close();
			}
			
		}catch(Exception e) {
			if(e.getMessage()!=null) {
			System.out.println("서버 접속 실패!!");
			}
		}
		
	}

}
