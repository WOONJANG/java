import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 다음 중 장바구니에 여러개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		 * 택배비는 30000 원 이상 
		15000 48000 67000 8000 118200 49800 6000 18700
		
		 */
/*		
		int arr [] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700}; //배열
		int em [] = new int[4]; //[] 공간
		int arr_ea = arr.length; //arr의 갯수
		int em_ea = em.length; //em의 갯수
		int aa = 0;
		int bb = 0;
		
		do {
			if (arr[aa]>=30000) {
				em[bb] = arr[aa];
				bb++;
			}
			aa++;
		}while(aa<em_ea);
			System.out.println(Arrays.toString(em));
*/
		int arr [] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700}; //배열
		int arr_ea = arr.length;
		int w = 0;
		int em [] = new int[6]; //[] 공간
		int ct = 0; //인덱스 번호를 0부터 세팅
		do {
			if(arr[w]>=30000) {
				em[ct] = arr[w];
				ct++;
			}
			w++;
		}while(w<arr_ea);
		
		System.out.println(Arrays.toString(em));
	
		}
		

	}


