
public class Switch1 {

	public static void main(String[] args) {
		
		/*
		 * switch ~ case�� : ���ù� 
		 * �Էµ� �� �������� case�� �ߵ��Ͽ� ��°��� �����ϰ� �ȴ�.
		 * default �� case�� ���� �� ���� ������ �������� ���� ��� �۵��Ǵ� �����̴�.
		 * switch(���ڰ�)
		 * 10�� �̻� ���� ��������.
		 */
		int n = 3; //case3 ����
		switch(n) {
		case 1:
			System.out.println("�ɼ�1�� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("�ɼ�2�� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�ɼ� 3�� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("������ ���� �����ϴ�.");
		break;
		}

		String user = "����"; //���ڷ� switch���� ���ڰ� ����
		switch(user) { // ���� case����.
			case "�̼���":
			case "�� ����":
			case "����":
			case "�̼� ��":
			case " ����":
			case "Yeesunshin":
				System.out.println("A�� �Դϴ�.");
			break;
			case "ȫ�浿":
				System.out.println("B�� �Դϴ�.");
			break;
			case "������":
				System.out.println("C�� �Դϴ�.");
			break;
			default:
				System.out.println("�������� D�� �Դϴ�.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
