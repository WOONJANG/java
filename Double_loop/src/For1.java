
public class For1 {

	public static void main(String[] args) {
//���� �ݺ���
		/* ������ 2�� ~ 3�ܱ��� */
/*
		int f, ff; //�ݺ����� ��� �� ���� ������ �̸� ��.
		
		for(f=2;f<=3;f++) { //ū for�� 2~3������ �ݺ�.
			
			for(ff=1; ff<=9; ff++) { //���� �ݺ��� 1~9���� �ݺ�.
				//�ش� ���� �ݺ����� �۵��� �� ���� ����� �����
				System.out.printf("%d * %d = %d\n", f, ff, f*ff);
			}
		}
		*/
		
		/*[���빮��]
		 * ������ 5�� ~ 7�ܱ��� ����� �ϵ�, 4������ ���������� ������ ���ı��� ����Ͻÿ�
		 * �ش� ������� �� �հ踦 ����ϼ���.*/
		
		int a, aa;
		int total = 0;
		
		for (a=5; a<=7; a++) {
			for(aa=1; aa<=4; aa++) {
				//System.out.printf("%d * %d = %d\n", a, aa, a*aa);
			total +=aa*a;
			}
		}
		//System.out.printf("�� �հ� : %d",total);
		//==//
		
		
	
		
		
		
		
		
	}

}
