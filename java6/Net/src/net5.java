import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// Socket ��� : Server, Client : �޼���, ���� ���� �ۼ������ (�����)
// HTTP ��� : JSON, Image, ������, ���� �����(��û)�� ����(����)�� �ۼ������ (�ܹ���)
public class net5 {
	// Server
	public static void main(String[] args) {

		System.out.println("SERVER CONNECT");
		int port = 8080;	// ���� �� port��ȣ ���� ( ���� �ߺ� ��ȣ ��� X )
		String msg = "���� ����!!";
		
		try {
			// ������ ���������� �����ϱ� ���ؼ��� ServerSocket�� ���� ��ε� �ϸ� �� ��
				ServerSocket ss = new ServerSocket(port);	// ���½�ų ��Ʈ�� ����
				while(true) {
				System.out.println("ROADING...");
				Socket sc = ss.accept();	// accept() : Ŭ���̾�Ʈ�� �����°��� ����ϴ� ������ ��.
				System.out.println("HOST : ��� ���� ����");
				/* SERVER���� �������� �ޱ� ���� ��� */
				InputStream is = sc.getInputStream();	// Client���� ������ ���� �о����
				/* CLIENT�� ������ ��� */
				OutputStream os = sc.getOutputStream();	// Client�� ���� ����
				byte[] data = new byte[1024];	// Client���� �޴� ���� byte�� ����
				int n = is.read(data);	// �ش簪�� �о����
				String msgclient = new String(data,0,n);	// �ش簪�� �迭�� Ȯ���Ͽ� ���� �̰�
				System.out.println(msgclient);	// �̰��� ���� ��½�Ű�Ե�
				
				Scanner sms = new Scanner(System.in);
				String aws = "[ " + sms.nextLine() + " ]"/*"�ݰ����ϴ�."*/;	// �������� ������ �޼���
				os.write(aws.getBytes());	// Ŭ���̾�Ʈ�� ������ ���� �޸� ����
				os.flush();
				
				is.close();
				os.close();
				sc.close();
			}
		}catch(Exception e) {
			System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ�, ������ ���� �����մϴ�.");
		}
		
		
		
	}

}
