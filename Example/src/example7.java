import java.util.Arrays;

public class example7 {

	public static void main(String[] args) {

		/*
		 * 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 * [data]
		 * {"홍길동", "합격"},
		 * {"이순신", "합격"},
		 * {"강감찬", "불합격"},
		 * {"김유신", "합격"},
		 * {"유관순", "불합격"},
		 * {"장보고", "불합격"}
		 * 
		 * 다차원 배열 형태이며, 해당 값중 합격자만 출력되도록 합니다.
		 * 단, 배열 값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 * 결과 - 홍길동, 이순신, 김유신
		 */

		arrays.arr();
		
	}

}
class arrays {
	public static void arr () {
		String user[][] = 		{  
				{"홍길동", "합격"},
				{"이순신", "합격"},
				{"강감찬", "불합격"},
				{"김유신", "합격"},
				{"유관순", "불합격"},
				{"장보고", "불합격"}
		};
		int nm = user.length; //6
		int pf = user[0].length;//2
//		String str = " ";
		int f;
		for(f=0;f<nm;f++) {
			if(user[f][1].equals("합격")) {
//				str = str.trim();
//				String userin [][] = str.split("\\s+");
//				System.out.println(Arrays.toString(userin[f][0]));
				System.out.printf("%s 님 %s 입니다.\n", user[f][0], user[f][1]);
			}
		}
		
	}
}