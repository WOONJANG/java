package Ex;

import java.util.ArrayList;
import java.util.Arrays;

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
		ArrayList<String[]> point_list = new ArrayList<String[]>(Arrays.asList(this.arr));
		this.ea = point_list.size();
		for(int f = 0; f < ea; f++) {
//		System.out.println(point_list.get(f)[6]);
		int change = Integer.parseInt(point_list.get(f)[6]);
		this.total += change;
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