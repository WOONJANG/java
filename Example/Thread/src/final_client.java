import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class final_client {

	public static void main(String[] args) {

		try {
		client_chat1 c_ch = new client_chat1();
		c_ch.chat_client();
		}catch(Exception a) {
			if(a.getMessage() != null) {
				System.out.println(a);
			}
		}
		
		
	}

}

class client_chat1 {
	String input_ip = "";
	private int input_port = 0;
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
		this.sc = new Scanner(System.in);
		System.out.println("ip �Է�");
		this.input_ip = sc.next();
		System.out.println("port �Է�");
		this.input_port = sc.nextInt();
		try {
//			this.sc = new Scanner(System.in);
//			System.out.println("ID ����");
//			this.mid = sc.nextLine();
			this.sk = new Socket(this.input_ip, this.input_port);

			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();

			this.os.flush();

//			int c = 0;
//			while (true) {
//				if (c == 0) {
					this.msg = "[ " + this.mid + " ] (��) ����";
//				} else {
//					this.sc = new Scanner(System.in);
//					System.out.println("ä�� ���� �Է� : ");
//					this.check = this.sc.nextLine().intern();
//					this.msg = "CLINET - [" + this.mid + "] : " + this.check;
//				}
//				
//				if (this.check == "exit") {
//					this.msg = "CLINET - [" + this.mid + "] : (��)�� ����";
//					this.os.write(this.msg.getBytes());
//					this.os.flush();
//					
//					this.sk.close();	// ��������
//				} else {
//					this.os.write(this.msg.getBytes());
//					this.os.flush();
//				}
//				
//				byte data[] = new byte[1024];
//				int n = this.is.read(data);
//				this.s_msg = new String(data, 0, n);
//				
////				System.out.println(this.s_msg);
//				
//				c++;
//
//			}
		} catch (Exception b) {
			String error = b.getMessage();
			if(error.indexOf("StringIndexOutOfBoundsException") != -1) {
				System.out.println(b.getMessage() + "���� ����");
			}
		}

	}
} 