package Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Example8_teacher {
	public static void main(String[] args) {

		/*[���빮��]
		 * {"hong", "lee", "park", "kim", "kang", "jang", "park", "sa"}
		 * abstract�� ����Ͽ� setter, getter�� ������ ����.
		 * main������ �ش� �����͸� �ܺ� class�� �����ϰ� ���� ���� ���� �迭�� �����Ͽ�
		 * ��µǵ��� �մϴ�.
		 * ��, setter���� �迭 �������� 4�ڸ� �̸��� �ִ� �迭�� ���� �����Ͽ�
		 * getter�� ���� �޾� ���ο��� �迭�� ���.
		 */

		newclass nc = new newclass();
		nc.setter();
		ArrayList<String> aa = nc.getter();
		System.out.println(aa);

		
	}
}

class newclass{
	ArrayList<String> em = new ArrayList<>();
	public void setter() {
		String a[] = {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(a));
		for(String name : ar) {
			if(name.length() < 4) {
				em.add(name);
			}
			}
	}
	
	public ArrayList<String> getter() {

		return em;
	}
}
