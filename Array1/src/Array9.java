import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		/*[응용문제]
		 * 2개의 데이터 배열이 있습니다. 해당 데이터 배열을 다음 결과처럼 값을 출력하시오.
		 *  data1 {"대한민국", "일본", "중국", "베트남", "태국"}
		 *  data2 {40, 35, 70, 55, 32 }
		 *  결과data
		 *  ["대한민국(40)", "일본(35)", "중국(70)", "베트남(55)", "태국(32)"]
		 *  
		 * */
/*		
		String arr[][] = {
				{"대한민국", "일본", "중국", "베트남", "태국"},
				{"40", "35", "70", "55", "32" }
		};
		String em[] = new String [10]; //빈 데이터 10칸
		int arr1 = arr.length; //총 데이터 2개
		int arr2 = arr[0].length; // 데이터당 객체 5개

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
				{"대한민국", "일본", "중국", "베트남", "태국"},
				{"40", "35", "70", "55", "32" }
		};
		
		int ar1 = arr.length; // 데이터 수
		int ar2 = arr[0].length; //객체 수
		String newarr[] = new String[arr[0].length]; //= ar2
		
		int w=0;

			do {
				//System.out.println(arr[w][ww]);
				newarr[w] = arr[0][w] + "(" + arr[1][w] + ")";
				w++;
			}while(w<ar2);
			

		
//		System.out.println(Arrays.toString(newarr));
*/		
		
		
/*[응용문제]
 * 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은 번호를 더해서
 * 짝수,홀수 인지를 배열 결과 데이터로 재설정 하십시오.
 * ADATA {5, 17, 19, 22, 33}
 * BDATA {1, 2, 3, 4, 5}
 * RESULT = [짝수, 홀수, 짝수, 짝수, 짝수]
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
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
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
					result = "짝수";
				}
				
				else {
					result = "홀수";
				}
				
				result_data[f] = result;
				f++;
			}
		System.out.println(Arrays.toString(result_data));
		
		
		
		
		
		
	}

}
