
public class If_for {

	public static void main(String[] args) {

		final int a =1; // final ���� �������� ����� ����ȴ�.
		//��� : ���� ������ �ʴ� ��.
		final String name = "ȫ�浿";
		//name = "�̼���";
//		System.out.println(name);
//		System.out.println(a);

		
		final int ct = 10; //������
		int f ;  //�ݺ���
		boolean ok = false; //���ǿ� ���� true,false
		for (f=1; f<11;f++) {
		
			if (f==ct){ //�ݺ��� ���� �������� ���� ���
			System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
			ok = true; // ���ǿ� ���� �� ����
			}
		}
		if (ok==false) { //���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ���, ��µǴ� �ڵ�.
			System.out.println("Ȯ���� ���� �ʴ� ���� �Դϴ�.");
		}
		
		/* �� �������� ���� �ݺ�. �� �� Ȧ�� ���� ����ϵ����մϴ�.*/
		/*
		int ff;
		String odd = " ";
		
		for (ff=1;ff<=20;ff++) {
		
			if (ff % 2 != 1) {
			System.out.print(ff + " ");
			}
			else { //���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰԵȴ�.
				odd +=  ff + " " ; //�߰� �Ұ�� " " ������� Ȱ���Ͽ� ����
			}
		}
			System.out.println(odd);
	*/
		
		
		
	}

}

