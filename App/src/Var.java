
public class Var {

	public static void main(String[] args) {
		//변수 : 지속적으로 변하는 수. 
		/*선언방식 : 
		 *1.변수만 선언
		 *2.변수 + 값을 같이 선언하는 방식
		 *3.변수확인 사항
		 */
		
		//1번
		String a1; //String = 문자 자료형(? 그 다음 파일 참조). a1 = 변수명 지정.
		a1 = "홍길동 입니다.";
		// = : 값을 넘겨주는 기호. == : 값 동일 기호.
		System.out.println(a1);
		//변수명을 만든 후, 값을 지정하여 넘겨주는 형태.
		
		//2번
		String b1 = "이순신 입니다.";
		System.out.println(b1);
		
		//3번 변수명이 동일 시, 기존에 가지고 있는 데이터는 삭제, 가장 최근 할당 값으로 출력. (a1)
		a1 = "이순신 입니다.";
		System.out.println(a1);
		
	}

}
