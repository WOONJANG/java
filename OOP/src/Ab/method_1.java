package Ab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//method_1a.java
public class method_1 extends ide_meth1 { 
	//package ab2에서 import 할수있도록하며 외부 class도 동일하게 모두 가져오게함
	
	public void recall() { //Ab 패키지와 공유설정 메소드
		System.out.println("test");
	}
	protected static void name() { // protected은 static 적용 해야함 Ab2 패키지와 공유가 됨
		System.out.println("홍길동");
	}
	
	public static void main(String[] args) {
		
		// Arrays.sort : 배열 오름차순 정렬 (숫자, 한글,영문)
		// 단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬 됩니다.
		
//		int number_data[] = {5, 7, 1, 4, 9, 2};
//		Arrays.sort(number_data); // 오름차순
//		System.out.println(Arrays.toString(number_data));
//		
//		String user_data[] = {"홍길동", "이순신", "장보고", "김유신"};
//		Arrays.sort(user_data);
//		System.out.println(Arrays.toString(user_data));
//		
//		String eng_data[] = {"apple", "Canada", "Apple", "banana"};
//		Arrays.sort(eng_data);
//		System.out.println(Arrays.toString(eng_data));
		
		/*
		 * 변수 2개를 생성해서 하나는 문자, 하나는 숫자
		 * 현재 가입된 사용자의 아이디를 확인 후 해당 포인트가 적립되도록 합니다.
		 * 단, 기존 포인트 + 적립금 포인트에 대한 결과를 출력하셔야 합니다.
		 * 출력은 main class에서 사용함.
		 * user_membership[][] = {
		 * 		{"kim", "park", "seo", "oh", "lee", "jang","jeong","cho","ha","wang"},
		 * 		{"1500", "800", "2000", "1000", "4200", "2200","3000","500","1000","1800"}
		 * };
		 */
		String unm = "jang";
		int upt = 1000;
	//	String c = "감소";

		ide_meth1 ide = new ide_meth1();
		ide.setter(unm, upt);
		ide.getter();
		System.out.println(ide.getter());
	}

}




class ide_meth1 extends mth1{
	
	
	private String name;
	private int f;
	private int sum=0;
	private String ssum;

	String user_membership[][] = {
			{"kim", "park", "seo", "oh", "lee", "jang","jeong","cho","ha","wang"},
			{"1500", "800", "2000", "1000", "4200", "2200","3000","500","1000","1800"}
	};
	
	@Override
	public void setter(String data1, int data2) { // 반복문
		
		name = data1;
		point = data2;
		
		for(this.f = 0;this.f < this.user_membership[0].length; this.f++) {
			if(this.user_membership[0][f].equals(this.name)) {// 배열 이름의 반복이 name일때,
				this.sum = data2 + Integer.parseInt(this.user_membership[1][f]); // sum = point + string을 int로 바꾼 배열 1번의 반복
			}
		}
//		System.out.println(this.sum);
		this.ssum = Integer.toString(this.sum); // ssum을 다시 string으로
	
	};

	@Override
	public void setter(int data3[]) {
		
	};
	
	@Override
	public String getter() {
		String print = this.name + "님 포인트가 " + this.ssum + " 증감 되었습니다.";
		return print;
	};
	
}
