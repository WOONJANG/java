package Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {

		/*[응용문제]
		 * {"hong", "lee", "park", "kim", "kang", "jang", "park", "sa"}
		 * abstract를 사용하여 setter, getter를 무조건 적용.
		 * main에서는 해당 데이터를 외부 class로 전달하고 최종 정보 값만 배열로 생성하여
		 * 출력되도록 합니다.
		 * 단, setter에서 배열 데이터중 4자리 미만에 있는 배열만 새로 생성하여
		 * getter로 값을 받아 메인에서 배열로 출력.
		 */
		String name[] = {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		
		
		list li = new list();
		li.setter(name);
		li.getter();
		System.out.println(li.getter());

		
	}
}
abstract class abs{
	String result[];
	ArrayList<String> em = new ArrayList<>();
	abstract public void setter(String namedata[]);
	abstract public ArrayList<String> getter();
}

class list extends abs{
	@Override
	public void setter(String[] namedata) {
		int ea = namedata.length; // 8
		
		for(int f = 0; f < ea; f++ ) {
				if(namedata[f].length() < 4) {
					em.add(namedata[f]);
				}
		}		
	}
	@Override
	public ArrayList<String> getter() {
		
		return em;
	}
}
