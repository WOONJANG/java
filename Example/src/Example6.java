
public class Example6 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * 1~10 ���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		 * ��, 1~5������ ��� ���ϰ� 6~10������ ��� ���� ���մϴ�.
		 * �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū�� ����� ����Ͻÿ�.
		 */
		
		/*int a=1;
		int totalp=0;
		int totalm=1;
		
		for (a=1; a<=10; a++) {
			if(a<=5) {
				totalm *= a;
			}
			else{
				if (a>=6) {
					totalp += a;
				}
			}
		}
		System.out.printf("1~5 ���� ���Ѱ� : %d\n6~10 ���� ���Ѱ� : %d\n", totalm, totalp);

		if(totalp<totalm) {
			System.out.println("1~5 ���� ���Ѱ��� Ů�ϴ�");
		}
		else if (totalp > totalm) {
			System.out.println("6~10 ���� ���Ѱ��� Ů�ϴ�");
		}
		else {
			System.out.println("�� ���� �����ϴ�.");
		}
		*/
		
		int w = 1;
		int total1 = 0; // +
		int total2 = 1; // *
		while(w<=10) {
			if(w<=5) {
				total2 *= w;
			}
			else {
				total1 += w;
			}
			w++;
		}
		if (total1 < total2) {
			System.out.println("���Ѱ��� �� ũ��.");
		}
		else if(total2 > total1) {
			System.out.println("���Ѱ��� �� ũ��.");
		}
		else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		
		
		
		
		
	}
}






