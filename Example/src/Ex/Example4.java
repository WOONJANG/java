package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example4 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * 
		 * ���Ե� ��� ȸ���� ����Ʈ �� ���� ���Ͻÿ�.
		 * ��, abstract�� ���.
		 * 
		 * ��� : "ȸ�� ��ü�� ����Ʈ �հ�� : 34390 �Դϴ�"
		 * */
		point_plus pp = new point_plus();
		pp.setter2();
		int total = pp.getter2();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ�� : " + total + " �Դϴ�");

	}

}

abstract class point_cal {
	String arr[][];
	public abstract void setter2();

	public abstract int getter2();

	public abstract void db2();
}

class point_plus extends point_cal{
	int ea = 0;
	int total = 0;
	
	   @Override
	   public void setter2() {
	      db2();
	      ArrayList<String[]> ar1 = new ArrayList<String[]>(Arrays.asList(this.arr));  //arraylist�� �迭
	      ArrayList<Integer> em = new ArrayList<>(); // ��迭
	      
	      for(int f = 0; f<ar1.size();f++) {
	         Integer change = Integer.parseInt(ar1.get(f)[6]);
	         em.add(Integer.parseInt(ar1.get(f)[6]));
	      }
	      Collections.sort(em); // ����Ʈ �ø�����
//	      System.out.println(em);
	      for (int ff = 0; ff<=arr.length; ff++) {
	         for(int fff=0; fff<=arr[0].length; fff++) {
	            if(ar1.get(ff)[6].equals(Integer.toString(Integer.parseInt(ar1.get(fff)[6])))) {
	                  System.out.println(ar1);
	            }
	         }
	      }
	   }

	   

	
	@Override
	public int getter2() {
		
		return this.total;
	}
	@Override
	public void db2() {
		this.arr = new String[][] { 
			{ "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
			{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" },
			{ "���Ѽ�", "LG", "010-1267-4112", "37", "���α�", "soso4112@naver.com", "1200" },
			{ "���缺", "SKT", "010-3221-8871", "41", "������", "jsung_kks@naver.com", "700" },
			{ "�ѿ�", "KT", "010-2455-4879", "22", "��õ��", "han1004@nate.com", "920" },
			{ "������", "SKT", "010-3770-4009", "34", "���α�", "kans32@gmail.com", "1250" },
			{ "���", "KT", "010-1606-3137", "20", "����", "kimsil_love@nate.com", "4505" },
			{ "���Ѱ�", "SKT", "010-3412-0902", "31", "��õ��", "hanso12@nate.com", "2125" },
			{ "������", "LG", "010-4557-8282", "30", "����", "jehyuk@naver.com", "8160" },
			{ "�̼���", "KT", "010-3738-4800", "55", "������", "sunyoung@nate.com", "4510" },
			{ "������", "SKT", "010-5242-0879", "42", "������", "chreey@gmail.com", "6720" } 
		};
		
	}
}
