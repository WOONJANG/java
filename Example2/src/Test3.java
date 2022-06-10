
public class Test3 {

	public static void main(String[] args) {

//=============for=================		
		int re = 1;
		int rere = 1;
		int total = 0;
		
		for(re = 1; re <= 5; re++) {
			for(rere=1;rere<=9;rere++) {
				total += (re+rere);
			}
		}
		System.out.println(total);
//=============while================
		while(re <= 5) {
			total=0;
			while (rere <= 9) {
				total += (re+rere);
				rere++;
			}
			re++;
		}
			System.out.println(total);
//=============do while================
			re = 1;
			total = 0;
			
			do{
				rere = 1;
				do {
					total += (re+rere);
					rere++;
				}while(rere <= 9);
				re++;
			}while(re <= 5);
			System.out.println(total);
	}
}
