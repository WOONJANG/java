import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 	extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��Ͻÿ�.
		 	���� �ΰ��� �Է��մϴ�.
		 	�ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ �մϴ�.
		 	ù��° ���ڰ� �ι�° ���� ���� ���� ���
		 	ù��° ���ڰ� �ι�° ���� ���� Ŭ ���
		 	ù��° ���ڿ� �ι�° ���ڰ� ���� ���
		 	
		 	ù��° ���ڰ� ���� ��� : �ش� �ΰ��� ���� ��ģ ����� ���
		 	ù��° ���ڰ� Ŭ ��� : �ش� ���� ��ŭ ���ڸ� ��� ���� ��� �� ex) 10, 6 = 10+9+8+7+6
		 	�� ���ڰ� ���� ��� : "�ش� ���� �����ϴ�" ���.
		 */
		ca2 c11 = new ca2(); // �ҷ�����
		
// =================����� �Է¹��==========================		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int user1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int user2 = sc.nextInt();
		
		c11.asd1(user1, user2); // ��������
		c11.asd2(); // �ҷ��� �� ���
		
		sc.close();
		System.exit(0);
//======================================================
//=====================���� ���===========================
/*
		int num1 = 10;
		int num2 = 1;
		System.out.println("ù��° ���� : " + num1 + "\n�ι�° ���� : " + num2);
		c11.asd1(num1, num2);
		c11.asd2();
	 	System.exit(0);
*/		
//======================================================		
	}
}

class ca1{ 
	protected int aa;
	protected int bb;
	protected int cc;
	protected int total = 0;
	public String msg = "";
	
	public void asd1 (int n1, int n2) {
		this.aa = n1;
		this.bb = n2;
	}
} 

class ca2 extends ca1{ 
	 public void asd2 () {
		 if (this.aa < this.bb) {
			this.cc = aa + bb;
			System.out.println(this.cc);
		 }
		 else if (this.aa > this.bb) {
			 int re = this.bb;
			 for(re = this.bb; re <= this.aa; re++) {
				total += re; 
			 }
			 System.out.println(total);
		 }
		 else {
			 msg = "�ش� ���� �����ϴ�.";
		 }
		 System.out.println(msg);
		 System.exit(0);
	 } 
}