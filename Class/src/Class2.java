
public class Class2 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ���� class�� �̿��Ͽ� �ڽ� class�� ������� ����ϴ� ���μ��� ����
		 * class�� 2��
		 * �θ� class = mother
		 * �ڽ� class = child
		 * main Ŭ�������� mother Ŭ������ ���� ����
		 * 30 50 ���ڰ��� �����մϴ�
		 * child���� �θ� Ŭ������ �ִ� ���� �޾�
		 * �ΰ��� ���ڸ� ���� ��� ���� ����Ͻÿ�.
		 *  
		*/
		
		mother mom = new mother();
		mom.m(30, 50);
		mother.child mc = mom.new child();
		mc.ch();

	}

}

class mother{
	int aa, bb;
	public void m (int a, int b) {
		this.aa = a;
		this.bb = b;
		
	}

	class child{
		int aa = mother.this.aa;
		int bb = mother.this.bb;
		public void ch() {
			int cc = this.aa*this.bb;
			System.out.println(cc);
		}
	}
}