package Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {

		/*[���빮��]
		 * {"hong", "lee", "park", "kim", "kang", "jang", "park", "sa"}
		 * abstract�� ����Ͽ� setter, getter�� ������ ����.
		 * main������ �ش� �����͸� �ܺ� class�� �����ϰ� ���� ���� ���� �迭�� �����Ͽ�
		 * ��µǵ��� �մϴ�.
		 * ��, setter���� �迭 �������� 4�ڸ� �̸��� �ִ� �迭�� ���� �����Ͽ�
		 * getter�� ���� �޾� ���ο��� �迭�� ���.
		 */
		String name[] = {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		
		
		list li = new list();
		li.setter(name);
		li.getter();
		System.out.println(li.getter());

		
	}
}
abstract class abs{
	String result[];
	ArrayList<String> em = new ArrayList<>();
	abstract public void setter(String namedata[]);
	abstract public ArrayList<String> getter();
}

class list extends abs{
	@Override
	public void setter(String[] namedata) {
		int ea = namedata.length; // 8
		
		for(int f = 0; f < ea; f++ ) {
				if(namedata[f].length() < 4) {
					em.add(namedata[f]);
				}
		}		
	}
	@Override
	public ArrayList<String> getter() {
		
		return em;
	}
}
