import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
//		//�����迭
//		int a[] = new int [2];
//		a[0] =22;
//		a[1] = 31;
//		a[2] = 32;
//		
//		//�����迭
//		int b[] = {1,2,3,4};
//		int []c = {1,2,3,4,};
//		int [] d = new int[] {1,2,3,4}; 
//	}
		/* 2�� �迭 [ ]  [] 
		 *    */
//	String member2 [][] = new String[3],[3];
		String member [] [] = {
			//				0			1				2	
			/*0*/		{"ȫ�浿", "������", "������"},
			/*1*/		{"25", "31", "22"}
		};
		int ea = member.length; // �迭�� 2�� !
		int data_ea = member[0].length; // 0�� ���� ������ ��ü ����!
//		System.out.println(data_ea);
//		System.out.println(member[1][2]);
		int f, ff;
		for(f=0; f<ea;f++) { //ū �ݺ����� �迭 ���� ��ŭ loop.
//			System.out.println(Arrays.toString(member[f]));
			for(ff=0; ff<data_ea;ff++) { //���� �ݺ����� �迭���ִ� ������ ������ŭ loop.
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
		
//		System.out.println("���հ�� " +total);
	//====================================================================	
		/*[���빮��]
		 * �ش� ������ �迭�� �ִ� ��� �� �� ¦�� ���� ��� ���Ͻÿ�.
		 * 1 data 11 42 22 16
		 * w data 7 33 10 29*/
		
		int[][] data0 = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int data1= data0.length;// ������ ����
		int data2= data0[0].length; // �� �����ʹ� ����
		
		int a, aa;
		int total1=0;
/*		for��
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
//		while��
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
//		do while��
		
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
