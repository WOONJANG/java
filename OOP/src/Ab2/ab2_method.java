package Ab2;
import Ab.method_1; // package Ab���� main class�� �ε���

public class ab2_method extends Ab.method_1 {

	public static void main(String[] args) {
		//@Override
		Ab.method_1 at = new Ab.method_1();
		at.recall(); // public �޼ҵ� ����
		at.name(); //protected �޼ҵ� ����
		at.main(args); // main ����
	}

}