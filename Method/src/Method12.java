
public class Method12 {

	public static void main(String[] args) {
		// extends�� ����� �ڽ� class�� load�ϰ� �Ǹ� �ڵ����� �θ� class�� �Բ� ����� �����ϴ�.
		bbox2 bx = new bbox2();
		bx.b2("�̼���");
		System.out.println(bx.abc());
		

	}

}
class bbox { // �⺻ �ܺ� class1 main���� �ʿ��� ������ üũ
	protected String user_info;
	private String user_pw;
	public String user_pw2;
	public String user_pw3;
	
	public bbox() {
	//	this.user_info = "ȫ�浿";
		this.user_pw = "abcd";
		this.user_pw2 = "abcd";
		this.user_pw3 = this.user_pw.replace("abcd","kl2@3$12n");
		
	}
	public String abc () {
		String email = "hong@gmail.com";
		return  email;
	}
	
}

class bbox2 extends bbox{ // bbox�� ���� ��� ������ bbox2�� �����ϰ� ��.
	// ��, bbox�߿��� private���� ���õ� ���� �������� ����.
	public void b2(String nm){ 
		//main class���� bbox2�� �ε� ��
		// �ش� ���� �μ����� �����Ͽ� bbox class�� �ִ� �ʵ�� �� user_info�� ���� �ϰ� �Ǵ� ����.
		this.user_info = nm;
		System.out.println(this.user_info);
//		System.out.println(this.user_pw); //private���� �Ұ�
		System.out.println(this.user_pw2); // public �̿��� ����
		System.out.println(this.user_pw3);
	}
}