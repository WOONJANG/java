import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
/*
		int num = 3;
		datalist da = new datalist(); // nm
		da.array_data(num);

//		String pay = "�ſ�ī��";
		String pay = "������ü";
		if(pay.equals("�ſ�ī��")) {
			da.pay1(); //�ش� ���ǿ� �´� �޼ҵ带 ȣ��.
		}
		else {
			da.pay2(pay);	//�޼ҵ忡 ��ü���� �¿��� ����(��ü���� ���Ѵ�)
		}
*/		
		/*[���빮��]
		 * �ش� �ε� �� class���� agrees��� �̸��� ������ �ֽ��ϴ�.
		 * main  �޼ҵ忡�� ����ڰ� "������", "���Ǿ���"�� �Է��ϰ� �˴ϴ�.
		 * ���������� �Է� �Ǿ��� ���, "ȸ�������� ���� �˴ϴ�." ��� �޼��� ����ϰ�
		 * ���Ǿ������� �Է� �Ǿ��� ���, "���Ǹ� �ϼž� ���� �˴ϴ�."
		 * ��� ��� �ǵ��� �Ͻÿ�.
		 * ��, agrees Ŭ���� �ȿ� void  �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ or ���Ǿ���\n");
		String input = sc.next();
		agrees agree = new agrees();
		agree.ag(input);
		sc.close();
		
	}

}

class datalist {
		//static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κп����� static�� �̿��Ͽ� ���.
		//static (���� �޼ҵ�) : �������̵��� ����� �� ����.
		//void(���� �޼ҵ�)�� ���� : �������̵��� ����� �� ����.
		/*�������̵� ���� :
		class a{
			void �޼ҵ�
		}
		class b extend a {
			void �޼ҵ�
		}
		*/
	/*
	public void array_data(int a) {	//static�� ���� �޼ҵ�
		int w = 1;
		while (w <= 9) {
			System.out.println(a * w);
			w++;
		}
	}
	public void pay1(){
	System.out.println("�ſ�ī��� ���� ���� �մϴ�.");
	}
	public void pay2(String pm){
	System.out.println(pm +"���� ���� ���� �մϴ�.");
	}
*/
	
}



class agrees{
	public void ag (String a) {
		String msg = "";
		if(a.equals("������")) {
//			System.out.println("ȸ�������� ���� �˴ϴ�.");
			msg = "ȸ�������� ���� �˴ϴ�.";
		}
		else if (a.equals("���Ǿ���")) {
//			System.out.println("���Ǹ� �ϼž� ����˴ϴ�.");
			msg = "���Ǹ� �ϼž� ���� �˴ϴ�.";
		}
		else {
			System.out.println("'������' or '���Ǿ���' �� �Է����ּ���");
		}
		System.out.println(msg);
	}
}
