import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ���� ���α׷��Ӱ� �ش� DB(database)�� ���� 
		 * Ȧ�� ���� ���� �� ������ �ް��� �Ѵ�. 
		 * �ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.
		 */
		
		odbc od = new odbc();
		
		System.out.println(od.data1());
		

	}

}

class odbc {
	private int re;
	private int ct = 0; // Ȧ�� �� ��� +1�� �����ϱ� ���� �ʵ� ������.
	private int odata[]; // �迭���� ������� �ʵ��� ����.

	private int ori [];
	
	public odbc() {
			
		int odata[] = {15, 22, 17, 14, 32, 35, 19, 33}; //Ȧ�� 5��
		this.ori = odata;
		int odata_ea = odata.length; //8��
		int odata_em[] = new int [10];

			for (re = 0; re < odata_ea; re++) {
			if(odata[re]%2==1) {
//				System.out.println(odata[re]); // Ȧ�� ���
//				odata_em[ct] = odata[re];
				ct++;
			}
		}
	}
	
	public int data1() {
		return this.ct; //�������� return��Ŵ
	}
}