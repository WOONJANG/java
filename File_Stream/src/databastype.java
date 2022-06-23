import java.util.Scanner;

public class databastype {

	public static void main(String[] args) {
		
		// intertn() : equals를 사용하지않고 ==     ( 부등기호로 사용 가능)
		String data[] = new String[] {"홍길동", "이순신"};
		String data2[] = {"홍길동", "이순신"};
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern();
		String d = new String ("홍길동");
		String e = data[0];

//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		String g = new String(a).intern();
		String h = new String(data[0]).intern();
		String h2 = new String (data[1]).intern();
		String h3 = new String (data[1]).intern();
		String i = data[0];
		
		System.out.println(h2);
		System.out.println(c==g); //true
		System.out.println(data[0] == a); // true
		System.out.println(data[0] == data2[0]); // true
		System.out.println(h==h3); // false "홍길동" == "이순신"
		//new String : 소속이 없는 자유분방한 자료형 (문자, 배열값)
		
//		if (c == e) {
//			System.out.println("ㄷㅇ");
//		}
		

	}

}
