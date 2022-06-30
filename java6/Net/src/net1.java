import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net1 {

	// UnknownHostException : HOST 정보가 확인 되지 않을 경우
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP + network + Address
		// getByName : 접속할 도메인 주소명.
		InetAddress ia = InetAddress.getByName("naver.com");
//		System.out.println(ia);
//		// 출력 : naver.com/223.130.195.200
//		System.out.println(ia.getHostName());	// 도메인명
//		// 출력 : naver.com
		System.out.println(ia.getHostAddress());	// DNS에 연결된 IP
//		// 출력 : 223.130.195.200
		
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");	//getAllByName : 배열로 구성, 도메인의 IP정보 확인
		System.out.println(ia2.length);	// 해당 DNS에 IP 갯수
//		System.out.println(Arrays.toString(ia2));
		
		int dw = 0;
		do {
			System.out.println(ia2[dw].getHostAddress());
			dw++;
		}while(dw < ia2.length);

	}

}
