
public class Do1 {

	public static void main(String... args) {
		
		int a = 1; //�ʱⰪ
		do {
//			System.out.printf("%d, ",a); //��°�
			a++; //����
		} while(a<11) ; //������, ���ᰪ
		
		/*[���빮��]
		 * 5 ~ 0 ���� ��� ��, do ~while�� ���.
		 * */

		int aa = 5;
		do {
//			System.out.print(aa + " ");
			aa--;
		} while (aa>=0);
		
		int b = 50; //���ʰ�
		int c = 60; // ���ᰪ

		do {
			System.out.print(b +" ");
			b++;
		}while(b <= c);
		
		
		
		
		
	}

}
