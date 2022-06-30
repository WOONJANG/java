import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// crawling 사용
public class net3_3 {

	public static void main(String[] args) throws Exception {
		
		String url = "https://examplewoon.netlify.app";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
//		System.out.println(urls.getProtocol());	// 프로토콜 https
//		System.out.println(urls.getPort());	// 포트번호 443
//		System.out.println(urls.getFile());	// 접속 파일명 /login
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF8");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream fs = new FileOutputStream("index.html");
		byte html[] = new byte[1024*100];
		String str = "";
		do {
			System.out.println(str);
			fs.write(html,0,size);
		}while((str=br.readLine()) != null);
		br.close();
		fs.close();
		fs.flush();
		
	}

}
