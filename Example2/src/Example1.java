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
		int min = 1; // �ּҰ�
		int max = 9; // �ִ밪 - 1
		Random random = new Random();
		int pcrd = random.nextInt(max + min) + min;
		System.out.println(pcrd); // ������
//		int user_input = sc.nextInt();
//		ex2.setter(int user_input, int pc_num);
 //==============================================
		
		int re;

		for(re=5; re>0; re--) {
		System.out.printf("�� ��ȸ�� %s �� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� ���� ��ȣ�� �Է����ּ���.\n", re);
		int user_input = sc.nextInt();
			if( pcrd == user_input) {
				System.out.println("����");
				break;
			}
			else if( pcrd < user_input) {
				System.out.printf("DOWN \n", re-1);
			}
			else if( pcrd  > user_input) {
				System.out.printf("UP \n", re-1);
			}
			if (re == 1) {
				System.out.println("\n���� ������ " + pcrd);
				break;
			}
		}
		sc.close();
		System.exit(0);
		
	}

}
