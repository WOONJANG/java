
public class Class7 {

	public static void main(String[] args) {
		//Class�� �⺻ �޼ҵ� ��ü �ʵ尪 ����.
		String mid = "hong";
		String mname = "ȫ�浿";
		java1 jv1 = new java1(mid, mname);
//		jv1.java2(); //= test
	}

}

class java1{
	//java1 class�� main���� ��ü ���� �� �ν��Ͻ��� �����ϸ� �ٷ� �۵��ϴ� class �⺻ �޼ҵ�.
	public java1 (String a, String b) { //class�� �⺻���� ����ϴ� �޼ҵ� (class��� ���� �ؾ� ��.)
		System.out.println(a+b);
		java2();	// = test //void �޼ҵ� �ٷ� ȣ�� �� �� �ִ�.
	}
	public void java2() {
		System.out.println("test");
	}
}