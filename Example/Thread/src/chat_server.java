import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//server�� �������� ��Ʈ�� ���� 8001 8002
//Exception : bind Exception (prot �浹)
public class chat_server {

	public static void main(String[] args) {
		/* ���� port */
		int port[] = {8001, 8002};
		int ea = port.length;
		openchat oc = null;
		int dw = 0;
		do {
			oc = new openchat(port[dw]);
			oc.start();
			dw++;
		}while(dw < ea);
		
		/* ��Ʈ 1�� */
//		int port8003 = 8003;
//		openchat oc = null;
//		oc = new openchat(port8003);
//		oc.start();
	}
}

class openchat extends Thread {
	String ip ="127.0.0.1";
	int pt = 0;
	ServerSocket ss = null;
	Socket sk = null;
	InputStream is = null;	
	OutputStream os = null;
	String my_msg = null;	// ������
	String ur_msg = null;	// �޴�
			
	public openchat(int p) {
		this.pt = p;
	}
	
	@Override
	public void run() {
		
		try {
			this.ss = new ServerSocket(this.pt);
			while(true) {
			this.sk = this.ss.accept();
			
			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();
			
			/* Client���� �޴� �޼���*/
			byte [] data = new byte[1024];
			int n = is.read(data);
			this.ur_msg = new String(data,0,n);
			
			
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
