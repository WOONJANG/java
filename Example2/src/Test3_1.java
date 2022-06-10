
public class Test3_1 {

	public static void main(String[] args) {
		
		String a = "홍길동1";
		String b = "hong11";
		String c = "hong@email.com";
		
		//&& 무조건 조건이 전부 동일해야 함.
		if((a == "홍길동" && b == "hong") || (a == "홍길동" && c == "hong@email.com")) {
//			System.out.println("해당 사용자 정보를 확인 하였습니다.");
		}
		else {
//			System.out.println("해당 사용자 정보를 확인할 수 없습니다.");
		}
		// || 조건이 하나라도 맞으면 적용.
		if (a=="홍길동"|| b=="hong" || c=="hong@email.com") {
			System.out.println("해당 사용자 정보를 확인 하였습니다.");
		}
		else {
			System.out.println("해당 사용자 정보를 확인할 수 없습니다.");
		}
		
		int no = 24;
		if(no%2==0 && no%3 ==0) {
			System.out.println("2의 배수 및 3의 배수 모두 속합니다.");
		}
		else {
			System.out.println("해당값은 교집합에 포함 되지 않습니다.");
		}
	}
}
