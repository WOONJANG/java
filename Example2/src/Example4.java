public class Example4 {

	public static void main(String[] args) {
		/*
		 * [응용문제] 두개의 값을 외부 클래스로 보냅니다. 해당 클래스에서 두개의 값을 계산하게 됩니다. 계산 형식은 다음과 같습니다. 3, 10을
		 * 보내게 되면 두개의 값을 합을 구합니다. 나머지 외부 클래스에서 해당 결과값을 출력하는데 두 개의 합 값이 짝수, 홀수 인지를 출력하는
		 * extends를 구현하세요.
		 */
		int n1 = 3;
		int n2 = 10;
		
		cal2 c1 = new cal2();
		c1.cal_1(n1, n2);
		c1.cal_2();
	}
}

class cal1 {

	protected int a;
	protected int b;
	protected int c;
	public String msg = "";
	
	public void cal_1(int num1, int num2) {

		this.a = num1;
		this.b = num2;
		this.c = num1 + num2;
	}
}

class cal2 extends cal1 {

	public void cal_2() {

		if (this.c % 2 == 0) {
			msg = "짝수";
		}
		else {
			msg = "홀수";
		}
		System.out.println(this.msg);
	}
}
