import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공 됩니다.
		 * 그 중 레벨데이터 값에 3미만의 값만 확인하여 배열 데이터를 재가공 합니다.
		 * 
		 * "홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신"
		 * 4, 3, 1, 1, 2, 2
		 * 
		 * 결과 - ["강감찬", "세종대왕", "유관순", "김유신"]
		 */
	
		String member1[] = {"홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신"};
		int member_ea = member1.length;
		int lv1[] = {4, 3, 1, 1, 2, 2};
		int lv_ea = lv1.length; //6개
		int em [] = new int [6]; //6칸의 빈 공간
		int em_ea = em.length;
		int w=0;
		int ct1 =0;
		
		do {
			if (lv1[w]<3&&ct1<em_ea) {

				em[ct1] = lv1[w];
				ct1++;
			}
			w++;
		}while(w<lv_ea);
		System.out.println(Arrays.toString(em));
		

		
		String member[] = {"홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신"};
		int lv[] = {4, 3, 1, 1, 2, 2};
		
		String new_member[] = new String[8];
		
		int mem_ea = member.length;
		int f;
		int ct = 0;
		for(f=0;f<mem_ea;f++) {
			if(lv[f] < 3) {
				new_member[ct] = member[f];
				ct++;
			}
		}
		System.out.println(Arrays.toString(new_member));
		//Arrays.toString : 숫자 문자 소수 [] 현재 배열 변수값을 출력하는 함수입니다.
		
		
		
		
		
		
		
		
		
		
	}

}
