
public class Array2 {

	public static void main(String[] args) {
		
		/* hong
		 * kim
		 * park
		 * lee
		 * jang
		 * jung
		 *  */

//		String fn[] = {"hong", "kim", "park", "lee", "jang", "jung"};
//		System.out.println(fn[4]);
//		int word = fn[4].length();
//		System.out.println(word);
		/*[���빮��]
		 * �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ��½�Ű�ÿ�. 
		 */
/*
		int member = fn.length;
		int w=0;
		int word; // ������ �迭 �������� ���� �����ľ�
		do {
			word = fn[w].length(); // ���ڰ����ľ�
			if(word>3) { // ���ܾ� �̻��� �����͸� ���
				System.out.println(fn[w]);
			}
			w++;
		}while(w<member);
*/
		
		/*[���빮��]
		 * �迭 �����ʹ� ������ ����
		 * 15 60 11 14 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�.
		 */
		
		int num[] = {15, 60, 11, 14, 27}; //�迭
		int p = num.length; //�迭 ���� �ľ�
		int re=0; //�ݺ�
		int total = 0; //�հ�
		
		//for��
		for(re=0;re<p;re++) {
			total += num[re];
		}
		System.out.println(total);
		
		//while��
		while (re<p) {
			total += num[re];
			re++;
		}
		System.out.println(total);
		
		//do while��
		do {
			total += num[re];
			re++;
		} while (re<p);
			System.out.println(total);
			
		
		
		
		
	}

}
