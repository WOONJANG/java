
public class Mystery2 {

	public static void main(String[] args) {
		
		//45 35 25 15 10 Ãâ·Â
		
		int re;
		int a = 5;
		int b;
		
		for (re=9; re>=2; re--) {
			b= a*re;
			if (b%2 == 1 || b == 10) {
				System.out.printf("%d ", b);
			}			
		}

	}

}
