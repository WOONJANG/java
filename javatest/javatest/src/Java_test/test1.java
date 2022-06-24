package Java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {


	public static void main(String[] args) {

		test ts = new test();
		ts.setter();
		
	}

}

class test extends test1_abstract {
boolean ck = false;
ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList(this.arr));
ArrayList<String> em = new ArrayList<>();
	@Override
	public void setter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3]");
		int input_user = sc.nextInt();
		
		if(input_user == 1) {
			System.out.println("추가할 과목명을 입력하세요?");
			String plus_sub = sc.next().intern();
			for (int f =0; f < this.ar1.size(); f++) {
				if(plus_sub.equals(ar1.get(f))) {
				}
			}
			System.out.println("정상적으로 등록되었습니다.");
			System.out.println(em.add(ar1.get(input_user)));
		}
		else if(input_user == 2) {
			System.out.println("추가할 과목명을 입력하세요?");
			String remove_sub = sc.next().intern();
			for (int f =0; f < this.ar1.size(); f++) {
				if(remove_sub.equals(ar1.get(f))) {
				}
			}
			System.out.println("정상적으로 삭제되었습니다.");
		}
		else if (input_user == 3) {
			System.out.println("과목 리스트 입니다.");
//			System.out.println(em.add(ar1.get()));
		}
		else {
			System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 만 눌러주세요.");
		}
		sc.close();
	}
	@Override
	public String getter() {
		
		return null;
	}
	@Override
	public void db() {
		
	}
	
}
