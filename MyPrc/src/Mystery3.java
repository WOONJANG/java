import java.util.Scanner;

public class Mystery3 {

	public static void main(String[] args) {
		
		//7000원씩 1입력 포함 2입력 미포함 최종결제금액
		
		Scanner sc = new Scanner(System.in);
				
		final int sale = 7000;
		int a;
		int total =0;
		
		for(a=1; a<=4; a++) {
			System.out.println("7000원 결제 하시겠습니까");
		int in = sc.nextInt();
			if (in == 1) {
				total += sale;
			}
		}
		System.out.println("총 결제금액은" + total +"원 입니다");
sc.close();
	}

}
