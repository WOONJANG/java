import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 결제 최종 금액이 있습니다
		 * 3개의 상품
		 * "바코드로 상품을 입력시켜주세요" 금액을 입력하고
		 * 단, 할인 %입력해주세요 : " 라는 문구와 함께
		 * 해당 할인 숫자를 입력하면 최종 금액이 변경되어 출력되도록 합니다.*/
/*
		Scanner sc = new Scanner(System.in);
		int re; //반복문
		int total = 0;  //합계

			System.out.println("결제하실 상품 갯수를 입력시켜주세요.");
			int ea = sc.nextInt();

		for (re=1; re<=ea; re++) {
			System.out.println("바코드로 상품을 입력시켜주세요.");
			int price = sc.nextInt();
			total += price;
		}
		System.out.printf("%d개의 상품 총 금액은 %d입니다. 할인 퍼센트를 입력해주세요.\n", ea, total);
		int coupon = sc.nextInt();

		double a = coupon * 0.01;
		double b = total * a;
		double c = total - b;
		System.out.println(coupon + "퍼센트 할인권을 사용하여 최종 결제 금액은 " + c + "원입니다." );
		sc.close();
		*/

		int f, ff;
		int total = 0;
		for (f = 1; f <= 3; f++) {
//			System.out.println(f);
			for (ff = 1; ff <= 4; ff++) {
//				System.out.println(ff);
				total += f + ff;
				System.out.println(f + " + " + ff + " = ");
			}
		}

	}

}