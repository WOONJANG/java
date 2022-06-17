package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 
		 * 가입된 회원 정보 중 현재 데이터에서 
		 * point가 적은 순서대로 사용자 이름을 
		 * 정렬하여 출력 합니다.
		 * 
		 * [정재성, 한울, 서한솔, 강은형, 김도형, 서한결, 홍길동, 김실, 이선영, 차은우, 전재혁]
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
		System.out.println(pl2); // 포인트 올림차순
		
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
