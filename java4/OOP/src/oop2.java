import java.util.Arrays;

// �迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �űԹ迭�� ����
public class oop2 {

	public static void main(String[] args) {
		
		array1 ar = new array1();		
	}
}

class array1 {
	
	private int ar1[];
	private int ea;
	
	public array1(){
		//�迭�� �ʵ忡 �ִ� ���� �������� ó���ϴ� ���(this.)
		this.ar1 = new int[] {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(Arrays.toString(this.ar1));
		this.ea = ar1.length;
//		System.out.println(ea);	// 7
		
		// 5�̻� �迭�� ����ϱ�
		
		int w = 0;
		String newdata = "";
		while(w < ea) {
			if(this.ar1[w] >= 5) {
//			System.out.println(this.ar1[w]); // 5, 6, 7
			newdata += this.ar1[w] + ",";	// �ش� ���ǿ� �´� ���� ���ڿ��� ��ȯ�Ͽ� ����
			}
			w++;
		}
		
		String ar2[] = newdata.split(",");	// ����� ���ڿ��� split���� �����Ͽ� �迭�� �ӽ� ��ȯ (split�� ���� ���ڴ� �Ұ�)
		int ar2_ea = ar2.length;
		int oridata[] = new int[ar2_ea];	// ���ڿ� ������ŭ �迭 ������ ���� �߰�
		
		int ww = 0;
		
		while(ww < ar2_ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]);	// ���ڸ� ���ڷ� ��ȯ�Ͽ� �ű� �迭 �������� ���� ����
			ww++;
		}
		//		System.out.println(ar2_ea);
		System.out.println(Arrays.toString(oridata));	// [5, 6, 7]
		
		
	}
}