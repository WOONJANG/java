import java.util.ArrayList;
import java.util.Arrays;

public class Class4_teacher {

	public static void main(String[] args) {
		
		data_list1 da = new data_list1();
		da.userinput1("����");
	}
}
abstract class v_constuct1 {
	String user_name;
	public abstract void userinput1 (String nm);
}
class data_list1 extends v_constuct1{
	@Override
	public void userinput1(String nm) {
		if(nm == null) {
			System.out.println("����� �̸��� �Է��ϼ���.");
		}
		else {
			this.user_name = nm;
			check1 ck1 = new check1();
			ck1.db1();
		}
	}
	class check1{
		String user_name = data_list1.this.user_name;	// �θ� class���� ���� ���� �ڽ� class�� �̰�
		String data_list1[];	// �ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String>ar1 = null;	//ArrayList Util�� �ʵ忡 ��ü����
		public void db1 () {
			// �ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ������
			this.data_list1 = new String[] {"ȫ�浿","�̼���","������"};
			this.ar1 = new ArrayList<>(Arrays.asList(this.data_list1));	//this�� ó��
			this.compare();	// �������� DB�� ����� ������ ���ϴ� �޼ҵ�
		}
		public void compare() {
			int ea = this.ar1.size();
			int dw = 0;
			boolean bl = false;	// ��� Ȯ�� �۾�
			do {
				if (this.user_name.equals(this.ar1.get(dw))) {
					bl = true;
				}
				dw++;
			}while(dw<ea);
			
			if(bl == true) {
			System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}
			else {
			System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
		}
	}
}