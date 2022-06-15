package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		// add(추가), get(데이터로드), remove(삭제), size(index갯수) : ArrayList라는 util method에서 사용하는 부분.
		// Arrays.asList : 로드할 배열 변수를 적용
		// 중요 : add는 일반적으로 데이터 맨 뒤에 추가됨. 단, index번호를 적용 후 값을 실행하면 해당 index번호에 추가됨.
		String member[] = {"이순신", "홍길동", "유관순", "강감찬"};  
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		System.out.println(mb);
		int ea = mb.size();
		System.out.println(ea);
		mb.add("김유신");	// 김유신 추가
		System.out.println(mb);
		mb.remove(1);	// 홍길동 삭제
		System.out.println(mb);
		mb.add(3,"세종대왕");	// 3번에 세종대왕 추가
		System.out.println(mb);
		String check = mb.get(2);	// 
		System.out.println(check);
		
		/*
		 * {15, 22, 37, 8, 11, 19, 41};
		 * 해당 본 데이터 커스텀 하여 다음 결과 처럼 출력 하시오.
		 * {7, 15, 22, 8, 11, 39, 41};
		 */
		
		/* ArrayList에는 int를 사용하지 않음 Integer 사용 */
		Integer numbers[] = {15, 22, 37, 8, 11, 19, 41};
		ArrayList<Integer> nb = new ArrayList<Integer>(Arrays.asList(numbers));
		
		nb.remove(5);
		nb.remove(2);
		nb.add(0,7);
		nb.add(5,39);
		System.out.println(nb);
		
		
	}

}
