package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * �ش� ������ �� ��  �����ʹ� ��� ���� �ؾ� �մϴ�.
		 * �� ������ : 
		 * {3, 6, 9, 12, 15}
		 * {2, 4}                  
		 *  
		 * ��� : {3, 6, 9, 12, 15, 2, 4};
		 */
		
		Integer data1[] = {3, 6, 9, 12, 15};
		Integer data2[] = {2, 4};
		
		//Arrays.sort : �迭 ���� ���¿��� ����
		ArrayList<Integer> d1 = new ArrayList<Integer>(Arrays.asList(data1));
		ArrayList<Integer> d2 = new ArrayList<Integer>(Arrays.asList(data2));
		
		for (int f = 0; f < d2.size(); f++ ) {
			d1.add(d2.get(f));
		}
		System.out.println(d1);
		Collections.sort(d1,Collections.reverseOrder());
		System.out.println(d1); // �������� 
		Collections.sort(d1);	// ArrayList, LinkedList : sort�� ��������
		System.out.println(d1);	// ����
				}
	}
	



