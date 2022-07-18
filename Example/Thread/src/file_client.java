import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class file_client {

	public static void main(String[] args) {
		
		f_client fc = new f_client();
		fc.files();

		
	}
}

class f_client {
	int port = 8005;
	String ip = "127.0.0.1";
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {
		
		try {
			this.sk = new Socket(this.ip, this.port);
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			/* 첨부파일 byte 배열로 변경함 */
			String url = "C:\\java6\\Thread\\src\\lion3.jpg";
			// 클라이언트에서 보낸 이미지, 동영상, 음악, 문서 등등 보낸 형식
			FileInputStream fs = new FileInputStream(url);
//			System.out.println(fs.read());	// 1 pixel size check
			BufferedInputStream bis = new BufferedInputStream(fs);
			/* 첨부파일 전송 형태 */
			byte img[] = new byte[bis.available()];
//			System.out.println(bis.read(img));
			int fordata = 0;
			while ((fordata = bis.read(img))!=-1) {
				
				this.os.write(img,0,fordata);
			}
//			this.os.write(url.getBytes());
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}