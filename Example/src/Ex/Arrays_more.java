package Ex;

import java.util.ArrayList;
import java.util.Arrays;
//ArrayList 2�� �迭 ����(������ ����)
public class Arrays_more {

	public static void main(String[] args) {
				
		String member_data[][] = new String[][] { 
			{ "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
			{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" }
		};
		//String[], Integer[] : 2�� �迭 �̻�
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data)); // 2���迭 �̻��� ��� <�ڷ���[]> (�ڷ��� �ڿ� [] �ۼ�)
		
		for(int f = 0; f < list.size(); f++) {
		System.out.println(list.get(f)[2]);	// .get(�ݺ���)[index��ȣ]
		}
		
		
		
		
		
		
		
	}

}
