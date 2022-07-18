import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class file_server {

	public static void main(String[] args) {
		
		f_server fs = new f_server();
		fs.data();
		
	}
}

class f_server {
	
	int port = 8005;
	ServerSocket ss = null;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String ur_msg = null;
	
	public void data () {
		try {
			this.ss = new ServerSocket(this.port);
			this.sk = ss.accept();
			System.out.println("===서 버 가 동 중===");
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			byte data[] = new byte[1024*16];
			int n = this.is.read(data);
//			this.ur_msg = new String(data,0,n); // 채팅
			
			String url = "C:\\java6\\Thread\\src\\copy.jpg";
			/* 
				파일로 클라이언트가 전송을 하므로 서버에서  byte로 값을 받게 된다. 
				getInputStream() -> FileOutputStream 
			*/
			FileOutputStream fs = new FileOutputStream(url);
			
			fs.write(data,0,n);	// 해당 url 자료형으로 저장되도록 함
			fs.flush();
//			System.out.println(this.ur_msg);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}