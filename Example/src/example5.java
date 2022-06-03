import java.util.Arrays;

public class example5 {

	public static void main(String[] args) {
		
		/* 2차배열 + 기본(클레스)메소드 문제
		 * 
		 * 등록된 고객중 vip 고객만 리스트를 출력하시오.
		 * 
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_level : gold vip guest gold vip vip guest
		 * 결과출력 : 이순신, 세종대왕, 김유신
		 */
		String arr[][] = { 
				{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
				{"gold", "vip", "guest", "gold",  "vip", "vip", "guest"}
				};

		//System.out.println();
		vip_lists(arr);
		
	}

	public static void vip_lists(String vips[][]) {
		int ea = vips.length; //배열 갯수 (2)
		int ea2 = vips[0].length; //객체 갯수 (7)
		int f=0;

//		String vip_user[] = new String[3];
	
		for(f=0; f<ea2; f++) {
			if(vips[1][f].equals("vip")) {
				System.out.print(vips[0][f] + " , ");		
			} 

//		while(f<ea) {
//			int ff = 0;
//			while(ff<ea2) {
//				if(vips[1][f].equals("vip")) {
//					
//					System.out.println(vips[0][f]);
//				}
//				ff++;
//				}
//			f++;
			}
		
		}
		
	}
