package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		/*[���빮��]
		 * 
		 * ���Ե� ȸ�� ���� �� ���� �����Ϳ��� 
		 * point�� ���� ������� ����� �̸��� 
		 * �����Ͽ� ��� �մϴ�.
		 * 
		 * [���缺, �ѿ�, ���Ѽ�, ������, �赵��, ���Ѱ�, ȫ�浿, ���, �̼���, ������, ������]
		 * 
		 *  
		*/
		upoint up = new upoint();
		up.setter1();
		

	}

}

abstract class mpoint {
	String arr[][];
	public abstract void setter1();

	public abstract int getter1();

	public abstract void db1();
}

class upoint extends mpoint{
	
	
	@Override
	public void setter1() {
		db1();
		ArrayList<String[]> pl = new ArrayList<String[]>(Arrays.asList(this.arr));
		ArrayList<Integer> pl2 = new ArrayList<Integer>();
		for(int f = 0; f < pl.size(); f++) {
//			System.out.println(pl.get(f)[6]);
			Integer zz = Integer.parseInt(pl.get(f)[6]);
			pl2.add(zz);


		}
		Collections.sort(pl2);
		System.out.println(pl2); // ����Ʈ �ø�����
		
		for(int w=0; w < pl.size(); w++) {
			for(int ww=0; ww<pl2.size();ww++) {
				if(pl == pl2) {
					
				}
			}
		}
	}
	
	@Override
	public int getter1() {
		
		return 0;
	}
	@Override
	public void db1() {
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
