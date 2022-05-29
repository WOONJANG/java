import java.util.Scanner;

public class Date2205250 {

	public static void main(String[] args) {

		//응용문제 2단 의 합을 코딩하라
		
		 int a; 
		 int b = 2; 
		 int c; 
		 int total = 0;
		 
		 for (a=1; a < 10; a++){ 
		 c = b*a; 
		 total += c; 
		 }
//		 System.out.printf("%d ",total);
		 
		
		
		
		//응용문제 입력된 구구단의 합을 코딩하라
	
	Scanner sc = new Scanner(System.in);
	System.out.println("어떤 구구단의 총 합을 원하십니까?");
	int ipgugu = sc.nextInt();
	int aa;
	int bb;
	int total2 = 0;
	
	for (aa=1; aa<=9; aa++) {
		bb= ipgugu * aa;
		total2 += bb;
		sc.close();
	}
	if (total2%2==0) {
		System.out.printf("입력하신 %d단의 총 합은 %d이며, 본 합계는 짝수입니다.", ipgugu, total2);
	}
	else {
		System.out.printf("입력하신 %d단의 총 합은 %d이며, 본 합계는 홀수입니다.", ipgugu, total2);
	}
	//System.out.printf("%d", total2);
	 
	
	}

}
