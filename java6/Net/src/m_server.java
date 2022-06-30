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

class chatroom {	// �⺻���� -> �� ���Ӹ��� thread�� ����

	
	static final int port = 9009;	// Thread���� �������� ����ϱ� ����
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
		System.out.println("****��Ƽ ä�� ����!!****");
		while(true) {
			try {
				this.sk = this.ss.accept();	// client ���� �㰡
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
	String m_msg = null;	// ������
	String u_msg = null;	// �޴�
	// �迭�� �޸𸮿� ����Ŵ (����)
	// ������ �߻���Thread�� ���Ӱ� ���� �ǹǷ� static�� �ø��� ������
	// �������� ��� �ʱ�ȭ �Ǿ����
	static ArrayList<Socket> user = new ArrayList<Socket>();	// ������
	
	public chat_thread(Socket s) {
		this.sk = s; // port ��ȣ (34 line)
		this.user.add(this.sk);
		try {
			System.out.println("ä�� ���� �ϼ̽��ϴ�.");
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		}catch(Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���� ������ �ùٸ��� �ʽ��ϴ�.");
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
				System.out.println("���� �޼����� �Է��ϼ���.");
				this.u_msg = sc.nextLine();
				
				/* �迭�� �ִ� vport�� ���� ������ ���� �� ��ŭ �ݺ��� �մϴ�, */
				for (int j = 0; j < this.user.size(); j++) {
					// �迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�.
					OutputStream all = this.user.get(j).getOutputStream();
					// ����ں��� Stream�� ����
					all.write(this.u_msg.getBytes()); // ����
					all.flush(); // �ش� ���� �޼��� ����
				}
			}
		}catch(Exception ee) {
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
		}finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
			}catch(Exception eee) {	}
		}
	}
}