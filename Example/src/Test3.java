import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {


/*		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���??");
		 int ipgugu = sc.nextInt();
		 int aa;
		 int bb;
		 int total = 0;
*/
// for��		 
/*		 for (aa=1; aa<=9; aa++) {
			 bb= ipgugu * aa;
			 total += bb;
		 }
		 if(total%2==0) {
			 System.out.printf("�Է��Ͻ� %d���� �������� ������ %d �̸�, �� ������� ¦���Դϴ�.", ipgugu, total);
		 }
		 else {
			 System.out.printf("�Է��Ͻ� %d���� �������� ������ %d �̸�, �� ������� Ȧ���Դϴ�.", ipgugu, total);
		 }
		 //System.out.printf("%d", total2);
*/
		
//do while��
		 Scanner sc = new Scanner(System.in);
		 int user = sc.nextInt();
		 String msg = " �����ܿ� ���� ���ڸ� �Է��ϼ���?";
		 int total =0;
		 System.out.println(msg);
		 int f= 1;
		 do {
			 //total = total + (ipgugu * f);
			 total += user*f;
			 f++;
		 } while (f <=9);
		 //System.out.println(total);
		
		 String msg2;
		 if(total%2==0) {
			 msg2 = "¦��";
		 }
		 else if (total%2==1){
			 msg2 = "Ȧ��";
		 }
		 System.out.printf("������� %s �Դϴ�",msg);
		 sc.close();
	}

}
