package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * �ش� ������ �� �� �޸�� �����ʹ� ��� ���� �ؾ� �մϴ�.
		 * �� ������ : {"�����", "������", "��â��",  "�ڵ���",  "�̰���",  "�����", "������"}  
		 * ��� : {�����, ������};
		 */
		
//		String cus[] = {"�����", "������", "��â��",  "�ڵ���",  "�̰���",  "�����", "������"};
//		
//		ArrayList<String> arr = new ArrayList<>(Arrays.asList(cus));
////		System.out.println(arr);
//		int ea = arr.size();
//		int w = 0;
//		while (w<ea) {
//			int ea2 = arr.size();	// node�� ������ �ٽ� �ľ�
//			int ww = 0;
//			while (ww <= 0) {
//				
//				if(!arr.get(ww).equals("�����") && !arr.get(ww).equals("������")) {
//					
//					arr.remove(0);
//					
//					System.out.println(arr);
//			}
//			}
//			w++;
//		}
		
		/*[���빮��]
		 * �ش� ������ �� �� ¦�� �����ʹ� ��� ���� �ؾ� �մϴ�.
		 * �� ������ : {}  
		 * ��� : {7, 1, 11, 37, 41};
		 */
		
		Integer num [] = {10, 7, 6, 1, 11, 37, 41, 22};
		ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(num));
		
		int eaea = res.size(); // 8
		int z = 0;
		do {
			int eaea2 = res.size(); 
			int zz = 0;
			do {
				if(res.get(zz)%2==0) {
					res.remove(zz);
					break;
				}
				zz++;
			}while(zz < eaea2);
			z++;
		}while(z < eaea);
		System.out.println(res);
	}
	
}


