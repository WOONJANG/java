import java.util.Arrays;

public class example1 {

	public static void main(String[] args) {

		/*[���빮��] �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * 1�� �迭�� ������ ���� ���� �ֽ��ϴ�.
		 * �迭 ����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 * �ش� ��ü ���� ��� ���� �� �հ� ����
		 * ������ �޼ҵ�� ó���ǵ��� �մϴ�.
		 * ��, �ݺ����� do~while������ �ۼ�.
		 * 
		 */
		
		int arr[] = {22, 33, 44, 55, 66, 77, 88, 99};
//=====================================================void
		//void = ��ü���� + �ν��Ͻ�(�޸�) ���
		example1 ex = new example1(); //void
		ex.datas(arr); //void
//=====================================================static		
//		datas(arr); // arr�� datas�� arr_datas�� ������  // static 
	}

//=====================================================static
/*
	public static void datas (int arr_datas[]) {
		
		int re = 0; //�ݺ�
		int total = 0; //�հ�
		int n = arr_datas.length; //�迭�� ��ü ��
//		System.out.println(n); 8��
//		System.out.println(Arrays.toString(arr_datas)); �迭 [22, 33, 44, 55, 66, 77, 88, 99]
		do {
			total += arr_datas[re]; //total = ���� �Ű�����[�ݺ�]
			re++;
		} while (re < n); //�ݺ� < �迭 ��ü �� (8��)
		
		System.out.println("arr �迭�� �հ�� " + total);
	}
*/
//======================================================void
	public void datas(int arr_datas[]) {
		
		int re = 0; //�ݺ�
		int total = 0; //�հ�
		int n = arr_datas.length; //�迭�� ��ü ��
//		System.out.println(n); 8��
//		System.out.println(Arrays.toString(arr_datas)); �迭 [22, 33, 44, 55, 66, 77, 88, 99]

		do {
			total += arr_datas[re]; //total = ���� �Ű�����[�ݺ�]
			re++;
		} while (re < n); //�ݺ� < �迭 ��ü �� (8��)
		
		System.out.println("arr �迭�� �հ�� " + total);
	}
}
