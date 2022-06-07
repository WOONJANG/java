import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 협업 프로그래머가 해당 DB(database)에 값중 
		 * 홀수 값에 대한 총 갯수를 받고자 한다. 
		 * 해당 갯수를 출력 될 수 있도록 코드를 작성하시오.
		 */
		
		odbc od = new odbc();
		
		System.out.println(od.data1());
		

	}

}

class odbc {
	private int re;
	private int ct = 0; // 홀수 일 경우 +1식 증가하기 위한 필드 변수값.
	private int odata[]; // 배열값이 변경되지 않도록 설정.

	private int ori [];
	
	public odbc() {
			
		int odata[] = {15, 22, 17, 14, 32, 35, 19, 33}; //홀수 5개
		this.ori = odata;
		int odata_ea = odata.length; //8개
		int odata_em[] = new int [10];

			for (re = 0; re < odata_ea; re++) {
			if(odata[re]%2==1) {
//				System.out.println(odata[re]); // 홀수 출력
//				odata_em[ct] = odata[re];
				ct++;
			}
		}
	}
	
	public int data1() {
		return this.ct; //최종값을 return시킴
	}
}