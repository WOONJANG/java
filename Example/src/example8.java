import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		
		/*
		 * ���� ����ڰ� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 * ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46�� ������ ���ڸ� �Է����ּ���." 5��
		 * ����ڰ� �Է��� 5���� ���ڸ� �迭�� �����մϴ�. (main���� ó��)
		 * 
		 * �ܺ�Ŭ������ �̿��Ͽ� PC�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 * 5�� ���� pc�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ� class method�� ����)
		 * 
		 * ������ ��� method�� �ϳ� �� �����Ͽ� 
		 * ����ڰ� �Է��� 5���� �迭 �����Ϳ� pc�� ���� �迭 �����͸� �ش� method�� �����Ͽ�,
		 * ����Ͻÿ�.
		 * 
		 * ��, ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ��մϴ�.
		 * 
		 */
		//=====================����� �Է� 5ȸ �ݺ�========================
		Scanner sc = new Scanner (System.in);
		int dw=0;
		int input_number_user[] = new int [5]; //�����Է� ��迭 5��

		do{
			System.out.println("1��~46�� ������ ���ڸ� �Է����ּ���.");
			int innum = sc.nextInt();
			input_number_user[dw] = innum;
			dw++;
			}while(dw<5);
		//==========================�Է��� �迭��=========================

		//System.out.println(Arrays.toString(input_number_user));
		card n = new card();
		n.pcrd(input_number_user);
		
	}
	}	


		
		
		
	


class card{
	public void pcrd(int user[]) { //pc 5�� �������
		
//=======================pc ���� 5ȸ ���===============================
		Random rd = new Random();	
	
		int w = 0;
		int random_number_pc[] = new int[5]; //����� 5��
		 do{
			 random_number_pc[w] = rd.nextInt(45)+1;
			w++;
		}while (w<5);

			bcard(user, random_number_pc);
	}
	
	
//=================================================================
	
	

	
	
	
	

//=================================================================	
	public void bcard(int aaa[],int bbb[]) { //����� 5�� pc 5�� ���
		System.out.println(Arrays.toString(aaa));
		System.out.println(Arrays.toString(bbb));
	}
}
