import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {


/*		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("구구단에 대한 숫자를 입력하세요??");
		 int ipgugu = sc.nextInt();
		 int aa;
		 int bb;
		 int total = 0;
*/
// for문		 
/*		 for (aa=1; aa<=9; aa++) {
			 bb= ipgugu * aa;
			 total += bb;
		 }
		 if(total%2==0) {
			 System.out.printf("입력하신 %d단의 구구단의 총합은 %d 이며, 본 결과값은 짝수입니다.", ipgugu, total);
		 }
		 else {
			 System.out.printf("입력하신 %d단의 구구단의 총합은 %d 이며, 본 결과값은 홀수입니다.", ipgugu, total);
		 }
		 //System.out.printf("%d", total2);
*/
		
//do while문
		 Scanner sc = new Scanner(System.in);
		 int user = sc.nextInt();
		 String msg = " 구구단에 대한 숫자를 입력하세요?";
		 int total =0;
		 System.out.println(msg);
		 int f= 1;
		 do {
			 //total = total + (ipgugu * f);
			 total += user*f;
			 f++;
		 } while (f <=9);
		 //System.out.println(total);
		
		 String msg2;
		 if(total%2==0) {
			 msg2 = "짝수";
		 }
		 else if (total%2==1){
			 msg2 = "홀수";
		 }
		 System.out.printf("결과값은 %s 입니다",msg);
		 sc.close();
	}

}
