
public class For2 {

	public static void main(String[] args) {
		
		int a; //for�� �ʱⰪ
		int b=2; //for�� ���ᰪ
		int c; //������ ����� ���

		for (a=1; a<=9; a++) {
			c= b*a; //��� ���� �۾�
			//System.out.printf("%d ",c);
		}
			/*[���빮��]
			 *  ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�.
			 [ 45, 40, 35, 30, 25, 20,*/
		
		int d;
		int e = 5;
		int f;
		
		for (d=9; d>=4; d--) {
			f = d * e ;
		//System.out.printf("%d, ", f);
		}
		
		/*[���빮��]
		 *  ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�.
		 [ 11, 22, 33, 44, 55, 66, 77, 88, 99, ]*/
		
		int aa;
		int bb = 11;
		int cc;
		int dd;
		
		for (aa=1; aa<=9; aa++) {
			cc= bb*aa;
		System.out.print(cc + ", ");
		System.out.print(aa * bb + ", ");
			dd= (10*aa)+aa;
			System.out.println(dd);
		}
		
		
		
		
		
		
		
		
	}

}
