import java.util.Arrays;

public class Test3_2 {

	public static void main(String[] args) {
		
		int array [] = { 5, 3, 1, 10, 6, 12};
		int arr_ea = array.length;


		for (int f = 0; f < arr_ea; f++) {
			if(array[f]>=7 && array[f]%3==0) {
	//		System.out.println(array[f]);
			}
		}
		int array2 [] = {55, 44, 33, 22, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		// 해당 배열값에서 짝 수 값 중 10 미만의 숫자만 출력하시오.
		
		int arr_ea2 = array2.length;
		
		for(int ff=0; ff<arr_ea2; ff++) {
			if(array2[ff] < 10 && array2[ff]%2==0){
//				System.out.println(array2[ff]);
			}
		}
	}
}
