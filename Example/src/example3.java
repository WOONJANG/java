
public class example3 {

	public static void main(String[] args) {

		/*[���빮��]
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * product : ���� ���� ��� �� ���� Ű�� �ٳ��� ����
		 * money : 35000 8000 4000 5500 3800 4400 11000 18900
		 * ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 * ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�.
		 * 75600
		 */
		
		String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		int money[] = {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
		datas(product, money);
		
	}
	public static void datas (String a[], int b[]) {
/*//for��
		int re;
		int ea = a.length; //���� ����
		int total = 0;
		for (re=0;re<a.length;re++) {
			if (!a[re].equals("���") && !a[re].equals("�ٳ���")) { // �ҷ��� �迭[�ε���]
				total += b[re];
			}
		}
		System.out.println("���հ� : " + total);
 */
		//do while ��
		int re = 0;
		int ea = a.length;
		int total = 0;
		do {
			if(!a[re].equals("���") && !a[re].equals("�ٳ���")) {
				total += b[re];
			}
			re++;
		}while(re<a.length);
		System.out.println(total);
	}	
}
