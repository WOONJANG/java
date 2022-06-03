import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {

		/*[응용문제]
		 * 배열 + 기본(클래스) 메소드 문제
		 * Product : 수박 참외 사과 배 딸기 키위 바나나 망고 중
		 * 참외 배 키위를 삭제 하였습니다.
		 * 해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하시오.
		 * 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며
		 * 반복문은 자유.
		 * 결과 - [수박, 사과, 딸기, 바나나, 망고]
		 */
		
		String product []  = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"}; 
		
		
		datas(product);

	}

	public static void datas (String f[]) {
/*
		int n = f.length; // product 객체 수 8개
		int re; //반복
		int ct=0;
		String re_product[] = new String[5];
		
		for(re=0;re<f.length;re++) {
			if(f.equals("참외") ||f.equals("배")||f.equals("키위")) {
			 	re_product[ct] = f[re];
			 	ct++;
			}
		}


*/
		
		int no = 5;
		String re_product[] = new String[no];
		int index = 0;
		for (String p : f) {
			if(!p.equals("참외") && !p.equals("배") && !p.equals("키위")) {
				re_product[index] = p;
				index++;
			}
		}
		System.out.println(Arrays.toString(re_product));
	}
}

