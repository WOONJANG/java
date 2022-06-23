package Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Example8_teacher {
	public static void main(String[] args) {

		/*[응용문제]
		 * {"hong", "lee", "park", "kim", "kang", "jang", "park", "sa"}
		 * abstract를 사용하여 setter, getter를 무조건 적용.
		 * main에서는 해당 데이터를 외부 class로 전달하고 최종 정보 값만 배열로 생성하여
		 * 출력되도록 합니다.
		 * 단, setter에서 배열 데이터중 4자리 미만에 있는 배열만 새로 생성하여
		 * getter로 값을 받아 메인에서 배열로 출력.
		 */

		newclass nc = new newclass();
		nc.setter();
		ArrayList<String> aa = nc.getter();
		System.out.println(aa);

		
	}
}

class newclass{
	ArrayList<String> em = new ArrayList<>();
	public void setter() {
		String a[] = {"hong", "lee", "park", "kim", "kang", "jang", "ha", "sa"};
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(a));
		for(String name : ar) {
			if(name.length() < 4) {
				em.add(name);
			}
			}
	}
	
	public ArrayList<String> getter() {

		return em;
	}
}
