import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList
public class example1 {

	public static void main(String[] args) {
		
		String color[] = {"red", "blue", "green"};
		
		ArrayList<String> color_arr = new ArrayList<String>(Arrays.asList(color)); 
		
		System.out.println(color_arr);
		
		color_arr.remove(1);
		
		System.out.println(color_arr);
		
//		Integer number1[] = {1, 2, 3, 4};
//		ArrayList<Integer> number_arr1 = new ArrayList<Integer>(Arrays.asList(number1));
//		System.out.println(number_arr1);
		
		int number2[] = {1, 2, 3, 4};
		Integer number_integer[]  = { number2[0], number2[1], number2[2], number2[3]};	// int를 Integer로 변경 후 
		ArrayList<Integer> number_arr2 = new ArrayList<Integer>(Arrays.asList(number_integer));	// Arraylist로 출력
		System.out.println(number_arr2);
		
		/* 망한 코드 */
//		int abc[]  = {3, 4, 7, 9, 10};
//		List<Object> abc_arr = new ArrayList<>(Arrays.asList(abc));
//		Object test = abc_arr.get(0);	// int -> Object로 적용시 재로드 하기 힘듦.
		
		/* 정식 코드 */
		int abc[]  = {3, 4, 7, 9, 10};
		List<Object> al3 = new ArrayList<>();	// 빈 배열을 만든 후
		int w = 0;
		while (w < abc.length) {
			al3.add(abc[w]);	// 빈 배열에 배열을 집어 넣는다.
			w++;
		}
		System.out.println(al3);
		
		
		List al4 = new ArrayList<>();
		al4.add("a");
		al4.add(10);
		al4.add("b");
		al4.add(20);
		al4.add(30);
		System.out.println(al4);
		
		String word = String.valueOf(al4.get(0).toString());
		System.out.println(word);
		int check = Integer.parseInt(al4.get(1).toString());
		System.out.println(check);
	}

}
