import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
/*
		int num = 3;
		datalist da = new datalist(); // nm
		da.array_data(num);

//		String pay = "신용카드";
		String pay = "계좌이체";
		if(pay.equals("신용카드")) {
			da.pay1(); //해당 조건에 맞는 메소드를 호출.
		}
		else {
			da.pay2(pay);	//메소드에 객체값을 태워서 전달(객체값은 무한대)
		}
*/		
		/*[응용문제]
		 * 해당 로드 할 class명은 agrees라는 이름을 가지고 있습니다.
		 * main  메소드에서 사용자가 "동의함", "동의안함"을 입력하게 됩니다.
		 * 동의함으로 입력 되었을 경우, "회원가입이 진행 됩니다." 라는 메세지 출력하고
		 * 동의안함으로 입력 되었을 경우, "동의를 하셔야 진행 됩니다."
		 * 라고 출력 되도록 하시오.
		 * 단, agrees 클래스 안에 void  메소드 한개 또는 두개를 선택하여 코드를 제작하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("동의함 or 동의안함\n");
		String input = sc.next();
		agrees agree = new agrees();
		agree.ag(input);
		sc.close();
		
	}

}

class datalist {
		//static 메소드를 활용하는 형태 : 여러 package에서 해당 메소드를 자주 사용해야하는 부분에서는 static을 이용하여 사용.
		//static (정적 메소드) : 오버라이딩을 사용할 수 없음.
		//void(동적 메소드)만 사용시 : 오버라이딩을 사용할 수 있음.
		/*오버라이딩 예제 :
		class a{
			void 메소드
		}
		class b extend a {
			void 메소드
		}
		*/
	/*
	public void array_data(int a) {	//static이 없는 메소드
		int w = 1;
		while (w <= 9) {
			System.out.println(a * w);
			w++;
		}
	}
	public void pay1(){
	System.out.println("신용카드로 결제 진행 합니다.");
	}
	public void pay2(String pm){
	System.out.println(pm +"으로 결제 진행 합니다.");
	}
*/
	
}



class agrees{
	public void ag (String a) {
		String msg = "";
		if(a.equals("동의함")) {
//			System.out.println("회원가입이 진행 됩니다.");
			msg = "회원가입이 진행 됩니다.";
		}
		else if (a.equals("동의안함")) {
//			System.out.println("동의를 하셔야 진행됩니다.");
			msg = "동의를 하셔야 진행 됩니다.";
		}
		else {
			System.out.println("'동의함' or '동의안함' 만 입력해주세요");
		}
		System.out.println(msg);
	}
}
