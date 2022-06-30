import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

//크롤링 2
public class net4 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("크롤링 할 url");
		String page = sc.next();
		System.out.println("url title .html");
		String title = sc.next();
		sc.close();
		URL url = new URL(page);
		/* Stream을 사용하면 read만 사용 (byte 이용), Reader 사용하면 readLine 사용가능 (String), flush() 사용형태 BufferedOutputStream */
		InputStream is = url.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);	//배열 byte[]
//		System.out.println(bis.read());	// 제대로 왔는지 확인
		byte html[] = new byte[1024];
//		FileOutputStream fos = new FileOutputStream(title + ".html");	// 배열값 로드해서 저장	// 아래와 같음
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(title + ".html"));
		int s = 0;
		while((s = bis.read(html)) != -1) {	// Stream은 read에 byte명을 입력
//			fos.write(html, 0, s);	// 아래와 같음
			bos.write(html, 0, s);
		}
		is.close();
		bis.close();
//		fos.close();	// 아래와 같음
		bos.close();
	}

}
