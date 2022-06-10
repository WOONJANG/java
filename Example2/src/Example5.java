import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 	extends를 사용하여 다음 결과에 대한 코드를 작성하시오.
		 	숫자 두개를 입력합니다.
		 	두개의 숫자를 확인하여 다음과 같이 체크 합니다.
		 	첫번째 숫자가 두번째 숫자 보다 작을 경우
		 	첫번째 숫자가 두번째 숫자 보다 클 경우
		 	첫번째 숫자와 두번째 숫자가 같은 경우
		 	
		 	첫번째 숫자가 작을 경우 : 해당 두개의 값을 합친 결과값 출력
		 	첫번째 숫자가 클 경우 : 해당 범위 만큼 숫자를 모두 더한 결과 값 ex) 10, 6 = 10+9+8+7+6
		 	두 숫자가 같을 경우 : "해당 값이 같습니다" 출력.
		 */
		ca2 c11 = new ca2(); // 불러오기
		
// =================사용자 입력방식==========================		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int user1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int user2 = sc.nextInt();
		
		c11.asd1(user1, user2); // 내보내기
		c11.asd2(); // 불러온 값 출력
		
		sc.close();
		System.exit(0);
//======================================================
//=====================지정 방식===========================
/*
		int num1 = 10;
		int num2 = 1;
		System.out.println("첫번째 숫자 : " + num1 + "\n두번째 숫자 : " + num2);
		c11.asd1(num1, num2);
		c11.asd2();
	 	System.exit(0);
*/		
//======================================================		
	}
}

class ca1{ 
	protected int aa;
	protected int bb;
	protected int cc;
	protected int total = 0;
	public String msg = "";
	
	public void asd1 (int n1, int n2) {
		this.aa = n1;
		this.bb = n2;
	}
} 

class ca2 extends ca1{ 
	 public void asd2 () {
		 if (this.aa < this.bb) {
			this.cc = aa + bb;
			System.out.println(this.cc);
		 }
		 else if (this.aa > this.bb) {
			 int re = this.bb;
			 for(re = this.bb; re <= this.aa; re++) {
				total += re; 
			 }
			 System.out.println(total);
		 }
		 else {
			 msg = "해당 값이 같습니다.";
		 }
		 System.out.println(msg);
		 System.exit(0);
	 } 
}