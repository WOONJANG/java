import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 *관리자에서 메뉴를 활성화 하는 프로세서입니다.
		 *해당 메뉴는 활성화는 2차 배열이며, 메뉴명, 활성화하는 (Y, N)으로 구분합니다
		 *해당 활성화 값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 메뉴명을 1차배열로 재구성 후 메인에서 출력되도록 합니다.
		 *결과 : [로켓배송, 로켓프레시, 골드박스, 이벤트, 추석]
		 * 단, private 및 return을 활용하여 프로그램을 작성합니다.
		 */
		menus mn = new menus();
		System.out.println(Arrays.toString(mn.resultdata()));
		
		

	}

}

class menus{
	private String msdata[][];
	private String result[]; 
	
	public menus() {
		//=====================================================
		String ms [][] = {
				{"로켓배송", "로켓프레시", "쿠팡비즈", "골드박스", "이벤트", "설날", "추석"},
				{"Y", "Y", "N", "Y", "Y", "N", "Y"}
		};
		this.msdata = ms;
		redata();
	}
		//=====================================================

		public void redata() {
			int navi_ea = this.msdata[0].length;
			int f;
			int ct = 0;
			String navi_em[] = new String[navi_ea];
	
			for (f=0; f<navi_ea; f++) {
				if(this.msdata.equals("Y")) {
					navi_em[ct] = this.msdata[0][f];
					ct++;
				}
				this.result = navi_em;
				}
			}
			public String[] resultdata() {
				
				return this.result;
			
			}
}
	
	




