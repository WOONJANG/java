import java.util.Arrays;

public class Arrays10 {

	public static void main(String[] args) {
		
		int A1 [][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		
		//A1[0][0] + A1[1][0]
		//A1[0][1] + A1[1][1]

		int ea = A1[0].length; //�迭 ��ü �� 
		int ea2 = A1.length; // ������ ��
		
		int w = 0; //ū �ݺ��� �ε�����
		int newdata[] = new int [ea]; //���ο� �迭 ��ü
		while (w<ea) { // ū �ݺ��� 5����+�������� ����(�迭 ��ü��)
			int ww = 0;
			int total1=0, total2 =0; //������ ���� �̰� �޴� ��
			while(ww<ea2) { // ���� �ݺ��� 2����(�迭������2��(�׷�))
				if(ww==0) {
					total1 = A1[ww][w];
				}
				else {
					total2 = A1[ww][w];
				}
//				System.out.println(A1[ww][w]);
					
			ww++;
			}
			//���� �ݺ��� ������ ���ͼ� ù��° �迭�� + �ι�° �迭��
			newdata[w] = total1 + total2; //���ο� �迭 ��ü�� ���
			w++;
		}
			System.out.println(Arrays.toString(newdata));

	}

}
