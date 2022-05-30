
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign = "*";
		int total=0; //* 때문에 0 넣으면 X / *에 변수값 새로 설정하면 O
		/*case 안에 각각의 반복문을 사용할 수 있습니다.
		또한 동일한 변수명을 사용해도 가능하며, case 각각 다르게 작동하기 때문에 문제가 되는 사항이 없다.
		단, case는 하나의 조건이 맞을 경우 나머지 케이스는 절대 작동하지 않음.
		*/
		switch (sign) {
		case "+" -> {
			int a;
			total = 0;
			for(a=1;a<=5;a++) {
				total += a;
			}
		}
		case "-" -> {
			total =0;
System.out.println("음수값은 출력 되지 않습니다.");
		
		}
		
		case "*" -> {
			total=1;
			int c=1;
			do {
				total *=c;
				c++;
			}while (c<=5);
		}
		case "/" -> {
			total = 0;
		}
		}
		System.out.printf("총 1~5 까지 계산된 값은 %d 입니다", total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
