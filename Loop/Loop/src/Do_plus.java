
public class Do_plus {

	public static void main(String[] args) {
	
		/*[���빮��]
		 * do ~ while��
		 * 30 ~ 35���� �հ�ġ ���*/
	
		int st = 30;
		int bn = 0;
		do {
			bn += st; 
			st++;
		}while(st<36);
//	System.out.println(bn);
	
	/*[���빮��]
	 * �հ���� 189�� �ֽ��ϴ� ��, 1~10���� �հ�ġ�� ���� 189�� �� �� �հ踦 ���Ͻÿ�*/
		
		int a = 189;
		int b = 1;
		int c = 0;
		
		do {
			c += b;
			b++;
		}while (b<=10);
		
//		System.out.println(a-c);
		//==//
		int ww= 1;
		int total = 189;
		
		do {
			total -=ww;
			ww++;
		}while (ww<11);
		
		System.out.println("����� : " + total);
	
	
	}

}
