package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		
		Integer data1[] = {3, 6, 9, 12, 15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(data1)); // Arraylist 보다 느림 , 수정시 빠름
		
//		System.out.println(ln);
		
		Scanner sc = new Scanner (System.in);
		LinkedList<Integer> list = new LinkedList<>();	// 빈 배열
		String user;
		// for(;;) // 무한loop
		while(true) {	// 무한loop
			System.out.println("숫자만 입력하세요.");
			user = sc.next();
			try {	// 사용자가 입력한 값이 오류가 있는지 확인하는 파트
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea >= 5) {	// 5개까지 배열이 입력되면 무한loop를 빠져나옴.
					break;
				}
//				System.out.println(list);
			}catch(Exception e){	// 오류가 발생하였을 경우 작동되는 파트
				System.out.println("해당 입력사항은 문자입니다.");
			}
		}
		System.out.println(list);
	}

}

