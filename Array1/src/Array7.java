import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� ���� �˴ϴ�.
		 * �� �� ���������� ���� 3�̸��� ���� Ȯ���Ͽ� �迭 �����͸� �簡�� �մϴ�.
		 * 
		 * "ȫ�浿", "�̼���", "������", "�������", "������", "������"
		 * 4, 3, 1, 1, 2, 2
		 * 
		 * ��� - ["������", "�������", "������", "������"]
		 */
	
		String member1[] = {"ȫ�浿", "�̼���", "������", "�������", "������", "������"};
		int member_ea = member1.length;
		int lv1[] = {4, 3, 1, 1, 2, 2};
		int lv_ea = lv1.length; //6��
		int em [] = new int [6]; //6ĭ�� �� ����
		int em_ea = em.length;
		int w=0;
		int ct1 =0;
		
		do {
			if (lv1[w]<3&&ct1<em_ea) {

				em[ct1] = lv1[w];
				ct1++;
			}
			w++;
		}while(w<lv_ea);
		System.out.println(Arrays.toString(em));
		

		
		String member[] = {"ȫ�浿", "�̼���", "������", "�������", "������", "������"};
		int lv[] = {4, 3, 1, 1, 2, 2};
		
		String new_member[] = new String[8];
		
		int mem_ea = member.length;
		int f;
		int ct = 0;
		for(f=0;f<mem_ea;f++) {
			if(lv[f] < 3) {
				new_member[ct] = member[f];
				ct++;
			}
		}
		System.out.println(Arrays.toString(new_member));
		//Arrays.toString : ���� ���� �Ҽ� [] ���� �迭 �������� ����ϴ� �Լ��Դϴ�.
		
		
		
		
		
		
		
		
		
		
	}

}
