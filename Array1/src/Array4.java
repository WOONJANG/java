import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		String[] names = new String [3]; //���� ���� �迭 ������ ��������.
		
		String name[] = {"ȫ�浿","�̼���","������" }; // �迭���� �����Ͱ� �ִ� ����.
		int ct = 0; // foreach���� �ε��� ��ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ�� �������ֱ� ���� ����.
		for (String a : name) {
//			System.out.println(ct);
			if(a.equals("ȫ�浿") || a.equals("������")) { // �ش� (����)�迭�� �� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���.
				
				names[ct] = a;
				ct++; // �ε��� ��ȣ�� ���������� �����ϱ� ���� ������.
			}
		}
		int names_ea = names.length;
		System.out.println(Arrays.toString(names));

		
		/*[���빮��]
		 * �迭
		 * ����ڰ� ��ٱ��Ͽ� ������ �����ϰ� �˴ϴ�.
		 * ��, �ش� �ݾ׸���Ʈ�� �����������, ���� ��ü ���� �ݾ׸� ��µǵ��� �մϴ�.
		 * 
		 * 1500 22000 13000 14500 113800 45000
		 * */
		int price [] = {1500, 22000, 13000, 14500, 113800, 45000 } ;
		int total = 0;
		int a;
		for (a=0; a<price.length; a++) {
			total += price[a];
		}
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
