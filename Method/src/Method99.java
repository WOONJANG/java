import java.util.Arrays;

public class Method99 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 *�����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ����Դϴ�.
		 *�ش� �޴��� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ� (Y, N)���� �����մϴ�
		 *�ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1���迭�� �籸�� �� ���ο��� ��µǵ��� �մϴ�.
		 *��� : [���Ϲ��, ����������, ���ڽ�, �̺�Ʈ, �߼�]
		 * ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */
		menuss me = new menuss();
		// ������
		System.out.println(Arrays.toString(me.get()));
		

	}

}

class menuss {
	
	private String mdata[][];
	private String rdata[];
	String a;
	
	public menuss() {
		//=====================================================
		String ms [][] = {
				{"���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�"},
				{"Y", "Y", "N", "Y", "Y", "N", "Y"}
		};
		//=====================================================
		this.mdata = ms;
		redata();
	}
	
	public void redata () {
//		System.out.println(this.mdata[0]);
		int ea = this.mdata[0].length;
		int w =0;
		String em[] = new String[ea];
		int ct =0;
		
		do {
			if(this.mdata[1][w].equals("Y")) {
//				System.out.println(mdata[0][w]);
				em[ct] = this.mdata[0][w];
				ct++;
			}
			w++;
		}while(w<ea);
		this.rdata = em;
	}
	public String[] get() {
		
		return this.rdata;
	}
}



/*
 * class aaa{
 * int a;              -> field
 * String b;
 *     public aaa(){    -> constructor
 *     
 *     }
 *     
 *     -> method
 *     public void
 *     public static void       
 *     public String abc
 * 
 * }
 * 
 * 
 * 
 * */
