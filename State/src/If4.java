import java.util.Scanner; 
//import : java�� �ִ� ������ �ε� �Ҷ� ����ϴ� ���
//export : java�� �ִ� ������ ������ ������ �� �ִ� ���
//java.util : ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε��ϰ� �ȴ�.
//java.util : ��Ű���� �׳� ������� �� �ϸ�, new�� �Ҵ��Ͽ�  �����ڸ� ����ؾ��Ѵ�. ��, �ش� �ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �ȵȴ�.
public class If4 {

	public static void main(String[] args) {
		
		//new : ��ü�� �����ϴ°��� �� ��.
		Scanner a = new Scanner(System.in);
		//System.in(�Է�) ! = System.out(���)
		System.out.println("���̵� �Է��ϼ���");
		
		String mid = a.next();
		//next() : ����ڰ� �Է��ϴ� ���¸� ���Ѵ�. (����, ���ڸ� �Է� �޴� ����)
		System.out.println(mid);
		a.close();

	}

}
