package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 
		 * 가입된 모든 회원의 포인트 총 합을 구하시오.
		 * 단, abstract를 사용.
		 * 
		 * 결과 : "회원 전체의 포인트 합계는 : 34390 입니다"
		 * */
		point_plus pp = new point_plus();
		pp.setter2();
		int total = pp.getter2();
		System.out.println("회원 전체의 포인트 합계는 : " + total + " 입니다");

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
			{ "홍길동", "SKT", "010-1236-4879", "45", "종로구", "hong@gmail.com", "2200" },
			{ "김도형", "LG", "010-1267-5879", "25", "강남구", "kim@nate.com", "2100" },
			{ "서한솔", "LG", "010-1267-4112", "37", "종로구", "soso4112@naver.com", "1200" },
			{ "정재성", "SKT", "010-3221-8871", "41", "강남구", "jsung_kks@naver.com", "700" },
			{ "한울", "KT", "010-2455-4879", "22", "금천구", "han1004@nate.com", "920" },
			{ "강은형", "SKT", "010-3770-4009", "34", "종로구", "kans32@gmail.com", "1250" },
			{ "김실", "KT", "010-1606-3137", "20", "은평구", "kimsil_love@nate.com", "4505" },
			{ "서한결", "SKT", "010-3412-0902", "31", "금천구", "hanso12@nate.com", "2125" },
			{ "정재혁", "LG", "010-4557-8282", "30", "은평구", "jehyuk@naver.com", "8160" },
			{ "이선영", "KT", "010-3738-4800", "55", "강서구", "sunyoung@nate.com", "4510" },
			{ "차은우", "SKT", "010-5242-0879", "42", "강남구", "chreey@gmail.com", "6720" } 
		};
		
	}
}
