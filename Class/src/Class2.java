public class Class2 {
			// package�� ������� ���� ( default ��)
	public static void main(String[] args) {
   		//������ Ŭ���� ���� �� �Լ��� �̿��Ͽ����� ���޹ޱ�

//		inject.oksign(); // ���� �⺻�� �Ǵ� �Լ�. ��, static void�� ���� 
//		inject.test();
//		members.user("�̼���");// ��ȣ�ȿ��ִ� data(���ڰ�)
		members.cal(5, 10); // members class �ȿ� cal ��� �Ϲ� �Լ��� 5�� 10 ���ڰ��� ����.
}

}

class inject {
	//public static void : ���� �⺻�� �Ǵ� �Ϲ� �Լ��� ���մϴ�.
	public static void oksign() {
		String user ="ȫ�浿";
		System.out.println(user);
	}
		public static void test() {
			int aa =1;
			int bb =3;
			int cc = aa+bb;
			System.out.println(cc);
		}
}

class members{
	public static void user(String names) {
//		System.out.println(names);
		String msg = names + "�� ȯ���մϴ�.";
		System.out.println(msg);
	}
	public static void cal(int n, int nn) { //(�ڷ��� �̸�, �ڷ��� �̸�) : ���ڰ� 2���� ����
		int c = n*nn;
		System.out.println(c);
	}
}

