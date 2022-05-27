import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/* [응용문제]
		 * 사용자가 입력한 숫자에서 맞춰서 구구단이 작동되며, 구구단 결과를 계산하여 짝수 인지 홀수 있지를 출력하시오
		 * "구구단에 대한 숫자를 입력하세요?" 라고 메세지가 출력되면 해당 숫자에 맞춰서 모든 결과를 더하며 더한 값에 따라 짝수있지 홀수 인지를 출력하시면 됩니다.
		 * 단, 해당 반복문은 for, while, do~while문까지 한가지를 선택해서 작성하시오.*/
		 Scanner sc = new Scanner(System.in);
		 System.out.println("구구단에 대한 숫자를 입력하세요??");
		 int ipgugu = sc.nextInt();
		 int a; //1~9 반복
		 int b; // 입력* 9까지 반복 
		 int total = 0; // 합
		 sc.close();

		 for (a=1; a<=9; a++) {
		 b= ipgugu * a;
		 total += b;
		 }
		 if(total%2==0) {
			 System.out.printf("입력하신 %d단의 구구단의 총합은 %d 이며, 본 결과값은 짝수입니다.", ipgugu, total);
		 }
		 else {
			 System.out.printf("입력하신 %d단의 구구단의 총합은 %d 이며, 본 결과값은 홀수입니다.", ipgugu, total);
		 }
		 //System.out.printf("%d", total2);
	}

}
