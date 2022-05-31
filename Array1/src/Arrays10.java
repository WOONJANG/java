import java.util.Arrays;

public class Arrays10 {

	public static void main(String[] args) {
		
		int A1 [][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		
		//A1[0][0] + A1[1][0]
		//A1[0][1] + A1[1][1]

		int ea = A1[0].length; //배열 객체 수 
		int ea2 = A1.length; // 데이터 수
		
		int w = 0; //큰 반복문 인덱스값
		int newdata[] = new int [ea]; //새로운 배열 객체
		while (w<ea) { // 큰 반복문 5바퀴+쓸때마다 증가(배열 객체수)
			int ww = 0;
			int total1=0, total2 =0; //각각의 값을 이관 받는 수
			while(ww<ea2) { // 작은 반복문 2바퀴(배열데이터2개(그룹))
				if(ww==0) {
					total1 = A1[ww][w];
				}
				else {
					total2 = A1[ww][w];
				}
//				System.out.println(A1[ww][w]);
					
			ww++;
			}
			//작은 반복문 밖으로 나와서 첫번째 배열값 + 두번째 배열값
			newdata[w] = total1 + total2; //새로운 배열 객체로 등록
			w++;
		}
			System.out.println(Arrays.toString(newdata));

	}

}
