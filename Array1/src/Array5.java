import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		//빈 배열 변수에 데이터가 있는 배열로 커스텀 방법.
		int a[] = new int [3]; //[3]개의 공간만 제공함. a 빈공간
		int b[] = {1, 2, 3, 4, 5, 6, 7}; //7개의 객체가 있는 상황. b 7개의 객체
		int ea  = b.length; // b 배열 안에 몇개의 객체가 있는지
//		System.out.println(a.length);
		int a_ea = a.length; //a의 갯수
		int w = 0;
		int ct  = 0;
		do {
//			System.out.print(b[w] + " ");
			if(b[w]%2==0 && ct < a_ea) { // if(b배열의 값 중 짝수만 && 새로운 a배열의 전체 객체크기만큼만)
				a[ct] = b[w];
				ct++; // 조건의 맞을시, 인덱스 번호를 +1씩 증가시킴.
			}
			w++;
		}while(w<ea);
			System.out.println(Arrays.toString(a));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
