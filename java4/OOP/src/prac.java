import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		sub1 s1 = new sub1();
	}
}

class sub1 {
	
	Scanner sc = new Scanner(System.in);
	private String name;
	
	public sub1() {
		this.sub2();
	}
	
	public void sub2() {
		System.out.println("�̸��Է�");
		this.name = sc.next();
		this.sub3();
	}

	public void sub3() {
		if(this.name.equals("���")) {
			System.out.println("�̸�Ȯ��");
			System.exit(0);
		}
		else {
			System.out.println("Ȯ�κҰ�");
			this.sub2();
		}
	sc.close();
	}
}