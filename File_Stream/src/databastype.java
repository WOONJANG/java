import java.util.Scanner;

public class databastype {

	public static void main(String[] args) {
		
		// intertn() : equals�� ��������ʰ� ==     ( �ε��ȣ�� ��� ����)
		String data[] = new String[] {"ȫ�浿", "�̼���"};
		String data2[] = {"ȫ�浿", "�̼���"};
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();
		String d = new String ("ȫ�浿");
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
		System.out.println(h==h3); // false "ȫ�浿" == "�̼���"
		//new String : �Ҽ��� ���� �����й��� �ڷ��� (����, �迭��)
		
//		if (c == e) {
//			System.out.println("����");
//		}
		

	}

}
