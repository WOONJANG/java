import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 *�����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ����Դϴ�.
		 *�ش� �޴��� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ� (Y, N)���� �����մϴ�
		 *�ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1���迭�� �籸�� �� ���ο��� ��µǵ��� �մϴ�.
		 *��� : [���Ϲ��, ����������, ���ڽ�, �̺�Ʈ, �߼�]
		 * ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */
		menus mn = new menus();
		System.out.println(Arrays.toString(mn.resultdata()));
		
		

	}

}

class menus{
	private String msdata[][];
	private String result[]; 
	
	public menus() {
		//=====================================================
		String ms [][] = {
				{"���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�"},
				{"Y", "Y", "N", "Y", "Y", "N", "Y"}
		};
		this.msdata = ms;
		redata();
	}
		//=====================================================

		public void redata() {
			int navi_ea = this.msdata[0].length;
			int f;
			int ct = 0;
			String navi_em[] = new String[navi_ea];
	
			for (f=0; f<navi_ea; f++) {
				if(this.msdata.equals("Y")) {
					navi_em[ct] = this.msdata[0][f];
					ct++;
				}
				this.result = navi_em;
				}
			}
			public String[] resultdata() {
				
				return this.result;
			
			}
}
	
	




