import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {

		Scanner inputnumber = new Scanner(System.in);

		System.out.println("Q 사용자가 원하는 숫자를 입력하세요?");
		
		System.out.print("사용자가 입력한 숫자 : ");

		int evenoddnumber = inputnumber.nextInt() % 2; // %는 값을 나누면서 나머지값 확인하는 수식구.

		if (evenoddnumber == 0) {
			System.out.println("짝수값 입니다.");
		}
		else {
			System.out.println("홀수값 입니다.");
		}
inputnumber.close();
	}

}
