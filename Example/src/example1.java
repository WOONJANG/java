import java.util.Arrays;

public class example1 {

	public static void main(String[] args) {

		/*[응용문제] 배열 + 기본(클래스)메소드 문제
		 * 1차 배열에 다음과 같이 값이 있습니다.
		 * 배열 리스트 22 33 44 55 66 77 88 99 이며
		 * 해당 전체 값을 모두 더한 총 합계 값을
		 * 별도의 메소드로 처리되도록 합니다.
		 * 단, 반복문은 do~while문으로 작성.
		 * 
		 */
		
		int arr[] = {22, 33, 44, 55, 66, 77, 88, 99};
//=====================================================void
		//void = 객체생성 + 인스턴스(메모리) 등록
		example1 ex = new example1(); //void
		ex.datas(arr); //void
//=====================================================static		
//		datas(arr); // arr을 datas의 arr_datas로 보내기  // static 
	}

//=====================================================static
/*
	public static void datas (int arr_datas[]) {
		
		int re = 0; //반복
		int total = 0; //합계
		int n = arr_datas.length; //배열의 객체 수
//		System.out.println(n); 8개
//		System.out.println(Arrays.toString(arr_datas)); 배열 [22, 33, 44, 55, 66, 77, 88, 99]
		do {
			total += arr_datas[re]; //total = 받은 매개변수[반복]
			re++;
		} while (re < n); //반복 < 배열 객체 수 (8개)
		
		System.out.println("arr 배열의 합계는 " + total);
	}
*/
//======================================================void
	public void datas(int arr_datas[]) {
		
		int re = 0; //반복
		int total = 0; //합계
		int n = arr_datas.length; //배열의 객체 수
//		System.out.println(n); 8개
//		System.out.println(Arrays.toString(arr_datas)); 배열 [22, 33, 44, 55, 66, 77, 88, 99]

		do {
			total += arr_datas[re]; //total = 받은 매개변수[반복]
			re++;
		} while (re < n); //반복 < 배열 객체 수 (8개)
		
		System.out.println("arr 배열의 합계는 " + total);
	}
}
