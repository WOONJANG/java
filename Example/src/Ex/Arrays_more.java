package Ex;

import java.util.ArrayList;
import java.util.Arrays;
//ArrayList 2차 배열 형태(다차원 포함)
public class Arrays_more {

	public static void main(String[] args) {
				
		String member_data[][] = new String[][] { 
			{ "홍길동", "SKT", "010-1236-4879", "45", "종로구", "hong@gmail.com", "2200" },
			{ "김도형", "LG", "010-1267-5879", "25", "강남구", "kim@nate.com", "2100" }
		};
		//String[], Integer[] : 2차 배열 이상
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data)); // 2차배열 이상일 경우 <자료형[]> (자료형 뒤에 [] 작성)
		
		for(int f = 0; f < list.size(); f++) {
		System.out.println(list.get(f)[2]);	// .get(반복문)[index번호]
		}
		
		
		
		
		
		
		
	}

}
