import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 A��Ʈ : PC���� , Scanner(5) 
		 B��Ʈ : PC���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ���ó��
		 
		  PC�� ���ڸ� �ϳ� ����. ( 1 ~ 10 )
		  ��ȸ�� �� 5��.
		  �� ��ȸ�� 5�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� ���� ��ȣ�� �Է�.
		  ex PC�� 7�� ���, ����� ���ڿ� ��
		  -PC 7 vs ����� 2 = > ��� UP
		  �� ��ȸ�� 4�� ���ҽ��ϴ�.
		  PC 7 vs ����� 4 = > ��� UP
		  �� ��ȸ��  3�� ���ҽ��ϴ�.
		  PC 7 vs ����� 7 => �����Դϴ�. ���ÿ� ��� ���μ��� ����.
		  
		 */
		Example2 ex2 = new Example2();
		Scanner sc = new Scanner(System.in);
//==============================================
						//���� ��ƿ ����
		Random random = new Random();
		int pcrd = random.nextInt(10) + 1; // pc ������
	//	System.out.println(pcrd); // pc ������ ��� Ȯ��
 //==============================================
/*						//�Ϲ� ���� ���� (random double)
		double pcrd2 = (int)(Math.random()*10+1);
		System.out.println(pcrd2); 													*/
//==============================================
		
		int w = 5;
		
		do {
			System.out.printf("�ܿ� ��ȸ : %d \n���� �Է� : ", w);
			int user = sc.nextInt();
			ex2.ex22(pcrd, user);
			String out = ex2.result();
			System.out.println(out);
			int check = out.indexOf("����"); //inexOf : �ܾ� �˻�  (-1 : ����.) (0 : ����.)
			if(check == 0) { // ������ ��� ����
				break;
			}
			w--;
		}while(w > 0);
	}

}
