import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client_teacher {

	public static void main(String[] args) {

		try {
			client_chat c_ch = new client_chat();
			c_ch.chat_client();
		} catch (Exception a) {
			if (a.getMessage() != null) {
				System.out.println(a);
			}
		}

	}

}

class client_chat {
	private final String ip = "127.0.0.1";
	private final int port = 8009;
	Socket sk = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null; // ID�� ����
	String msg = null; // ������ �޼���
	String s_msg = null; // SERVER���� ������� �޼���
	String enter_msg = null;
	String check = null;

	public void chat_client() {
		// ���� Stream�� close ���� �ʽ��ϴ�.
		// �ֳ��ϸ�, ��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ���� �˴ϴ�.
		// Socket�� �� �����Ͱ��������̷������ ������ �������� ������ �߻�
		try {

			this.sc = new Scanner(System.in);
			System.out.println("ID ����");
			this.mid = sc.nextLine();
			this.sk = new Socket(this.ip, this.port);

			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();

			this.os.flush();

			int c = 0;
			while (true) {
				if (c == 0) {
					this.msg = "[ " + this.mid + " ] (��) ����";
				} else {
					this.sc = new Scanner(System.in);
					System.out.println("ä�� ���� �Է� : ");
					this.check = this.sc.nextLine().intern();
					this.msg = "CLINET - [" + this.mid + "] : " + this.check;
				}
				
				if (this.check == "exit") {
					this.msg = "CLINET - [" + this.mid + "] : (��)�� ����";
					this.os.write(this.msg.getBytes());
					this.os.flush();
					
					this.sk.close();	// ��������
				} else {
					this.os.write(this.msg.getBytes());
					this.os.flush();
				}
				
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.s_msg = new String(data, 0, n);
				
//				System.out.println(this.s_msg);
				
				c++;

			}
		} catch (Exception b) {
			String error = b.getMessage();
			if(error.indexOf("StringIndexOutOfBoundsException") != -1) {
				System.out.println(b.getMessage() + "���� ����");
			}
		}

	}
}