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
			System.out.println("===�� �� �� �� ��===");
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			byte data[] = new byte[1024*16];
			int n = this.is.read(data);
//			this.ur_msg = new String(data,0,n); // ä��
			
			String url = "C:\\java6\\Thread\\src\\copy.jpg";
			/* 
				���Ϸ� Ŭ���̾�Ʈ�� ������ �ϹǷ� ��������  byte�� ���� �ް� �ȴ�. 
				getInputStream() -> FileOutputStream 
			*/
			FileOutputStream fs = new FileOutputStream(url);
			
			fs.write(data,0,n);	// �ش� url �ڷ������� ����ǵ��� ��
			fs.flush();
//			System.out.println(this.ur_msg);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}