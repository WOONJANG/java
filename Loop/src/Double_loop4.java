
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * 2*9 ... 3*9 ū�ݺ��� for �����ݺ��� do while��
		 * */
/*
		int f = 1;
		for (f=2;f<=3;f++) {
			int w= 1;
			do {
				System.out.println(f + " *"+ w +"=" + (f*w));
				w++;
			}while(w<=9);
		}
*/ //==============================================
		
		/*[���빮��]
		 * ������ 7~9�� ���� 
		 * ��, �� ������ �������� 5������ �������� �Ѵ�. 7*1~7*5 ... 9*5
		 * ū �ݺ��� do while ���� �ݺ��� while
		 *  */
/*		
		int a =7;
		do {
			int b =1;
			while(b<=5) {
				System.out.println(a+"*"+b+"="+(a*b));
				b++;
			}
			a++;
		}while(a<=9);
*/ //==============================================
		
		/*[���빮��]
		 * ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
		 * ū for�� ���� while��.
		 * 1*1
		 * 2*2
		 * ...
		 * 9*9
		 */

		int a;
		int total;
		for (a=1; a<=9; a++) {
			int b=a;
			while(b<=a) {
				total = a*b;
//				System.out.printf("%d * %d = %d \n", a, b, total);
				b++;
			}
		}

	//==============================================	
	
/*[���빮��]
 * ���� �ش� �����ó�� ����� �ǵ��� ���� �ݺ����� �̿��Ͻÿ�.(ū �ݺ��� while ���� �ݺ��� do while)
 * 1+1=2
 * 2+1=3
 * 2+2=4
 * 3+1=4
 * 3+2=5
 * 3+3=6
 * 4+1=5
 * ...
 * 4+4=8
 */
	
		int aa=1;

		while (aa<=4) {
			int bb=1;
			do {
				System.out.printf("%d * %d = %d\n", aa, bb, (aa*bb));
				bb++;
			}while(bb<=aa);
			aa++;
		}
	

	
	
	
	
	
	}
	

}
