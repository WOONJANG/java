import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class final_server {

	public static void main(String[] args) {
		
		finalserver fnsv = new finalserver();
		fnsv.finalserver();
		Scanner sc = new Scanner(System.in);
		int port = 0;
		System.out.println("포트 입력");
		int input_port = sc.nextInt();
	}
}

class finalserver {
	String ip ="127.0.0.1";
	int pt = 0;
	ServerSocket ss = null;
	Socket sk = null;
	InputStream is = null;	
	OutputStream os = null;
	String my_msg = null;	// 보내는
	String ur_msg = null;	// 받는
			
	public void finalserver() {
		
	
	
		
		try {
			this.ss = new ServerSocket(this.pt);
			while(true) {
			this.sk = this.ss.accept();
			
			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();
						
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
