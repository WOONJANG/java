import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ���� �� ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		 * �ù��� 30000 �� �̻� 
		15000 48000 67000 8000 118200 49800 6000 18700
		
		 */
/*		
		int arr [] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700}; //�迭
		int em [] = new int[4]; //[] ����
		int arr_ea = arr.length; //arr�� ����
		int em_ea = em.length; //em�� ����
		int aa = 0;
		int bb = 0;
		
		do {
			if (arr[aa]>=30000) {
				em[bb] = arr[aa];
				bb++;
			}
			aa++;
		}while(aa<em_ea);
			System.out.println(Arrays.toString(em));
*/
		int arr [] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700}; //�迭
		int arr_ea = arr.length;
		int w = 0;
		int em [] = new int[6]; //[] ����
		int ct = 0; //�ε��� ��ȣ�� 0���� ����
		do {
			if(arr[w]>=30000) {
				em[ct] = arr[w];
				ct++;
			}
			w++;
		}while(w<arr_ea);
		
		System.out.println(Arrays.toString(em));
	
		}
		

	}


