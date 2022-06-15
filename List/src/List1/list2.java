package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 해당 데이터 값 중 휴면고객 데이터는 모두 삭제 해야 합니다.
		 * 고객 데이터 : {"김수빈", "김정현", "김창순",  "박도현",  "이경훈",  "정재욱", "하윤성"}  
		 * 결과 : {정재욱, 하윤성};
		 */
		
//		String cus[] = {"김수빈", "김정현", "김창순",  "박도현",  "이경훈",  "정재욱", "하윤성"};
//		
//		ArrayList<String> arr = new ArrayList<>(Arrays.asList(cus));
////		System.out.println(arr);
//		int ea = arr.size();
//		int w = 0;
//		while (w<ea) {
//			int ea2 = arr.size();	// node의 갯수를 다시 파악
//			int ww = 0;
//			while (ww <= 0) {
//				
//				if(!arr.get(ww).equals("정재욱") && !arr.get(ww).equals("하윤성")) {
//					
//					arr.remove(0);
//					
//					System.out.println(arr);
//			}
//			}
//			w++;
//		}
		
		/*[응용문제]
		 * 해당 데이터 값 중 짝수 데이터는 모두 삭제 해야 합니다.
		 * 고객 데이터 : {}  
		 * 결과 : {7, 1, 11, 37, 41};
		 */
		
		Integer num [] = {10, 7, 6, 1, 11, 37, 41, 22};
		ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(num));
		
		int eaea = res.size(); // 8
		int z = 0;
		do {
			int eaea2 = res.size(); 
			int zz = 0;
			do {
				if(res.get(zz)%2==0) {
					res.remove(zz);
					break;
				}
				zz++;
			}while(zz < eaea2);
			z++;
		}while(z < eaea);
		System.out.println(res);
	}
	
}


