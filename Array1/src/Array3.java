import java.util.Arrays; 
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		//5 10 15 20 25 30 35
		
//		int data [] = { 5, 10, 15, 20, 25, 30, 35 };
		/*
		 * for each문을 사용할 때에는 index 번호가 필요없이 사용할 경우. 단순한 배열에서 사용 
		 * for~do~while문 사용할 때에는 index 번호가 필요할 때 사용.
		 */
//		for(int f : data) { //int f가 순차적으로 배열값을 받아서 저장시킴.
//			if(f%2==0) {
//			System.out.println(f);
//			}
//		}
		
/*
		String pay[] = { "무통장입금", "신용카드", "휴대폰결제", "상품권", "쿠폰" };
		Scanner sc =new Scanner(System.in);
		
		System.out.println("결제하고자하는 형태를 선택해주세요.");
		String pm = sc.next();
		for (String z : pay) { //배열data가 문자 형태 이므로 받는 변수형태 또한 문자형을 사용해야 한다.
			if(pm.equals(z)) {
				if(z.equals("휴대폰결제")) {
//					System.out.println("현재 시스템점검으로 해당 결제는 사용하실수 없습니다.");
				}
				else{
//					System.out.println(pm+"로 결제 진행됩니다.");
					}
			}
		}
		sc.close();
		//===============================================================================
*/		
		/*[응용문제]
		 * { "햄버거", "피자", "치킨", "커피" }
		 * "주문 하고자 하는 음식을 선택해주세요"
		 * 해당 질문은 총 4번을 물어보게 됩니다.
		 * 단, "주문 종료" 라고 입력시 , 즉시 주문 종료되며,
		 * 주문 내역을 출력.
		 */
/*		
		Scanner sc = new Scanner(System.in);
		String menu [] = {"햄버거", "피자", "치킨", "커피"};
		String bill [] = new String[4];
		
		int re=0;
		
		
		for (String a : menu) {
			System.out.println("주문 하고자 하는 음식을 입력해주세요");
			String order = sc.next();
			if(a.equals(order)) {
				bill[re]+=a;
				re++;
			}
			else if(order.equals("주문종료")) {
				break;
			}

		}
		int totalbill = bill.length;
		System.out.println(Arrays.toString(bill));
*/
//============================================================================================
		Scanner sc = new Scanner(System.in);
		String menus [] = {"햄버거", "피자", "치킨", "커피"};
		String user;
		String user_menu [] = new String[4];
		int ct = 0;
		for(String f : menus) {
//			Scanner가 반복문 안에 적용시 loop로 무조건 반복하지는 않음
//			사용자가 입력할 때마다 반복문 범위만큼 출력하는 형태.
			System.out.println("메뉴를 선택해주세요.");
			user = sc.next();
			if(user.equals("주문종료")) {
				break;
			}
			else {
				for(String ff : menus) {
					if(user.equals(ff)) {
						user_menu[ct] = ff;
 						ct++;
					}
				}
			}
		}
		System.out.println("주문하신 메뉴는 다음과 같습니다." + Arrays.toString(user_menu));			
		sc.close();
			
		}
		
		
		
		
		}



