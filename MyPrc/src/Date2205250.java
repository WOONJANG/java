import java.util.Scanner;

public class Date2205250 {

	public static void main(String[] args) {

		//���빮�� 2�� �� ���� �ڵ��϶�
		
		 int a; 
		 int b = 2; 
		 int c; 
		 int total = 0;
		 
		 for (a=1; a < 10; a++){ 
		 c = b*a; 
		 total += c; 
		 }
//		 System.out.printf("%d ",total);
		 
		
		
		
		//���빮�� �Էµ� �������� ���� �ڵ��϶�
	
	Scanner sc = new Scanner(System.in);
	System.out.println("� �������� �� ���� ���Ͻʴϱ�?");
	int ipgugu = sc.nextInt();
	int aa;
	int bb;
	int total2 = 0;
	
	for (aa=1; aa<=9; aa++) {
		bb= ipgugu * aa;
		total2 += bb;
		sc.close();
	}
	if (total2%2==0) {
		System.out.printf("�Է��Ͻ� %d���� �� ���� %d�̸�, �� �հ�� ¦���Դϴ�.", ipgugu, total2);
	}
	else {
		System.out.printf("�Է��Ͻ� %d���� �� ���� %d�̸�, �� �հ�� Ȧ���Դϴ�.", ipgugu, total2);
	}
	//System.out.printf("%d", total2);
	 
	
	}

}
