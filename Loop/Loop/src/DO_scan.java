import java.util.Scanner;

public class DO_scan {

	public static void main(String[] args) {

/*����ڰ� �� 3���� �Է��� �մϴ� 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.*/
		
		Scanner sc = new Scanner(System.in);
		
		int r = 1;
		int input;
		long total = 1; //long �Է½� ���� ������� ������ �߻���.
				
		do {
			System.out.printf("%d ��° ���� �Է� : ", r);
			input = sc.nextInt();
			total *= input;
			r++;
		} while(r<=3);
		System.out.printf("�Ѱ����� : %d", total);
sc.close();
	}

}