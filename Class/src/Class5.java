import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
//		Member2.lists2(); // �޸𸮿��� �ε�
		
//		Member2 mb2 = new Member2(); //static�� ���� �Լ� �̹Ƿ� ��ü �� �ν��Ͻ��� ����.
//		mb2.lists();	//�ν��Ͻ��� �ִ� �޼ҵ带 �ε��ϰ� ��.
		
//		Member2.list3("������", 123456);
		
		/*[���빮��]
		 * for_in �̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
		 * ���α׷� ����� ������ ���� ������ �մϴ�. 
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ��� : "
		 * [���] - �ش� �޼ҵ忡�� ����� ����ؾ���.
		 *	���� ����ڰ� 3���� �Է½�,
		 * 3*1=3.... 3*9=27 ��� �Ǿ����. 
		 * �ݺ����� for������
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���. : ");
		int user_in = sc.nextInt();
		Member2.for_in(user_in);
		sc.close();
	}



class Member2 {
/*
	public void lists () {	//�޸𸮿� ���� �Ҵ���� �޼ҵ� �Լ��� ����.
		String a = "ȫ�浿";
		System.out.println(a);
		
		
	}
	public static void lists2 () { //static �޸𸮿� �Ҵ��� �ϰ� �޼ҵ� �Լ� ����.
		String a = "�̼���";
		System.out.println(a);
	}
	
	public static void list3(String nm, int pw) {
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ��� �� ��� (nm.equals("������")) 
		
		
		
		int user_pw = pw;	//�޼ҵ忡 ��ü���� ÷���Ͽ� load �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����.

		if(nm.equals("������") && user_pw == 123456) {
			
			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�");
		}
		
		else {
			
			System.out.println("��ȸ�� �Դϴ�");
		}
	}
}
*/

	public static void for_in (int re) {
		int f;

		for(f = 1; f<10; f ++) {

			System.out.printf("%d * %d = %d\n",re, f,( re*f));
	}
	}
}
}