import java.util.ArrayList;

public class Exception7 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88 }
		 * �ش� ������ ���� ���ڰ��� ��� �ǵ��� �� �迭 �Ͻÿ�.
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter)�� ����
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�Ͽ� �����մϴ�
		 * getter���� �ش� �迭�� return���� ���������մϴ�.
		 * ��, �ܺ�Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */

		try {
			redata rd = new redata();
			Object data[] = {"ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };
			rd.setter(data);
			ArrayList result = rd.getter();	// return�޴� ���� �迭 class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� �ȴ�..
			System.out.println(result);
		}catch(Exception z) {
			if(z.getMessage() != null) {
			System.out.println(z.getMessage());
			}
		}

	}
}
	class redata{
		ArrayList<String> ar = new ArrayList<String>();
//		ArrayList<Integer > ar2 = new ArrayList<Integer>();
		
		public void setter(Object call[]) throws Exception {
			int ea = call.length;
			for(int f=0; f < ea; f++) {
				try {
				//�ش� �迭�� �ε�� (�ڷ���) ��ȯ�� �ϴ� ������ Object�迭�� �����߱� ����.
				String check = String.valueOf((String)call[f]);
//				int check2 = Integer.valueOf((int)call[f]);

				ar.add(check);
//				ar2.add(check2);
				
				}catch(Exception ex) {
					// �ڽ� class ���� ���� �߻��� ��µǴ� catch��.
					// ��, throw ����ϸ� �ٽ�main���� ���޵ȴ�.
					// �߿��� ������ throw�� ���޽� �ش� �ݺ����� ����
					
					
				}
			}
//			System.out.println(this.ar);
		}
		public ArrayList<String> getter() {	//�迭 class �̸����� getter�� ���� �� �ִ�.

			
			return this.ar;
			
		}
		
	}


