import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		//�� �迭 ������ �����Ͱ� �ִ� �迭�� Ŀ���� ���.
		int a[] = new int [3]; //[3]���� ������ ������. a �����
		int b[] = {1, 2, 3, 4, 5, 6, 7}; //7���� ��ü�� �ִ� ��Ȳ. b 7���� ��ü
		int ea  = b.length; // b �迭 �ȿ� ��� ��ü�� �ִ���
//		System.out.println(a.length);
		int a_ea = a.length; //a�� ����
		int w = 0;
		int ct  = 0;
		do {
//			System.out.print(b[w] + " ");
			if(b[w]%2==0 && ct < a_ea) { // if(b�迭�� �� �� ¦���� && ���ο� a�迭�� ��ü ��üũ�⸸ŭ��)
				a[ct] = b[w];
				ct++; // ������ ������, �ε��� ��ȣ�� +1�� ������Ŵ.
			}
			w++;
		}while(w<ea);
			System.out.println(Arrays.toString(a));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
