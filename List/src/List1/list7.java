package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*[���빮��]
		 * 
		 * ArraysList or LinkedList �� �߿� ���ϴ� �޼ҵ带 ����.
		 * 2���迭 ���� �Դϴ�.
		 * �ش� ������ ���� ��� ���Ͽ� �ۼ� ���� Ȧ�� ������ Ȯ���Ͻÿ�.
		 * Integer data[][] = {
		 * {10, 20, 30, 40, 50, 60, 70},
		 * {3, 6, 9, 12, 15, 17, 19}
		 * };
		 * 
		 * ���)
		 * 
		 * ������ 361 �̰� Ȧ�� �Դϴ�.
		*/
		Integer data[][] = {
				  {10, 20, 30, 40, 50, 60, 70},
				  {3, 6, 9, 12, 15, 17, 19}
				  };
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(data[0]));	
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(data[1]));
		
		int total=0;
		String msg="";
		for (int f = 0; f < arr1.size(); f++ ) {
//		arr.add(arr2.get(f));
		total += arr1.get(f) + arr2.get(f);
		}
//		System.out.println(total);
		
		if (total%2==0) {
			msg = "¦��";
		}
		else {
			msg = "Ȧ��";
		}
		System.out.println("�� ���� " + total + "�̰� " + msg + " �Դϴ�.");
	}

}
