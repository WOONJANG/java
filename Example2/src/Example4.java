public class Example4 {

	public static void main(String[] args) {
		/*
		 * [���빮��] �ΰ��� ���� �ܺ� Ŭ������ �����ϴ�. �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�. ��� ������ ������ �����ϴ�. 3, 10��
		 * ������ �Ǹ� �ΰ��� ���� ���� ���մϴ�. ������ �ܺ� Ŭ�������� �ش� ������� ����ϴµ� �� ���� �� ���� ¦��, Ȧ�� ������ ����ϴ�
		 * extends�� �����ϼ���.
		 */
		int n1 = 3;
		int n2 = 10;
		
		cal2 c1 = new cal2();
		c1.cal_1(n1, n2);
		c1.cal_2();
	}
}

class cal1 {

	protected int a;
	protected int b;
	protected int c;
	public String msg = "";
	
	public void cal_1(int num1, int num2) {

		this.a = num1;
		this.b = num2;
		this.c = num1 + num2;
	}
}

class cal2 extends cal1 {

	public void cal_2() {

		if (this.c % 2 == 0) {
			msg = "¦��";
		}
		else {
			msg = "Ȧ��";
		}
		System.out.println(this.msg);
	}
}
