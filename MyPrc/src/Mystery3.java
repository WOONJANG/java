import java.util.Scanner;

public class Mystery3 {

	public static void main(String[] args) {
		
		//7000���� 1�Է� ���� 2�Է� ������ ���������ݾ�
		
		Scanner sc = new Scanner(System.in);
				
		final int sale = 7000;
		int a;
		int total =0;
		
		for(a=1; a<=4; a++) {
			System.out.println("7000�� ���� �Ͻðڽ��ϱ�");
		int in = sc.nextInt();
			if (in == 1) {
				total += sale;
			}
		}
		System.out.println("�� �����ݾ���" + total +"�� �Դϴ�");
sc.close();
	}

}
