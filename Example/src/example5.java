import java.util.Arrays;

public class example5 {

	public static void main(String[] args) {
		
		/* 2���迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * 
		 * ��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�.
		 * 
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_level : gold vip guest gold vip vip guest
		 * ������ : �̼���, �������, ������
		 */
		String arr[][] = { 
				{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
				{"gold", "vip", "guest", "gold",  "vip", "vip", "guest"}
				};

		//System.out.println();
		vip_lists(arr);
		
	}

	public static void vip_lists(String vips[][]) {
		int ea = vips.length; //�迭 ���� (2)
		int ea2 = vips[0].length; //��ü ���� (7)
		int f=0;

//		String vip_user[] = new String[3];
	
		for(f=0; f<ea2; f++) {
			if(vips[1][f].equals("vip")) {
				System.out.print(vips[0][f] + " , ");		
			} 

//		while(f<ea) {
//			int ff = 0;
//			while(ff<ea2) {
//				if(vips[1][f].equals("vip")) {
//					
//					System.out.println(vips[0][f]);
//				}
//				ff++;
//				}
//			f++;
			}
		
		}
		
	}
