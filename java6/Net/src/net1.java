import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net1 {

	// UnknownHostException : HOST ������ Ȯ�� ���� ���� ���
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP + network + Address
		// getByName : ������ ������ �ּҸ�.
		InetAddress ia = InetAddress.getByName("naver.com");
//		System.out.println(ia);
//		// ��� : naver.com/223.130.195.200
//		System.out.println(ia.getHostName());	// �����θ�
//		// ��� : naver.com
		System.out.println(ia.getHostAddress());	// DNS�� ����� IP
//		// ��� : 223.130.195.200
		
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");	//getAllByName : �迭�� ����, �������� IP���� Ȯ��
		System.out.println(ia2.length);	// �ش� DNS�� IP ����
//		System.out.println(Arrays.toString(ia2));
		
		int dw = 0;
		do {
			System.out.println(ia2[dw].getHostAddress());
			dw++;
		}while(dw < ia2.length);

	}

}
