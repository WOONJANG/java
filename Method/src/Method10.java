
public class Method10 {
	// ���ڿ� ���Խ� �ڵ�
	public static void main(String[] args) {
		// setter : ����ڰ� �Է��� �� �Ǵ� ���İ��� �����ϴ� �޼ҵ�.
		// getter : ������ ��ģ �� return���� ���� ������ �޼ҵ�.
		met m = new met();
		m.setUser_name("ȫ�浿");
		m.setUser_pw("a1234");
		m.setUser_email("test@gmail.com");
		/*
		System.out.println(m.getUser_name());
		System.out.println(m.getUser_pw());
		System.out.println(m.getUser_email());
		*/
		// replace  : ġȯ������ �Լ� ( ���� �� ���ڿ� ����)
		//replaceALL : replace���� ���� ������ ġȯ������ �Լ� (java���� replace�� ����.
		String str = "ȫ�浿�� ȯ���մϴ�."; 
		String str2 = str.replace("��", "����");
		System.out.println(str2);
		String nm = "ȫ �� ��";
		String rnm = nm.replace(" ", ""); // ���� ����
		System.out.println(rnm);
		String nm3 = "�ڹٰ� ��¥ ����� �ڹٿ�";
		String rnm3 = nm3.replace("�ڹ�", "java");
		System.out.println(rnm3);
	}

}
class met {
	private String user_name;
	private String user_pw;
	private String user_email;
	
	public String getUser_name() {
		return this.user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pw() {
		return this.user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_email() {
		return this.user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
}
