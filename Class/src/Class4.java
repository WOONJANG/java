import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : {"ȫ�浿", "�̼���", "������"};
		 * ������ �����Ͱ� �ֽ��ϴ�.
		 * ���� class���� ���ڸ� �ϳ� ���� �մϴ�.
		 * ��, ���ڰ� null�� ���� �� ������, �迭 �����Ϳ� ���� ���� "������"�̶�� ���� ���� �ֽ��ϴ�.
		 * �ܺ� class�� : data_list �̸�
		 * �߻� class�� : v_construct �Դϴ�.
		 * �ܺ� class�ȿ� ���� class �� : check
		 * �Դϴ�.
		 * 
		 * [�������]
		 * main class���� "������"�� ������ ���
		 * ���� class���� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ��� ���
		 * main class���� "ȫ�浿", "�̼���", "������"�� ������ ���
		 * ���� class���� "�ش� ����ڰ� �ֽ��ϴ�." ��� ���
		 * ��, ArrayList�� �迭�� load �Ͻʽÿ�. 
		*/
		
		
		data_list v = new data_list();
		v.datalist_method(null);
		data_list.cal vc = v.new cal();
		vc.check();
	}
}

abstract class v_construct{
	public String u_name;
	abstract void datalist_method(String user);
	String arr[] = {"ȫ�浿", "�̼���", "������"};	// �迭 ������
	ArrayList<String> ar = new ArrayList<>(Arrays.asList(arr)); // ArrayList�� Array data�� ar �̸����� load
}	
class data_list extends v_construct{
		@Override
		public void datalist_method(String user) {
			this.u_name = user;  // user = v.datalist_method(null);
		}
	class cal{
		String msg="";
		public void check() {
			for(int f = 0; f < ar.size(); f++) {
			if(null == u_name) {
				this.msg ="����� �̸��� �Է��ϼ���.";	
			}
			else {
				if(ar.get(f) != u_name) {	// ar �޾ƿ� data�� f�ݺ� �� u_name �� �ٸ��� 
					this.msg = "�ش� ����ڴ� �����ڰ� �ƴմϴ�.";
				}
				else {
					this.msg = "�ش� ����ڰ� �ֽ��ϴ�.";
					break;
				}
			}
			}
			System.out.println(this.msg);
		}
	}
}