import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���!");
		//String memo = a.next(); // next : �����̽��� �� ���� �Է��� ���.
		String memo = a.nextLine(); // nextLine : ���� ������ �� ���� (�����̽��� ����) �Է��� ���.
		System.out.println(memo);
		
		a.close(); // scanner ���Ḧ �⺻���� �����ؾ��Ѵ�.
		
		/* ���� : park
		 * ���� : 25*/
		
		
		String name = "park"; // String+���� = %s
		int age = 25; // ���� = %d
		/* [�߿����] 
		 * float,double = %f
		 * date, time(�ð�, ��¥) = %t
		 * boolean(true,false) = %b
		 * */
		
		//System.out.println(name +"���� ���̴� " +age+ "�Դϴ�");
		//printf : f�� ���� format.
		System.out.printf("%s���� ���̴� %d�Դϴ� ", name, age);
	
	}

}
