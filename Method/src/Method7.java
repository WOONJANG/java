import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		
		apink ap = new apink ("ȫ�浿", 25, "test@gmail.com", -1000);

	//	ap.names();
	//	System.out.println(ap.nm2);
	System.out.println(ap.data1()); // ȫ�浿
	System.out.println(ap.data3());
	System.out.println(ap.data4()); // 0 (���ǹ�)
	}

}

class apink {
	// private ������ class �ʵ忡�� �����ؾ� �Ѵ�.
//	String nm2;
	private String nm;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	
	public void names() {
		if(this.nm == "ȫ�浿") { // ȫ�浿���� ������ hong���� ����
			this.nm = "hong";
			String e[] = this.email.split("@"); // email �߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
			this.email_cp = e[1];
		}
	}
	
	
	public apink (String nm1, int age2, String email3, int point4) { //private
		// setter ����
		this.nm = nm1; 
		this.email = email3;
		if(point4 < 0 ) {
			this.point = 0;
		}
		else {
			this.point = point4;
		}
		names();
	}
	
	public String data1() {
		return this.nm; // return �� �������� ����ϴ� �ڵ�.
		// return �ؿ� �ڵ�� ��� ������ �߻��ϰ� �ȴ�.
	}
	public String data3() {
		return this.email_cp;
	}
	public int data4() {
		// getter ����
		return this.point;
	}
}