import java.util.Scanner;

public class DO_scan {

	public static void main(String[] args) {

/*사용자가 총 3번의 입력을 합니다 3개 숫자를 모두 곱하여 총 합계 수를 출력하시오.*/
		
		Scanner sc = new Scanner(System.in);
		
		int r = 1;
		int input;
		long total = 1; //long 입력시 최종 결과에서 음수가 발생함.
				
		do {
			System.out.printf("%d 번째 숫자 입력 : ", r);
			input = sc.nextInt();
			total *= input;
			r++;
		} while(r<=3);
		System.out.printf("총곱의합 : %d", total);
sc.close();
	}

}