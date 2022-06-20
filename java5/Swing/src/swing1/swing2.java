package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		// ArrayList, LinkedList (�迭��) add, remove, get, size	
		// Map (�迭Ű, �迭��) put, get, size, remove
		// Map�� �迭Ű�� ������� �ϱ� ������ Ű�� ���ؼ� �����͸� Ȯ��.(�ӵ� �ֻ��)
		// ���� Ű�� ���� �������� ����� ������ ����.
		// Ű ���� ���� �ߺ� ��Ű�� ����.
		
		Map<String,String> m = new HashMap<>();
		// hong -> Hash function(HashMap) -> 0x21949CB (�ߺ����� �߻����� ����.)
		m.put("hong", "ȫ�浿");
		m.put("hong", "������");
		m.put("kang", "������");
		System.out.println(m);		// {hong=������, kang=������}
		System.out.println(m.get("hong"));	// ������
		/*
		 * int a = 40;
		 * a = 10; 
		 * �ϸ� a�� 10�� �Ǵ°��̶� ����.
		 */
		System.out.println(m.get("kang"));	// ������
		
		m.put("park", "");	// Ű���� ������ ���� ������ ���� ����.
		if (m.get("park").equals("")) { // ���� park�� �����Ͱ� ��� ���� ���
			m.put("park", "��"); // park�� "��" �̶�� �����͸� ����.
		}
		System.out.println(m.get("park"));	// ��
		
		m.remove("hong"); // ȫ�浿 ���� (Ű �� ���)
		m.put("", "�����ż�");	// ����ִ� Ű�� ����� �� �� ������, Map�� �������� �ùٸ��� ����.
		System.out.println(m.get(""));	// �����ż� 
		System.out.println(m);		// {hong=������, =�����ż�, kang=������, park=��}
		
		// Map : �������� �ڷ����� ����� �� ����.
		Map<String, Integer> m2 = new HashMap<>();
		// Map<String, Object>
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2);
		System.out.println(m2.get("age"));	// 32
		System.out.println(m2.get("level"));	// 5
		
		System.out.println(m2.keySet());	// Ű�� ���[level, age]
		System.out.println(m2.values());	// ���� ��� [5, 32]
		System.out.println(m2.containsKey("tel"));	// tel �̶�� Ű�� �ִ��� Ȯ�� = false (����)
		System.out.println(m2.containsKey("age"));	// age��� Ű Ȯ�� = true (����)
	}

}
