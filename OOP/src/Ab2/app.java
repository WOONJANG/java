package Ab2;

public class app {

	public static void main(String[] args) {
		
//		// (�ڽ�) = (�θ�)
//		members mb = new members();
//		mb.oop1();
//		mb.oop2();

		//(�θ�) = (�ڽ�) => interface �������� ���� �� Override�� ȣ�� (����ȯ)
//		members mb = new members(); // �ڽ� class ����
//		app_data2 ap = mb;	// interface ���� (class���� interface �������� ��ȯ)
		
		app_data2 ap = new members();
		members mb2 = (members)ap; // interface���� class�� ��ȯ
		mb2.oop1();
		ap.oop1();
	}

}

/*
 * class members implements app_data1 { 
 * app_data1�� ������ �ڷ��� �����ϴ� ��� 
 * }
 */

class members implements app_data2 {
	@Override
	public void oop1() {
		System.out.println("test");
	}
	@Override
	public void oop2() {
		System.out.println("test2");
	}
	
	public void opp1() {
		System.out.println("test3");
	}
}