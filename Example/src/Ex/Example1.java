package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Example1 {

	public static void main(String[] args) {
		// �ܺ� class�� ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�.
		/*
		 * ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�.
		 * ��, 2���� �迭�� �ϳ��� �迭�� ��Ĥ���� �մϴ�. �״�� �ߺ��� ���� �ϳ��� ó���� �ϼž��մϴ�.
		 * 
		 * DB1 = {11, 22, 33, 44, 55};
		 * DB2 = {8, 10, 11, 19, 44};
		 * 
		 * ��� [8, 10, 11, 22, 33, 44, 55]
		 */
		/*1. 1,2�� DB �ߺ��� �� �� 2�� �迭 ����
		 *2. 2�� DB�� 1�� DB�� �߰�
		 *3. 1�� DB�� sort�� ���� 
		 */
		outclass ot = new outclass();
		ot.filter();
		
	}

}

class outclass {
	
 
/*
	public Integer arr1[] = {11, 22, 33, 44, 55};
	public Integer arr2[] = {8, 10, 11, 19, 44};
//	public Integer arr3[] = new Integer[7];
	
	public void filter() {

	//	ArrayList<Integer> ar3 = new ArrayList<>(); 
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(this.arr1));
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(this.arr2));
		
		for (int f = 0; f < ar2.size(); f++) {
			ar1.add(ar2.get(f));
		}
//		System.out.println(ar1);
		for(int a=0; a < ar1.size(); a++) {
			for (int b = a+1; b < ar1.size(); b++) {
				if(ar1.get(a) == ar1.get(b)) {
					ar1.remove(a);
	//				System.out.println(ar1.remove(a));
				}
			}
		}
		Collections.sort(ar1); // ��������
		System.out.println(ar1); 
		
		
	}
	
*/	
	

	
	
	
	
	
	
	
	
	int a[],b[];
	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;

	public void filter () {
		Integer[] a = {11, 22, 33, 44, 55};
		Integer[] b = {8, 10, 11, 19, 44};
		a1 = new ArrayList<Integer>(Arrays.asList(a));
		b1 = new ArrayList<Integer>(Arrays.asList(b));
		

		int w = 0;
		while(w < this.a1.size()) {
			int dw = 0;
			int ea = this.b1.size();
			do {
				if(this.a1.get(w) == this.b1.get(dw)) {
					this.b1.remove(dw);
					this.b1.add(dw,0);
				}
				dw++;
			}while(dw < ea);
			w++;
		}
		for(int t = 0; t < this.b1.size(); t++) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
		}
		Collections.sort(this.a1);
		System.out.println(this.a1);
	}
}