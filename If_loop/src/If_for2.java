
public class If_for2 {

	public static void main(String[] args) {
		// 1~100���� ���� �� 80 �̻��� ���ڸ� ���
		
		int f;
		for(f=1;f<=100;f++) {
			if(f>=80) {
//				System.out.print(f + " ");
			}
		}

		
		// 200 ~ 300 ���� ���� �� 240 ���� ���ڸ� ���
		
		int a;
		for (a=200;a<=300;a++) {
			if(a<=240) {
//				System.out.print(a+ " ");
			}
		}
	
		// final
		
		final int aa = 2;
		int bb;

		for(bb=1; bb<=10; bb++) {
			if(bb%aa==0) {
			
//			System.out.printf("%d ",bb);
			}
		}
		
		/*[���빮��]
		 * �������� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ����մϴ�.
		 */
		
		final int a1=2;
		int b1;
		int c1;
		for(b1=1;b1<10;b1++) {
			c1= b1*a1;
			if(c1>=10) {
//				System.out.printf("%d ",c1);
			}
		}
		
		
		/*[���빮��]
		 * ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 * 18 36 54 72
		 */
		
		final int aaa=18;
		int bbb;
		
		for(bbb=1; bbb<=72; bbb++) {
			if(bbb%aaa == 0) {
//				System.out.print(bbb+ " ");
			} 
		}	
		

		int p;
		int total3;
		for (p=1; p<=9;p++) {
			total3 = p*9;
			if(p%2==0) {
//				System.out.print(total3 + " ");
			}
		}
	
		
		/*[���빮��]
		 * ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 *1 ~ 20 ���� ����
		 * 6 14 17 19 
		 */
		
		int qq;
		for(qq=1;qq<=20;qq++) {
			if(qq==6|| qq==14 || qq==17 || qq==19) {
				System.out.print(qq + " ");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
