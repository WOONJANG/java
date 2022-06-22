import java.util.ArrayList;

public class Exception7 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88 }
		 * 해당 데이터 값중 문자값만 출력 되도록 재 배열 하시오.
		 * 단, 메인에서는 해당 배열을 외부 클래스 (setter)로 전송
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열하여 생성합니다
		 * getter에서 해당 배열을 return으로 보내도록합니다.
		 * 단, 외부클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */

		try {
			redata rd = new redata();
			Object data[] = {"홍길동", 55, "유관순", "강감찬", 48, "이순신", "세종", 34, 88 };
			rd.setter(data);
			ArrayList result = rd.getter();	// return받는 값이 배열 class이므로 해당 class명으로 선언 후 받아야 된다..
			System.out.println(result);
		}catch(Exception z) {
			if(z.getMessage() != null) {
			System.out.println(z.getMessage());
			}
		}

	}
}
	class redata{
		ArrayList<String> ar = new ArrayList<String>();
//		ArrayList<Integer > ar2 = new ArrayList<Integer>();
		
		public void setter(Object call[]) throws Exception {
			int ea = call.length;
			for(int f=0; f < ea; f++) {
				try {
				//해당 배열을 로드시 (자료형) 변환을 하는 이유는 Object배열로 선언했기 때문.
				String check = String.valueOf((String)call[f]);
//				int check2 = Integer.valueOf((int)call[f]);

				ar.add(check);
//				ar2.add(check2);
				
				}catch(Exception ex) {
					// 자신 class 에서 문제 발생시 출력되는 catch문.
					// 단, throw 사용하면 다시main으로 전달된다.
					// 중요한 사항은 throw로 전달시 해당 반복문은 종료
					
					
				}
			}
//			System.out.println(this.ar);
		}
		public ArrayList<String> getter() {	//배열 class 이름으로 getter를 만들 수 있다.

			
			return this.ar;
			
		}
		
	}


