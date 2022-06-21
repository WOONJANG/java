import java.io.IOException;

public class Exception4 {

	public static void main(String[] args)  {
		
		try {
		ex e = new ex();
		e.loader("ok");
		//자기자신을 바로 예외상황으로 만듦.
		Exception aaa = new Exception();
		throw aaa; //  자신을 호출하여 예외가 발생하면 자신을 호출한 
		}catch(Exception ee) {
			if (ee.getMessage() != null) {
				System.out.println(ee);
				
			}
		}
//		catch(IOException i) {
//		System.out.println(i);
//	}
		
	}

}

class ex {
	Exception ep = null;
//	IOException io = null;
	public void loader (String a) throws Exception { // throws try~catch를 받기위한 클래스를 로드
		/* 잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 방식*/
//		if(a == "ok") {
//			int keycode = Integer.valueOf(a); // 정상적이지만, loader class 자체적인 오류가 발생
//			
//		}
//		else {
//			// 해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우 
//			try {
//			}catch(NumberFormatException n) {
//				
//				this.ep = new Exception();
//				throw this.ep;
////			this.io = new IOException();
//			}
//			
//		}
		try {
			if (a == "ok") {
				int keycode = Integer.valueOf(a);

			} else {
				System.out.println("test");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.ep = new Exception(); // 자신의 오류 사항을 리턴 받아서 확인
			throw this.ep;
		}

	}
}