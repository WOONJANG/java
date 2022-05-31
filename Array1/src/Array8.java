import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
//		//정적배열
//		int a[] = new int [2];
//		a[0] =22;
//		a[1] = 31;
//		a[2] = 32;
//		
//		//동적배열
//		int b[] = {1,2,3,4};
//		int []c = {1,2,3,4,};
//		int [] d = new int[] {1,2,3,4}; 
//	}
		/* 2차 배열 [ ]  [] 
		 *    */
//	String member2 [][] = new String[3],[3];
		String member [] [] = {
			//				0			1				2	
			/*0*/		{"홍길동", "김유신", "유관순"},
			/*1*/		{"25", "31", "22"}
		};
		int ea = member.length; // 배열이 2개 !
		int data_ea = member[0].length; // 0번 줄의 데이터 객체 갯수!
//		System.out.println(data_ea);
//		System.out.println(member[1][2]);
		int f, ff;
		for(f=0; f<ea;f++) { //큰 반복문은 배열 갯수 만큼 loop.
//			System.out.println(Arrays.toString(member[f]));
			for(ff=0; ff<data_ea;ff++) { //작은 반복문은 배열에있는 데이터 갯수만큼 loop.
//				System.out.println(member[f][ff]));
			}
		}
		
		
		int [][] datas = {
				{1, 3, 5},
				{2, 4, 6 }
		};
		
		int fea = datas.length;
		int dea = datas[0].length;
		
		int w, ww;
		int total = 0;
		
		for(w=0; w<fea; w++) {
//			System.out.println(Arrays.toString(datas[w]));
			for(ww=0; ww<dea; ww++) {
//				System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
		}
		
//		System.out.println("총합계는 " +total);
	//====================================================================	
		/*[응용문제]
		 * 해당 데이터 배열에 있는 모든 값 중 짝수 값만 모두 더하시오.
		 * 1 data 11 42 22 16
		 * w data 7 33 10 29*/
		
		int[][] data0 = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int data1= data0.length;// 데이터 갯수
		int data2= data0[0].length; // 각 데이터당 갯수
		
		int a, aa;
		int total1=0;
/*		for문
		for(a=0; a<data1;a++) {
			for(aa=0; aa<data2;aa++) {
				if (data0[a][aa]%2==0) {
//			System.out.println(data0[a][aa]);
					total1 +=data0[a][aa];
				}
			}
		}
		System.out.println(total1);
*/
		//==============================================================
//		while문
/*		
		int ws=0;
		int tootal = 0;
		while(ws < data0.length) {
			int wws =0;
			while(wws < data0[ws].length) {
				if(data0[ws][wws]%2==0) {
					tootal += data0[ws][wws];
				}
				wws++;
			}
			ws++;
		}
		System.out.println(tootal);
*/		
// ===================================================================
//		do while문
		
		int ws=0;
		int toootal = 0;
		do {
			int wws = 0;
			do {
				if(data0[ws][wws]%2==0){
					
					toootal += data0[ws][wws];
				}
				wws++;
			}while(wws < data0[ws].length);
			ws++;
		}while(ws<data0.length);
		System.out.println(toootal);
		
		
		
		
	}

}
