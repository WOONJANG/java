package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		// add(�߰�), get(�����ͷε�), remove(����), size(index����) : ArrayList��� util method���� ����ϴ� �κ�.
		// Arrays.asList : �ε��� �迭 ������ ����
		// �߿� : add�� �Ϲ������� ������ �� �ڿ� �߰���. ��, index��ȣ�� ���� �� ���� �����ϸ� �ش� index��ȣ�� �߰���.
		String member[] = {"�̼���", "ȫ�浿", "������", "������"};  
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		System.out.println(mb);
		int ea = mb.size();
		System.out.println(ea);
		mb.add("������");	// ������ �߰�
		System.out.println(mb);
		mb.remove(1);	// ȫ�浿 ����
		System.out.println(mb);
		mb.add(3,"�������");	// 3���� ������� �߰�
		System.out.println(mb);
		String check = mb.get(2);	// 
		System.out.println(check);
		
		/*
		 * {15, 22, 37, 8, 11, 19, 41};
		 * �ش� �� ������ Ŀ���� �Ͽ� ���� ��� ó�� ��� �Ͻÿ�.
		 * {7, 15, 22, 8, 11, 39, 41};
		 */
		
		/* ArrayList���� int�� ������� ���� Integer ��� */
		Integer numbers[] = {15, 22, 37, 8, 11, 19, 41};
		ArrayList<Integer> nb = new ArrayList<Integer>(Arrays.asList(numbers));
		
		nb.remove(5);
		nb.remove(2);
		nb.add(0,7);
		nb.add(5,39);
		System.out.println(nb);
		
		
	}

}
