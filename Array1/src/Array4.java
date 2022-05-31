import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		String[] names = new String [3]; //값이 없는 배열 공간만 만들어놨음.
		
		String name[] = {"홍길동","이순신","강감찬" }; // 배열값에 데이터가 있는 상태.
		int ct = 0; // foreach에는 인덱스 번호가 없으므로 새롭게 인덱스 번호를 지정해주기 위한 변수.
		for (String a : name) {
//			System.out.println(ct);
			if(a.equals("홍길동") || a.equals("강감찬")) { // 해당 (기존)배열값 중 조건에 맞는 값만 추려서 새로운 배열값에 추가함.
				
				names[ct] = a;
				ct++; // 인덱스 번호를 순차적으로 적용하기 위한 증가값.
			}
		}
		int names_ea = names.length;
		System.out.println(Arrays.toString(names));

		
		/*[응용문제]
		 * 배열
		 * 사용자가 장바구니에 내용을 결제하게 됩니다.
		 * 단, 해당 금액리스트를 출력하지말고, 최종 전체 결제 금액만 출력되도록 합니다.
		 * 
		 * 1500 22000 13000 14500 113800 45000
		 * */
		int price [] = {1500, 22000, 13000, 14500, 113800, 45000 } ;
		int total = 0;
		int a;
		for (a=0; a<price.length; a++) {
			total += price[a];
		}
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
