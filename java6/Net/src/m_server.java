import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {

		chatroom cr = new chatroom();
	}

}

class chatroom {	// 기본사항 -> 각 접속마다 thread를 분할

	
	static final int port = 9009;	// Thread에서 공용으로 사용하기 위함
	ServerSocket ss = null;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public chatroom() {
		try {
			this.ss = new ServerSocket(this.port);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("****멀티 채팅 시작!!****");
		while(true) {
			try {
				this.sk = this.ss.accept();	// client 접속 허가
				chat_thread ct = new chat_thread(sk);
				Thread t = new Thread(ct);
				t.start();
			}catch(Exception ee) {
				System.out.println(ee);
			}
		}
	}
}

class chat_thread implements Runnable{
	
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	Scanner sc = null;
	String m_msg = null;	// 보내는
	String u_msg = null;	// 받는
	// 배열을 메모리에 기억시킴 (누적)
	// 접속자 발생시Thread가 새롭게 생성 되므로 static에 올리지 않으면
	// 누적없이 계속 초기화 되어버림
	static ArrayList<Socket> user = new ArrayList<Socket>();	// 접속자
	
	public chat_thread(Socket s) {
		this.sk = s; // port 번호 (34 line)
		this.user.add(this.sk);
		try {
			System.out.println("채팅 참여 하셨습니다.");
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		}catch(Exception e) {
			System.out.println("클라이언트 접속 정보가 올바르지 않습니다.");
		}
	}
	@Override
	public void run() {

		try {
				byte data[] = new byte[4096];
				int n = this.is.read(data);			
				this.u_msg = new String(data, 0, n);
				System.out.println(this.u_msg);
				
			while(true) {
				System.out.println(this.user.size());
				this.sc = new Scanner(System.in);
				System.out.println("보낼 메세지를 입력하세요.");
				this.u_msg = sc.nextLine();
				
				/* 배열에 있는 vport에 대한 정보를 담은 수 만큼 반복을 합니다, */
				for (int j = 0; j < this.user.size(); j++) {
					// 배열에 있는 사용자 vport로 전송을 하게 됩니다.
					OutputStream all = this.user.get(j).getOutputStream();
					// 사용자별로 Stream을 생성
					all.write(this.u_msg.getBytes()); // 전송
					all.flush(); // 해당 전송 메세지 비우기
				}
			}
		}catch(Exception ee) {
			System.out.println("클라이언트가 종료되었습니다.");
		}finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
			}catch(Exception eee) {	}
		}
	}
}