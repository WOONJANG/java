import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ������ �ѱ۷� ǥ�� �Ͻʽÿ�?\n[������]\n����, ��Ȳ, ���, �ʷ�");
		String color = sc.next();
		String msg = "";
		switch (color) {
		case "����" -> {
			msg = "red";
		break;
		}
		case "��Ȳ" ->{
			msg = "orange";
		break;
		}
		case "���" ->{
			msg = "yellow";
		break;
				}
		case "�ʷ�" ->{
			msg = "green";
		break;
		}
		default  -> {
			msg = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�.";
		break;
		}
		}
		System.out.println(msg);
		sc.close();
	}
}
