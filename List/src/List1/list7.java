package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 
		 * ArraysList or LinkedList 둘 중에 원하는 메소드를 구현.
		 * 2차배열 형태 입니다.
		 * 해당 데이터 값을 모두 더하여 작수 인지 홀수 인지를 확인하시오.
		 * Integer data[][] = {
		 * {10, 20, 30, 40, 50, 60, 70},
		 * {3, 6, 9, 12, 15, 17, 19}
		 * };
		 * 
		 * 결과)
		 * 
		 * 총합은 361 이고 홀수 입니다.
		*/
		Integer data[][] = {
				  {10, 20, 30, 40, 50, 60, 70},
				  {3, 6, 9, 12, 15, 17, 19}
				  };
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(data[0]));	
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(data[1]));
		
		int total=0;
		String msg="";
		for (int f = 0; f < arr1.size(); f++ ) {
//		arr.add(arr2.get(f));
		total += arr1.get(f) + arr2.get(f);
		}
//		System.out.println(total);
		
		if (total%2==0) {
			msg = "짝수";
		}
		else {
			msg = "홀수";
		}
		System.out.println("총 합은 " + total + "이고 " + msg + " 입니다.");
	}

}
