import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {

		/*[���빮��]
		 * �迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * Product : ���� ���� ��� �� ���� Ű�� �ٳ��� ���� ��
		 * ���� �� Ű���� ���� �Ͽ����ϴ�.
		 * �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ�
		 * �ݺ����� ����.
		 * ��� - [����, ���, ����, �ٳ���, ����]
		 */
		
		String product []  = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"}; 
		
		
		datas(product);

	}

	public static void datas (String f[]) {
/*
		int n = f.length; // product ��ü �� 8��
		int re; //�ݺ�
		int ct=0;
		String re_product[] = new String[5];
		
		for(re=0;re<f.length;re++) {
			if(f.equals("����") ||f.equals("��")||f.equals("Ű��")) {
			 	re_product[ct] = f[re];
			 	ct++;
			}
		}


*/
		
		int no = 5;
		String re_product[] = new String[no];
		int index = 0;
		for (String p : f) {
			if(!p.equals("����") && !p.equals("��") && !p.equals("Ű��")) {
				re_product[index] = p;
				index++;
			}
		}
		System.out.println(Arrays.toString(re_product));
	}
}

