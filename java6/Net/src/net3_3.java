import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// crawling ���
public class net3_3 {

	public static void main(String[] args) throws Exception {
		
		String url = "https://examplewoon.netlify.app";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
//		System.out.println(urls.getProtocol());	// �������� https
//		System.out.println(urls.getPort());	// ��Ʈ��ȣ 443
//		System.out.println(urls.getFile());	// ���� ���ϸ� /login
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
