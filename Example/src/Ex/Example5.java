package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*[���빮��]
		 * 
		 * ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�.
		 * ��, ����ڰ� ���ڸ� �Է��� ��� ���� ó���� ���� �Ǿ�� �մϴ�.
		 * �� ���� �Է��� 7���̸�, ����ڰ� �Է��� ���ڸ� ������������ �����մϴ�.
		 * 
		 * "���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�. : " - 7��
		 * ���� �Է½� ����ó��
		 * 
		 * 100 80 85 221 122 123 51 �� ���
		 * 
		 * [51, 80, 85, 100, 122, 123, 221]
		 * 
		 * �߰�
		 * 
		 * ¦���� Ȧ���� ������ �迭�� �����
		 * [80,100 122]
		 * [51, 85, 123,221]
		 * 
		 */
	//	input in = new input();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ex = new ArrayList();
		ArrayList<Integer> ex2 = new ArrayList();

		int ww = 0;
		do {
			System.out.println("�����Է�");
			try {
				Integer ck = Integer.valueOf(sc.next());
				if(ck%2==0) {
					ex.add(ck);
				}
				else {
					ex2.add(ck);
				}
			}catch(Exception e) {
				System.out.println("���ڸ��Է�");
			}
			ww++;
		}while(ww<7);
		Collections.sort(ex);
		System.out.println("¦�� : " + ex);
		Collections.sort(ex2);
		System.out.println("Ȧ�� : " + ex2);
	}
	
}
//class input{
////	public input() {
////		while(true) {
////		try {
////			int f =1 ;
////			if(f <= 7) {
////				
////				for(f=1; f<=7; f++) {
////					System.out.println("���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�. : ");
////					int inputnum = sc.nextInt();
////					ex.add(inputnum);
////			}
////				Collections.sort(ex);
////				System.out.println(ex);
////				
////			}
////		}catch(Exception e) {
////			System.out.println("���ڸ� �Է�");
////			
////		}
////	}
////	}
//
//
//}
