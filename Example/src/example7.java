import java.util.Arrays;

public class example7 {

	public static void main(String[] args) {

		/*
		 * ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 * [data]
		 * {"ȫ�浿", "�հ�"},
		 * {"�̼���", "�հ�"},
		 * {"������", "���հ�"},
		 * {"������", "�հ�"},
		 * {"������", "���հ�"},
		 * {"�庸��", "���հ�"}
		 * 
		 * ������ �迭 �����̸�, �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 * ��, �迭 ���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 * ��� - ȫ�浿, �̼���, ������
		 */

		arrays.arr();
		
	}

}
class arrays {
	public static void arr () {
		String user[][] = 		{  
				{"ȫ�浿", "�հ�"},
				{"�̼���", "�հ�"},
				{"������", "���հ�"},
				{"������", "�հ�"},
				{"������", "���հ�"},
				{"�庸��", "���հ�"}
		};
		int nm = user.length; //6
		int pf = user[0].length;//2
//		String str = " ";
		int f;
		for(f=0;f<nm;f++) {
			if(user[f][1].equals("�հ�")) {
//				str = str.trim();
//				String userin [][] = str.split("\\s+");
//				System.out.println(Arrays.toString(userin[f][0]));
				System.out.printf("%s �� %s �Դϴ�.\n", user[f][0], user[f][1]);
			}
		}
		
	}
}