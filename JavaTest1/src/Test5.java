
public class Test5 {

	public static void main(String[] args) {

		int re;
		int total = 0;
		
		for (re = 1; re <= 100; re++) {
			total += re;
			if (total >= 4000) {
				break;	
			}
		}
		System.out.println(total);
	}
}
