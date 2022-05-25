import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요!");
		//String memo = a.next(); // next : 스페이스바 전 까지 입력을 출력.
		String memo = a.nextLine(); // nextLine : 엔터 누르기 전 까지 (스페이스바 포함) 입력을 출력.
		System.out.println(memo);
		
		a.close(); // scanner 종료를 기본으로 적용해야한다.
		
		/* 문자 : park
		 * 숫자 : 25*/
		
		
		String name = "park"; // String+숫자 = %s
		int age = 25; // 숫자 = %d
		/* [중요사항] 
		 * float,double = %f
		 * date, time(시간, 날짜) = %t
		 * boolean(true,false) = %b
		 * */
		
		//System.out.println(name +"님의 나이는 " +age+ "입니다");
		//printf : f는 뜻이 format.
		System.out.printf("%s님의 나이는 %d입니다 ", name, age);
	
	}

}
