import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		
		/*
		 * 다음 사용자가 복권 관련 프로그램은 요청하였습니다.
		 * 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 * "1~46번 사이의 숫자를 입력해주세요." 5번
		 * 사용자가 입력한 5개의 숫자를 배열로 생성합니다. (main에서 처리)
		 * 
		 * 외부클래스를 이용하여 PC가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 * 5개 뽑은 pc가 뽑은 5개의 숫자를 배열로 생성합니다. (외부 class method로 생성)
		 * 
		 * 별도의 결과 method를 하나 더 생성하여 
		 * 사용자가 입력한 5개의 배열 데잍터와 pc가 뽑은 배열 데이터를 해당 method로 전달하여,
		 * 출력하시오.
		 * 
		 * 단, 모든 사용하는 반복문은 무조건 do~while문으로 작성합니다.
		 * 
		 */
		//=====================사용자 입력 5회 반복========================
		Scanner sc = new Scanner (System.in);
		int dw=0;
		int input_number_user[] = new int [5]; //유저입력 빈배열 5개

		do{
			System.out.println("1번~46번 사이의 숫자를 입력해주세요.");
			int innum = sc.nextInt();
			input_number_user[dw] = innum;
			dw++;
			}while(dw<5);
		//==========================입력을 배열로=========================

		//System.out.println(Arrays.toString(input_number_user));
		card n = new card();
		n.pcrd(input_number_user);
		
	}
	}	


		
		
		
	


class card{
	public void pcrd(int user[]) { //pc 5개 랜덤출력
		
//=======================pc 랜덤 5회 출력===============================
		Random rd = new Random();	
	
		int w = 0;
		int random_number_pc[] = new int[5]; //빈공간 5개
		 do{
			 random_number_pc[w] = rd.nextInt(45)+1;
			w++;
		}while (w<5);

			bcard(user, random_number_pc);
	}
	
	
//=================================================================
	
	

	
	
	
	

//=================================================================	
	public void bcard(int aaa[],int bbb[]) { //사용자 5개 pc 5개 출력
		System.out.println(Arrays.toString(aaa));
		System.out.println(Arrays.toString(bbb));
	}
}
