
public class While_plus {

	public static void main(String[] args) {
		
		/* 5 ~ 10���� ���� �հ� ���� ��� */
		
		int s = 5; // �ʱⰪ
		int t = 0; // �հ�ġ�� ������Ű�� ���� ������
		
		while (s < 11) {
			// t= t+s;
			t += s;
			s++;
		}
//			System.out.printf("�հ� : %d",t);
	
	
			/*[���빮��]
			 * 3 ~ 8���� ���� �� �հ� ���� ����Ͻÿ�.*/
			
			int st = 3;
			int bn = 1; //���ϱ� �հ踦 ������ "1" �⺻������ ����
			
			while (st<=8) {
				bn *= st;
				st++;
			}
			//System.out.println(bn);
	
				
	
	
	
	}

}
