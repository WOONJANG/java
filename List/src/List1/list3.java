package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 해당 데이터 값 중  데이터는 모두 삭제 해야 합니다.
		 * 고객 데이터 : 
		 * {3, 6, 9, 12, 15}
		 * {2, 4}                  
		 *  
		 * 결과 : {3, 6, 9, 12, 15, 2, 4};
		 */
		
		Integer data1[] = {3, 6, 9, 12, 15};
		Integer data2[] = {2, 4};
		
		//Arrays.sort : 배열 변수 형태에만 적용
		ArrayList<Integer> d1 = new ArrayList<Integer>(Arrays.asList(data1));
		ArrayList<Integer> d2 = new ArrayList<Integer>(Arrays.asList(data2));
		
		for (int f = 0; f < d2.size(); f++ ) {
			d1.add(d2.get(f));
		}
		System.out.println(d1);
		Collections.sort(d1,Collections.reverseOrder());
		System.out.println(d1); // 내림차순 
		Collections.sort(d1);	// ArrayList, LinkedList : sort로 오름차순
		System.out.println(d1);	// 정렬
				}
	}
	



