import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		/*[���빮��]
		 * 2���� ������ �迭�� �ֽ��ϴ�. �ش� ������ �迭�� ���� ���ó�� ���� ����Ͻÿ�.
		 *  data1 {"���ѹα�", "�Ϻ�", "�߱�", "��Ʈ��", "�±�"}
		 *  data2 {40, 35, 70, 55, 32 }
		 *  ���data
		 *  ["���ѹα�(40)", "�Ϻ�(35)", "�߱�(70)", "��Ʈ��(55)", "�±�(32)"]
		 *  
		 * */
/*		
		String arr[][] = {
				{"���ѹα�", "�Ϻ�", "�߱�", "��Ʈ��", "�±�"},
				{"40", "35", "70", "55", "32" }
		};
		String em[] = new String [10]; //�� ������ 10ĭ
		int arr1 = arr.length; //�� ������ 2��
		int arr2 = arr[0].length; // �����ʹ� ��ü 5��

		int a,s;

		for(a=0;a<arr1;a++) {
//			System.out.println(Arrays.toString(arr));
			for(s=0;s<arr2;s++) {
				System.out.println(arr[a][s]);
			}
		}
		System.out.print(em[a] + "(" + em + ")");
*/		
/*		
		String arr[][] = {
				{"���ѹα�", "�Ϻ�", "�߱�", "��Ʈ��", "�±�"},
				{"40", "35", "70", "55", "32" }
		};
		
		int ar1 = arr.length; // ������ ��
		int ar2 = arr[0].length; //��ü ��
		String newarr[] = new String[arr[0].length]; //= ar2
		
		int w=0;

			do {
				//System.out.println(arr[w][ww]);
				newarr[w] = arr[0][w] + "(" + arr[1][w] + ")";
				w++;
			}while(w<ar2);
			

		
//		System.out.println(Arrays.toString(newarr));
*/		
		
		
/*[���빮��]
 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭���� �ε����� ���� ��ȣ�� ���ؼ�
 * ¦��,Ȧ�� ������ �迭 ��� �����ͷ� �缳�� �Ͻʽÿ�.
 * ADATA {5, 17, 19, 22, 33}
 * BDATA {1, 2, 3, 4, 5}
 * RESULT = [¦��, Ȧ��, ¦��, ¦��, ¦��]
 */

/*
		int datas [][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		int datas1 = datas.length;
		int datas2 = datas[0].length;
		
		String result [] = new String [datas2];
		
		
		int w =0;
		do {
			
			int sum = datas[0] + datas[1];
			if (%2==0) {
				System.out.println("¦��");
			}
			else {
				System.out.println("Ȧ��");
			}
			w++;
		}while(w<datas2);
		
		System.out.println(Arrays.toString(result));
		
*/		

		int A1 [][] = {
						{5, 17, 19, 22, 33},
						{1, 2, 3, 4, 5}
		};

			int data_ea = A1[0].length;
			int f =0;
			int total;
			String result;
			String result_data[] = new String[data_ea];
			
			while(f<data_ea) {
				total = A1[0][f] + A1[1][f];
				
				if(total%2==0) {
					result = "¦��";
				}
				
				else {
					result = "Ȧ��";
				}
				
				result_data[f] = result;
				f++;
			}
		System.out.println(Arrays.toString(result_data));
		
		
		
		
		
		
	}

}
