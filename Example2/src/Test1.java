import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) { //Scanner + nextLine
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 : ");
		String adress = sc.nextLine();
		
		System.out.println("전화번호 : ");
		String phone_number = sc.nextLine();
		
		System.out.println("해당 정보를 확인해주세요\n주소 : " + adress + " 전화번호 : " + phone_number);
		
		sc.close();
	}
}
