import java.util.Scanner;

public class while_scan1 {

	public static void main(String[] args) {
		
		/* [���빮��]
		 * �� 2���� ������ �ϰ� �˴ϴ�. 
		 * ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� Scanner �����Ͻÿ�.*/

			Scanner sc = new Scanner(System.in);
			
			
			int input; // ����� �Է�
			int r = 1; //�ݺ���
			int total=0; //��
			
			while (r <= 2) {
				System.out.printf("%d��° ���ڸ� �Է��ϼ���\n", r);
				input = sc.nextInt();
				total += input;
				r++;
			}
			System.out.printf("�� ���� ���� %d �Դϴ�", total);
			sc.close();
	}

}
