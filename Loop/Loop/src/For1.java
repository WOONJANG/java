
public class For1 {

	public static void main(String[] args) {
		// �ݺ��� : �����͸� �ϰ������� �Է�, ����� �� �� �ֵ��� �ϴ� ����.
	// for (  �ʱⰪ  ;   ���� ; ����)	
		
		int z = 1;
		//z++; // +1 ���� : ��� �� +1 ����
		//z--;  // -1 ���� : ��� �� -1 ����
		//++z; // +1 ���� : +1 ���� �� ���
		//--z; // -1 ���� : -1 ���� �� ���
		//System.out.println(z);
		
		
		
		for ( int a= 0; a < 10; a++ ) { // for (  �ʱⰪ  ;   ���� ; ����)
			//System.out.println(a);
		}
		
		int b;
		for (b=5; b<11; b++) {
			//System.out.println(b);
		}

		int c;
		for(c=10; c>3; c--) { //���� ���� : c<3  0~�������� ������µǴ� ��Ȳ�� �߻�.
			//System.out.println(c);
		}
		
		/*[���빮��]
		 * 20 ~ 27 ��� �Ͻÿ�.*/
		
		int d;
		for (d=20; d<28; d++) {
			//System.out.printf("%d", d);
		}
		/*[���빮��]
		 * 39 ~ 21 ��� �Ͻÿ�.*/
		
		short e;
		for (e=39; e>20;e--) {
			//System.out.printf("%d ", e);
		}
		
		// 1 ~ 10 ��� 
	
		int aa;
		int bb = 10;
		
		for (aa=1; aa<=bb; aa++) {
			//System.out.printf("%d \n",aa);
		}
		/*[���빮��]
		 * ���� 2���� �̿��Ͽ� ���� �����͸� ����Ͻÿ�
		 * 55 ~ 4 ���*/

		int cc;
		int dd = 4;
		
		for (cc=55; cc>=dd; cc--) {
			//System.out.printf("%d ", cc);
		}
		
		
		
		
		
	}

}
