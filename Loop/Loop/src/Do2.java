
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 9;
		int c;
		do {
			c= a*b;
//			System.out.print(c +" ");
			
			a++;
		}while (a<10);

		
		/*[���빮��]
		 * ���� ������� ���� do ~ while ������ ����Ͽ� �ڵ带 �ۼ��Ͻÿ�.
		 * 35 45 55 65 75
		 */
		
		int aa = 1 ;
		int bb =10;
		int cc;
		
		do {
			cc= aa * bb;
//			System.out.print(cc+25 + " ");
			aa++;
		} while (aa<6);
		
		
		int k = 3;
		int j ;
		do {
			j= k * 10 +5;
			System.out.print(j + " ");
			k++;
		}while (k<8);
		
		
		
		
	}

}
